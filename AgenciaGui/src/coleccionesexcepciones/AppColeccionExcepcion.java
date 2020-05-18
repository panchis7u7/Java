/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coleccionesexcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AppColeccionExcepcion {

   
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        JTextArea area = new JTextArea(20,80);
        area.setTabSize(7);
        JScrollPane areaSc = new JScrollPane(area);
        File archivo = new File ("AgenciaHer.txt");
        Scanner flujo = new Scanner(archivo);
//        try{
        Agencia obj = new Agencia();
//        obj.leerDeArchivo(flujo);
        obj.leerDeArchivo();
        obj.informe();
//        obj.guardarEnArchivo();
//        obj.informe(area);
//        }catch (ArrayIndexOutOfBoundsException err){
//            area.append("\n\nAdvertencia: Verifique la introduccion de los datos: Error :"+err);
//        }
//        JOptionPane.showMessageDialog(areaSc, areaSc);
    }
}
