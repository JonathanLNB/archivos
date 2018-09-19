package Arboles;

public class Nodo {
    private int llave;
    private int direccionl;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(int llave, int direccionl, Nodo izquierdo, Nodo derecho) {
        this.llave = llave;
        this.direccionl = direccionl;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public Nodo(int llave, int direccionl) {
        this.llave = llave;
        this.direccionl = direccionl;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public int getLlave() {
        return llave;
    }

    public int getDireccionl() {
        return direccionl;
    }

    public Nodo getIzquierdo(){
        return izquierdo;
    }

    public Nodo getDerecho(){
        return derecho;
    }
}
