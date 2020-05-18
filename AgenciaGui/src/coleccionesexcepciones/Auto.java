
package coleccionesexcepciones;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Auto extends Vehiculo{
    public Auto(){
        super();
    }
public Auto(String marca, String modelo, byte dia, byte mes, short anio,
        double costo){
    super(marca,modelo,dia,mes,anio,costo);
    }    
public Auto(Scanner flujo) throws InputMismatchException{
        super(flujo);
    }
}
