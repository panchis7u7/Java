package arboles_java;

public class Arboles_Java {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio arboles.");
        Arbol ar = new Arbol();             // Crea un nuevo arbol. (asignandole memoria con new).
        ar.raiz = ar.push(ar.raiz, 5);      // Añadir un nodo nuevo y actualizar la raiz.
        ar.raiz = ar.push(ar.raiz, 8);      // Si no devolvemos la raiz, esta se pierde.
        ar.raiz = ar.push(ar.raiz, 2);
        ar.raiz = ar.push(ar.raiz, 6);
        ar.raiz = ar.push(ar.raiz, 15);
        ar.raiz = ar.push(ar.raiz, 1);
        ar.raiz = ar.push(ar.raiz, 3);
        System.out.println();
        System.out.println("Pre-orden:");
        ar.preOrden(ar.raiz);
        System.out.println();
        System.out.println("In-orden:");
        ar.inOrden(ar.raiz);
        System.out.println();
        System.out.println("Post-orden:");
        ar.postOrden(ar.raiz);
        System.out.println();
        System.out.println();

        //Eliminar un nodo de un arbol.
        ar.raiz = ar.pop(ar.raiz, 8);
        System.out.println("Pre-orden:");
        ar.preOrden(ar.raiz);
        System.out.println();
        System.out.println("In-orden:");
        ar.inOrden(ar.raiz);
        System.out.println();
        System.out.println("Post-orden:");
        ar.postOrden(ar.raiz);
        System.out.println();
    } 
}