package Libro2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Libro l = new Libro();
        l.escribirArchivoMaestro();
        System.out.println("Lectura del archivo maestro");
        l.leerArchivoSecuencialMaestro();
        l.leerArchivoAleatorioMaestro();
    }
}
