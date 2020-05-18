package supermercado2;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Supermercado2 implements Serializable {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File ("Datos.txt");
        Scanner flujo = new Scanner(archivo);
        JTextArea area = new JTextArea(20,80);
        area.setTabSize(7);
        JScrollPane areaSc = new JScrollPane(area);                    //cambiar archivo
//        try{
        Supermercado obj = new Supermercado("Hola", flujo);
//        obj.lista(flujo);
//      obj.leerDeArchivo();
//      obj.guardarEnArchivo();
//      obj.informe(area);
//          } catch (ArrayIndexOutOfBoundsException err){
//            area.append("\n\nAdvertencia: Verifique la introduccion de los datos: Error :"+err);
//        }
//        JOptionPane.showMessageDialog(areaSc, areaSc);
    } 
}