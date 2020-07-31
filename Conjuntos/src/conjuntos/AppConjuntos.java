package conjuntos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AppConjuntos {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner leer = new Scanner(new File("Datos.txt"));
        Scanner flujo = new Scanner(System.in);
        byte numeroEliminar;
        byte x = (byte) (Math.random() * 10);
        byte y = (byte) (Math.random() * 10);
        System.out.println("x = " +x);
        System.out.println("y = "+y);
        /////////////////////////////////////////////////
        Conjunto setA = new Conjunto("Conjunto A"); 
        for (byte i = 0; i < x; i++){
            setA.encenderBit((byte)leer.nextInt());                     
        }
        /////////////////////////////////////////////////
        Conjunto setB = new Conjunto("Conjunto B");
        for (byte i = 0; i < y; i++){
            setB.encenderBit((byte)leer.nextInt());                     
        }
        /////////////////////////////////////////////////
        Conjunto setC = new Conjunto("Conjunto C");
        for (byte i = 0; i < y; i++){
            setC.encenderBit((byte)leer.nextInt());                     
        }
        /////////////////////////////////////////////////CONJUNTO UNIVERSO TOTAL
        Conjunto setU = new Conjunto("Conjunto Universo");
        for (byte i = 0; i < 32; i++){
            setU.encenderBit(i);                     
        }
        /////////////////////////////////////////////////
        Conjunto setU2 = setA.union(setB);
        System.out.print("" + setU2.verBits());
        System.out.println("" + setU2.verElementos());
        
        System.out.print("" + setU.verBits());
        System.out.println("" + setU.verElementos());
        
        System.out.print("" + setA.verBits());
        System.out.println("" + setA.verElementos());
        
        System.out.print("" + setB.verBits());
        System.out.println("" + setB.verElementos());
        
        System.out.print("" + setC.verBits());
        System.out.println("" + setC.verElementos());
        
        setB = setB.diferencia(setC);
        System.out.print("" + setB.verBits());
        System.out.println("" + setB.verElementos());
        
        
        /*
        Conjunto setR = setA.interseccion(setB);
        System.out.print("" + setR.verBits());
        System.out.println("" + setR.verElementos());
        
        Conjunto setD1 = setA.diferencia(setB);
        System.out.print("" + setD1.verBits());
        System.out.println("" + setD1.verElementos());
        
        Conjunto setD2 = setB.diferencia(setA);
        System.out.print("" + setD2.verBits());
        System.out.println("" + setD2.verElementos());
        
        System.out.println(setA.comparacion(setB));*/
        
        System.out.println("Que elemento del conjunto A quiere eliminar?" );
        numeroEliminar = flujo.nextByte();
        setA.apagarBit(numeroEliminar);
        System.out.print("" + setA.verBits());
        System.out.println("" + setA.verElementos());
        
        System.out.println("");
        System.out.println(setA.subConjunto(setB));
        System.out.println(setB.subConjunto(setA));
    }
}
