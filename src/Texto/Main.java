package Texto;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArchivoT archivoT = new ArchivoT();
        archivoT.escribir();
        archivoT.leer();
    }
}
