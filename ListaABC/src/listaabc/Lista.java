package listaabc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lista {
    File archivo = new File("Datos.txt");
    static byte contador = 0;
   
    public Lista(boolean pedir) throws FileNotFoundException{
        Scanner flujo = new Scanner(archivo);
        if (!pedir)return;
        short ne;
        if (contador > 0){
            for (int i = 0; i < contador; i++) {
                flujo.nextShort();
            }
        ne = flujo.nextShort();
        ar = new int[ne];
            for (int i = 0; i < ne; i++) {
                ar[i] = flujo.nextInt();
                contador++;
            }
        } else {
        ne = flujo.nextShort();
        ar = new int[ne];
        for (int i=0; i<ne; i++){
                ar[i] = flujo.nextInt();
                contador++;
        }
        }
    }
    public void invertir(Lista dos) {
        ar = new int[dos.ar.length];
        for (int i=0; i<ar.length; i++)
                ar[i] = dos.ar[ar.length-i-1];
    }
    public void ver(String mensaje) {
        System.out.println(mensaje);
        //System.out.print("\n" + id + "\n");
        for (int i=0; i<ar.length; i++)
            System.out.print(ar[i] + "  ");
         System.out.println();
         System.out.println();
    }
    
    public void agregar(Lista Agre) throws FileNotFoundException{
        Lista tmp = new Lista (false);
        tmp.ar = ar;
        ar = new int[tmp.ar.length + Agre.ar.length];
        System.arraycopy(tmp.ar, 0, ar, 0, tmp.ar.length);
        System.arraycopy(Agre.ar, 0, ar, tmp.ar.length, Agre.ar.length);
    }
    
    public void suma(Lista uno, Lista dos){
        ar = new int[dos.ar.length];
        for(int i=0;i<ar.length;i++){
            ar[i] = uno.ar[i] + dos.ar[i];
        }
        System.out.println();
    }
    private int ar[];private String id;

}
