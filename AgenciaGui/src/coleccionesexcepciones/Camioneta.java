
package coleccionesexcepciones;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Camioneta extends Vehiculo implements Transporte{
    private short carga;
    public Camioneta(){
        super();
        carga = 0;
    }
public Camioneta(String marca, String modelo, byte dia, byte mes, short anio,
        double costo, short carga){
        super(marca,modelo,dia,mes,anio,costo);
        this.carga = carga;
    }    
public Camioneta(Scanner flujo) throws InputMismatchException{
        super(flujo);
        carga = flujo.nextShort();
    }
    public String toString(){
        return super.toString()+Util.formato(carga, ANCHO1);
    }
 public String toString(String tab){
        return super.toString(tab)+tab+carga;
    }
}
