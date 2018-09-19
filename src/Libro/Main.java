package Libro;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    Libro lib = new Libro();
    lib.escribirArchivoMaestro();
    System.out.println("Lectura del archivo maestro\n");
    lib.leerArchivoMaestro();
    }
}
