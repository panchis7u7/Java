package supermercado2;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Bebida extends Producto implements Serializable{
    private float precioUnidad;
    private short cantidad;
    
    Bebida(){
    }
    
    public Bebida(Scanner flujo){
        super(flujo);
        tipo = "Bebida";
    }
    
    public Bebida (String nombre, float precioKU, float cantidadKU, float descuento) {
        super(nombre, precioKU, cantidadKU, descuento);
        tipo = "Bebida";
    }
    
     public float descuento() {
        float descuentoNuevo = ((precioKU * cantidadKU) * (this.descuento/100));
        return descuentoNuevo;
    }
      
    @Override
    public float calcularPrecio() {
        float subTotal = ((precioKU+ (precioKU*IVA)) * cantidadKU)-descuento();
        return subTotal;
    }
    
    /*public String toString(){
        return Util.formato(nombre, ANCHO2) + 
               Util.formato(precioKU, ANCHO3) + 
               Util.formato(cantidadKU, ANCHO2)+ 
               Util.formato(descuento, ANCHO4)+ 
               Util.formato(calcularPrecio(), ANCHO3);       
    }

    public String mostrarDatos(String tab) {
        return Util.formato(nombre, ANCHO2) + tab +
               Util.formato(precioKU, ANCHO3) + tab +
               Util.formato(cantidadKU, ANCHO2)+ tab +
               Util.formato(descuento, ANCHO4)+ tab +
               Util.formato(calcularPrecio(), ANCHO3);   
    }*/
}
