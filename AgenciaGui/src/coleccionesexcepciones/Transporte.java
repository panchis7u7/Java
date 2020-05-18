/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coleccionesexcepciones;

/**
 *
 * @author FAM GUZMAN
 */
public interface Transporte {
    int ANCHO1=10, ANCHO2=15, ANCHO3=20, ANCHO4=25, ANCHO5=30;
    public static final float UTILIDAD = 0.08f, IVA = 0.15f;      
    public abstract double calcularPrecio();

}
