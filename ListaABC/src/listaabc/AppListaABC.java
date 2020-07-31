package listaabc;

import java.io.FileNotFoundException;

public class AppListaABC {

    public static void main(String[] args) throws FileNotFoundException {
        Lista A,B,C;
        A = new Lista(true);
        B = new Lista(false);
        C = new Lista(true);
       	B.invertir(A);
        A.ver("Lista A");
        B.ver("Lista B");
        C.ver("Lista C");
        C.agregar(A);
        C.ver("Lista C con A");
    }
    
}
