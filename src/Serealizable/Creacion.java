package Serealizable;

import java.io.Serializable;

public class Creacion implements Serializable {
    private int llave;
    private String nombre;
    private double calificacion;

    public Creacion(int llave, String nombre, double calificacion) {
        this.llave = llave;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public void mostrarInfo(){
        System.out.println("Clave del libro: "+llave);
        System.out.println("Nombre del libro: "+nombre);
        System.out.println("Calificación del libro: "+calificacion);
    }
}
