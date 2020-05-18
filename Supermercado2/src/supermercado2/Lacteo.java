package supermercado2;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Lacteo extends Producto implements Serializable{

    public Lacteo(){
    }
    
    public Lacteo(Scanner flujo){
        super(flujo);
        tipo = "Lacteo";
    }

    public Lacteo (String nombre, float precioKU, short cantidadKU, float descuento) {
        super(nombre, precioKU, cantidadKU, descuento);
        tipo = "Lacteo";
    }
     
     public float descuento() {
        float descuentoNuevo = ((precioKU * cantidadKU) * (this.descuento/100));
        return descuentoNuevo;
    }
    
    @Override
    public float calcularPrecio() {
        float subTotal = ((precioKU+(precioKU*IVA)) * cantidadKU)-descuento();
        return subTotal;
    }
    
    /*public String toString(){
        return Util.formato(nombre, ANCHO2) + 
               Util.formato(precioKU, ANCHO3) + 
               Util.formato(cantidadKU, ANCHO2) + 
               Util.formato(descuento, ANCHO4) + 
               Util.formato(calcularPrecio(), ANCHO3);       
    }

    public String mostrarDatos(String tab) {
        return Util.formato(nombre, ANCHO2) + tab +
               Util.formato(precioKU, ANCHO3) + tab +
               Util.formato(cantidadKU, ANCHO2) + tab +
               Util.formato(descuento, ANCHO4) + tab +
               Util.formato(calcularPrecio(), ANCHO3);  
    }*/
}
