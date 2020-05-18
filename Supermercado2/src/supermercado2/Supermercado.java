package supermercado2;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Supermercado implements Alimentos, Serializable{
    private String nombre;
    File nombreArchivo;   
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;    
    private ArrayList <Producto> productos = new ArrayList<Producto>();

    public Supermercado(String nombre, Scanner flujo){
        this.nombre = nombre;
        leerDeArchivo(flujo);
        lista();
    }
    
    public void lista(){
        System.out.println("\nSupermercado "+nombre+"\n");    
        mostrarLista("Verdura", encabezadoKg());   //Se manda un objeto, para señalar que tipo de objetos se quieren mostrar
        mostrarLista("Carne", encabezadoKg());
        mostrarLista("Lacteo", encabezadoCan());
        mostrarLista("Bebida", encabezadoCan());
        System.out.println("\n\nCosto total de la lista: "+
               Util.formato(costearInventario(), ANCHO4));
    }
    
    private String encabezadoKg(){
        return Util.formato("Producto", ANCHO2)+
               Util.formato("Precio por kg", ANCHO3)+
               Util.formato("Peso en kg", ANCHO2)+
               Util.formato("Descuento adicional", ANCHO4)+
               Util.formato("SubTotal", ANCHO3);
    }
    
    private String encabezadoCan(){
        return Util.formato("Producto", ANCHO2)+
               Util.formato("Precio por unidad", ANCHO3)+
               Util.formato("Cantidad", ANCHO2)+
               Util.formato("Descuento adicional", ANCHO4)+
               Util.formato("SubTotal", ANCHO3);
    }
 
    public void leerDeArchivo(Scanner flujo){
        //this.nombre = nombre;
        for (int i = 0; flujo.hasNext(); i++) {
            String tipo = flujo.next();
            if (tipo.compareToIgnoreCase("V") == 0) {
                productos.add(new Verdura(flujo));
            } else if (tipo.compareToIgnoreCase("C") == 0) {
                productos.add( new Carne(flujo));
            } else if(tipo.compareToIgnoreCase("L") == 0) {
                productos.add(new Lacteo(flujo));
            }else if (tipo.compareToIgnoreCase("B") == 0){
                productos.add(new Bebida(flujo));
            } else {
                  System.out.println("\nOcurrio un eror al leer el departamento!");
            }
        }
    }
    
    public float calcularPrecio(){
        return costearInventario();
    }
    
    public float costearInventario(){
        float precioTotal = 0.0f;
        for (Producto i : productos)
            precioTotal += i.calcularPrecio();
        return precioTotal;
    }   
    
    public void mostrarLista(String tipo, String encabezado){ //muestra todos los articulos de su respectivo apartamento
        System.out.println("\n" /*+ "Departamento de "*/ + tipo.concat("s") + "\n" + encabezado);
        for (Producto  i: productos){
            if (tipo.compareToIgnoreCase(i.tipo) == 0)
            System.out.println(i);
        }
    }

      public boolean definirArchivo(boolean abrir){
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
      
        int resultado = abrir?selectorArchivo.showSaveDialog( null ):
            selectorArchivo.showOpenDialog( null );
       if ( resultado == JFileChooser.CANCEL_OPTION )
            return false;

        nombreArchivo = selectorArchivo.getSelectedFile(); 
        // mostrar error si es inválido
        if ( nombreArchivo == null || nombreArchivo.getName().equals( "" ) ){
            JOptionPane.showMessageDialog( null, "Nombre de archivo inválido", 
            "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE );
            return false;
        }
        return true;
    }
    
    public void leerDeArchivo() {                                              
       if (this.definirArchivo(false)){
            try {
            entrada = new ObjectInputStream(new FileInputStream(nombreArchivo));
         }
         catch ( IOException excepcionES ) {
            JOptionPane.showMessageDialog( null, "Error al abrir el archivo", 
            "Error", JOptionPane.ERROR_MESSAGE );
            return;
         }
         boolean band = true;
         while (band) {
             try {
                productos.add( ( Producto ) entrada.readObject() );
            }
            catch ( EOFException excepcionFinDeArchivo ) {
                band = false;
            }
            catch ( IOException excepcionES ) {
                JOptionPane.showMessageDialog( null,
                "Error al leer del archivo"+excepcionES,
                "Error de lectura", JOptionPane.ERROR_MESSAGE );
                return;
            }
            catch ( ClassNotFoundException excepcionClaseNoEncontrada ) {
                JOptionPane.showMessageDialog(null,"No se pudo crear el objeto",
                "Clase no encontrada", JOptionPane.ERROR_MESSAGE );
                return;
            }
         }
         try {
             entrada.close();
         }
         catch( IOException excepcionES ) {
             JOptionPane.showMessageDialog( null, "Error al cerrar el archivo", 
             "Error", JOptionPane.ERROR_MESSAGE );
             System.exit( 1 );
         }
        }
    }
    
    public void guardarEnArchivo() {                                               
       if (this.definirArchivo(true)){
            try {
                salida = new ObjectOutputStream(
                         new FileOutputStream( nombreArchivo ) );
            }
            catch ( IOException excepcionES ) {
                JOptionPane.showMessageDialog(null,"Error al abrir el archivo", 
                "Error", JOptionPane.ERROR_MESSAGE );
            }
            for (Producto i : productos)
               try {
                   salida.writeObject( (Producto) i );
                   salida.flush();
               }
               catch ( IOException excepcionES ) {
                   JOptionPane.showMessageDialog( null,
                   "Error al escribir en el archivo"+excepcionES,
                   "Excepción de ES", JOptionPane.ERROR_MESSAGE );
               }
            try {
                salida.close();
            }
            catch( IOException excepcionES ) {
                JOptionPane.showMessageDialog(null,"Error al cerrar el archivo", 
                "Error", JOptionPane.ERROR_MESSAGE );
                System.exit( 1 );
            }
       }
    }
}
