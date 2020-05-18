package supermercado2;
import java.io.*;
import java.util.*;
import javax.swing.*;

public interface Alimentos {
    int ANCHO1=10, ANCHO2=15, ANCHO3=20, ANCHO4=25, ANCHO5=30;
    public static final float IVA = 0.15f, descuentoKilo = 3.5f;  
    public static final short descuentoCan = 8;
    public abstract float calcularPrecio();
}
