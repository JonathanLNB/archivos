package Serealizable;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Grabar libro = new Grabar();
        libro.grabarObjeto();
        Leer leer = new Leer();
        System.out.println("Lectura de archivo Maestro\n");
        leer.leerObjeto();
    }
}
