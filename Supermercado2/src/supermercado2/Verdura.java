package supermercado2;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Verdura extends Producto implements Serializable{
    
    Verdura() {
    }
    
    
    public Verdura(Scanner flujo){
        super(flujo);
        tipo = "Verdura";
    }

    Verdura(String nombre, float precioKU, float cantidadKU, float descuento) {
        super(nombre, precioKU, cantidadKU, descuento);
        tipo = "Verdura";
    }
    
    public float descuento() {
        float descuentoNuevo = ((precioKU * cantidadKU) * (this.descuento/100));
        return descuentoNuevo;
    }
    
     @Override
    public float calcularPrecio() {
        float subTotal = (precioKU * cantidadKU)- descuento();
        return subTotal;
    }

/*    public String toString(){
        return Util.formato(nombre, ANCHO2) + 
               Util.formato(precioKU, ANCHO3) +
               Util.formato(cantidadKU, ANCHO2)+ 
               Util.formato(descuento, ANCHO4) +
               Util.formato(calcularPrecio(), ANCHO3);       
    }
    
    public String mostrarDatos(String tab){
        return Util.formato(nombre, ANCHO2) + tab +
               Util.formato(precioKU, ANCHO2) + tab +
               Util.formato(cantidadKU, ANCHO1)+ tab +
               Util.formato(descuento, ANCHO3) + tab +
               Util.formato(calcularPrecio(), ANCHO2);       
    
    }*/
}
