package arboles_java;


public class Arbol {
    public Nodo raiz;

        public Arbol()
        {
            this.raiz = null;
        }

        public Nodo push(Nodo _raiz, int dato)
        {
            Nodo raiz = _raiz;      //Respaldamos la raiz para no perderla al recorrer el arbol.
            if(raiz == null)        //Si es el dato =>
            {
                Nodo nuevo = new Nodo(dato);    //Asignamos memoria a un nuevo nodo.
                raiz = nuevo;
                raiz.izq = null;
                raiz.der = null;
                return raiz;
            } else {
                if(dato < raiz.dato)        //Si el dato es menor, vayamos al lado izq.
                {
                    raiz.izq = push(raiz.izq, dato);
                    return raiz;
                } else {
                    if(dato > raiz.dato)    //Si el dato es mayor, vayamos al lado der.
                    {
                        raiz.der = push(raiz.der, dato);
                        return raiz;
                    } else {            //Si el dato es duplicado, mandemos un mensaje.
                        System.out.println("Valores duplicados!");
                        return raiz;
                    }
                }
            }
        }

        public Nodo pop(Nodo _raiz, int dato)
        {
            Nodo raiz = _raiz;
            if(raiz == null)        //Checar si el arbol esta vacio.
            {
                return raiz;
            } else {
                if(raiz.izq.dato == dato)   //Si el arbol no esta vacio y es el nodo que buscamos (del lado izq) =>
                {
                    if (raiz.izq.izq != null && raiz.izq.der != null)   //verificar el nodo izquierdo y derecho del nodo que queremos eliminar no es nulo.
                    {                                                   //Si no es nulo, hacer una rotacion en sentido de reloj y eliminar nodo.
                        raiz.izq.izq.der = raiz.izq.der;
                        raiz.izq = raiz.izq.izq;
                        return raiz;
                    } else if (raiz.izq.der == null && raiz.izq.izq != null) {      //Si el nodo derecho del objetivo es nulo, pero el izquierdo no lo es =>
                        raiz.izq = raiz.izq.der;                                    //eliminar nodo y asignar el nodo previo del objetivo al nodo restante.
                        return raiz;
                    } else {                                        //Si no hay ramas del lado izq/der del nodo a eliminar, simplemente igualar la raiz->izq a nulo.
                        raiz.izq = null;
                        return raiz;
                    }
                } else if (raiz.der.dato == dato)   //Si el arbol no esta vacio y es el nodo que buscamos (del lado izq) =>
                {
                    if (raiz.der.izq != null && raiz.der.der != null)   //verificar el nodo izquierdo y derecho del nodo que queremos eliminar no es nulo.
                    {                                                   //Si no es nulo, hacer una rotacion en sentido de reloj y eliminar nodo.
                        raiz.der.der.izq = raiz.der.izq;
                        raiz.der = raiz.der.der;
                        return raiz;
                    }  else if (raiz.der.izq == null && raiz.der.der != null) {     //Si el nodo derecho del objetivo es nulo, pero el izquierdo no lo es =>
                        raiz.der = raiz.der.der;                                    //eliminar nodo y asignar el nodo previo del objetivo al nodo restante.
                        return raiz;
                    } else  {                                       //Si no hay ramas del lado izq/der del nodo a eliminar, simplemente igualar la raiz->izq a nulo.
                        raiz.der = null;
                        return raiz;
                    }
                } else {                                        //Si no se encontro el dato, revisemos el nodo que sigue.
                    raiz.der = pop(raiz, dato);         
                    raiz.izq = pop(raiz, dato);
                    return raiz;
                }
            }
        }

        public void preOrden(Nodo _raiz)
        {
            Nodo raiz = _raiz;
            if(raiz == null)
            return;

            System.out.print("[" + raiz.dato + "] ");
            preOrden(raiz.izq);
            preOrden(raiz.der);
            return;
        }

        public void inOrden(Nodo _raiz)
        {
            Nodo raiz = _raiz;
            if (raiz == null)
                return;

            inOrden(raiz.izq);
            System.out.print("[" + raiz.dato + "] ");
            inOrden(raiz.der);
            return;
        }

        public void postOrden(Nodo _raiz)
        {
            Nodo raiz = _raiz;
            if (raiz == null)
                return;

            postOrden(raiz.izq);
            postOrden(raiz.der);
            System.out.print("[" + raiz.dato + "] ");
            return;
        }
}
