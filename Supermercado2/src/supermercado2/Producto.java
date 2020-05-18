package supermercado2;
import java.io.*;
import java.util.*;
import javax.swing.*;

public abstract class Producto implements Alimentos, Serializable{
    protected String nombre;
    protected float precioKU;
    protected float cantidadKU;
    protected float descuento;
    protected String tipo;
    String msg;
    
    public Producto(){
        nombre = "Nombre del producto";
        precioKU = 0.0f;
    }
    
    public Producto (String nombre, float precioKU, float cantidadKU, float descuento){
        this.nombre = nombre;
        this.precioKU = precioKU;
        this.cantidadKU = cantidadKU;
        this.descuento = descuento;
    }
    
        public Producto(Scanner flujo) throws InputMismatchException{
        nombre = flujo.next();
        precioKU = flujo.nextFloat();
        cantidadKU = flujo.nextFloat();
    }
        
    public String regresarTipo(){
            return tipo;
        }
    
    public String toString(){
        return Util.formato(nombre, ANCHO2) + 
               Util.formato(precioKU, ANCHO3) +
               Util.formato(cantidadKU, ANCHO2)+ 
               Util.formato(descuento, ANCHO4) + "%"+
               Util.formato(calcularPrecio(), ANCHO3);       
    }
    
        public String mostrarDatos(String tab){
        return Util.formato(nombre, ANCHO1) + tab +
               Util.formato(precioKU, ANCHO1) + tab +
               Util.formato(cantidadKU, ANCHO2)+ tab + 
               Util.formato(descuento, ANCHO3) + tab +
               Util.formato(calcularPrecio(), ANCHO2);       
    
    }
}
