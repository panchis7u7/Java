package coleccionesexcepciones;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AgenciaGui extends javax.swing.JFrame implements Transporte, Serializable{
    private String nombre;
    File nombreArchivo;   
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;    
    //    private Vehiculo vehiculos[] = new Vehiculo[5];
    private ArrayList <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
  
    
    /** Creates new form AgenciaGui */
    public AgenciaGui() throws FileNotFoundException{
        super("Agencia Automotriz");
        initComponents();
    }
  
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextMarca = new javax.swing.JTextField();
        jTextModelo = new javax.swing.JTextField();
        jTextFDia = new javax.swing.JTextField();
        jTextFMes = new javax.swing.JTextField();
        jTextFAnio = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButtonLeerTexto = new javax.swing.JButton();
        jButtonLeerObjetos = new javax.swing.JButton();
        jButtonGuardarObjetos = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxTipo = new javax.swing.JCheckBox();
        jButtonAgregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marca\n");

        jLabel2.setText("Modelo");

        jLabel3.setText("Fecha");

        jLabel4.setText("Costo");

        jTextFDia.setText("1");

        jTextFMes.setText("1");

        jTextFAnio.setText("2009");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jButtonLeerTexto.setText("Leer de Texto");
        jButtonLeerTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeerTextoActionPerformed(evt);
            }
        });

        jButtonLeerObjetos.setText("Leer Objetos");
        jButtonLeerObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeerObjetosActionPerformed(evt);
            }
        });

        jButtonGuardarObjetos.setText("Guardar Objetos");
        jButtonGuardarObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarObjetosActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar Informe");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Dia\n");

        jLabel6.setText("Mes");

        jLabel7.setText("Año");

        jCheckBoxTipo.setText("Camioneta");

        jButtonAgregar.setText("Agregar Vehiculo");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jLabel8.setText("Carga");

        jTextFieldCarga.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jTextMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(jTextModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldCarga))
                                    .addComponent(jButtonAgregar))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMostrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonLeerTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLeerObjetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGuardarObjetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonLeerTexto)
                        .addGap(22, 22, 22)
                        .addComponent(jButtonLeerObjetos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jTextFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardarObjetos)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrar)
                    .addComponent(jCheckBoxTipo)
                    .addComponent(jButtonAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLeerTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeerTextoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonLeerTextoActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        // TODO add your handling code here:
        this.informe(area);//GEN-LAST:event_jButtonMostrarActionPerformed
    }

    private void jButtonLeerObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeerObjetosActionPerformed
        // TODO add your handling code here:
        leerDeArchivo();
    }//GEN-LAST:event_jButtonLeerObjetosActionPerformed

    private void jButtonGuardarObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarObjetosActionPerformed
        // TODO add your handling code here:
        guardarEnArchivo();//GEN-LAST:event_jButtonGuardarObjetosActionPerformed
    }

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        String marca = jTextMarca.getText();
        String modelo = jTextModelo.getText();
        byte dia = Byte.parseByte(jTextFDia.getText());
        byte mes = Byte.parseByte(jTextFMes.getText());
        short anio = Short.parseShort(jTextFAnio.getText());
        double costo = Double.parseDouble(jTextCosto.getText());
        if (jCheckBoxTipo.isSelected()==false)
            vehiculos.add(new Auto(marca, modelo, dia, mes, anio, costo));
        else {
            short carga = Short.parseShort(jTextFieldCarga.getText());
            vehiculos.add(new Camioneta(marca, modelo, dia, mes, anio,
                    costo, carga));
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    public boolean definirArchivo(boolean abrir){
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
      
        int resultado = abrir?selectorArchivo.showSaveDialog( null ):
            selectorArchivo.showOpenDialog( null );
        // si el usuario hizo clic en el botón Cancelar regresar
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
                vehiculos.add( ( Vehiculo ) entrada.readObject() );
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
            for (Vehiculo i : vehiculos)
               try {
                   salida.writeObject( (Vehiculo) i );
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
    private String encabezado(){
        return Util.formato("Tipo", ANCHO1)+Util.formato("Marca", ANCHO2)+
               Util.formato("Modelo", ANCHO2)+
               Util.formato("Fábrica", ANCHO2)+Util.formato("Costo", ANCHO3)+
               Util.formato("Precio", ANCHO3)+Util.formato("Carga", ANCHO2);
    }
    private String encabezado(String tab){
        return "Tipo"+tab+"Marca"+tab+"Modelo"+tab+"Fábrica"+tab+"Costo"+
               tab+"Precio"+tab+"Carga";    
    }
    public void leerDeArchivo(Scanner flujo)
           throws ArrayIndexOutOfBoundsException {
        nombre = flujo.next();
        for (int i = 0 ; flujo.hasNext(); i++){
            String tipo = flujo.next();
            if (tipo.compareToIgnoreCase("A")==0)
                try{
//                  vehiculos[i] = new Auto(flujo);
                    vehiculos.add(new Auto(flujo));
                }catch (InputMismatchException e){
//                  vehiculos[i] = new Auto();
                    vehiculos.add(new Auto());
                }
            else
                try {
//                  vehiculos[i] = new Camioneta(flujo);
                    vehiculos.add(new Camioneta(flujo));                    
                } catch (InputMismatchException e){
//                  vehiculos[i] = new Camioneta();
                    vehiculos.add(new Camioneta(flujo));                    
                } 
        }
    }
    public double calcularPrecio(){
        return costearInventario();
    }
    public void informe(JTextArea salida){
        salida.setText("\nAgencia automotriz "+nombre+"\n");
        mostrarVehiculos(salida);
        salida.append("\n\nCosto total del inventario "+
               Util.formato(costearInventario(), ANCHO3));
    }    
    public double costearInventario(){
        double costoTotal = 0.0;
        for (Vehiculo i : vehiculos)
            costoTotal += i.devolverCosto();
        return costoTotal;
    }   
    public void mostrarVehiculos(JTextArea salida){
        String tipo;
        salida.append("\nVehiculos\n");
        salida.append(encabezado("\t"));
        for (Vehiculo  i: vehiculos){
            if (i instanceof Auto)
                 tipo = "Automovil";
            else tipo = "Camioneta";     
            salida.append("\n"+Util.formato(tipo, ANCHO1)+"\t"+
                   i.toString("\t"));
        }
    }    

    public static void main(String args[]) throws FileNotFoundException{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()  {
                try {
                    new AgenciaGui().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AgenciaGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonGuardarObjetos;
    private javax.swing.JButton jButtonLeerObjetos;
    private javax.swing.JButton jButtonLeerTexto;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JCheckBox jCheckBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextFAnio;
    private javax.swing.JTextField jTextFDia;
    private javax.swing.JTextField jTextFMes;
    private javax.swing.JTextField jTextFieldCarga;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextModelo;
    // End of variables declaration//GEN-END:variables
    
}
