package Libro;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Libro {
    private int llave;
    private double calificacion;
    private String nom;
    public void escribirArchivoMaestro() throws IOException {
        int n;
        System.out.println("Archivo Maestro");
        DataOutputStream archivo = new DataOutputStream(new FileOutputStream("biblioteca"));
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Clave del libro <<Entero>>: ");
            llave = entrada.nextInt();
            archivo.writeInt(llave);
            System.out.println("Nombre del libro <<Caracteres Sin Espacio>>: ");
            nom= entrada.next();
            archivo.writeUTF(nom);
            System.out.println("Clasificación del libro <<Real>>: ");
            calificacion = entrada.nextDouble();
            archivo.writeDouble(calificacion);
            System.out.println("Presiona 1 para el siguiente libro: ");
            n = entrada.nextInt();
        }
        while(n == 1);
        archivo.close();
    }
    public void leerArchivoMaestro() throws IOException{
        long apActual, apFinal;
        RandomAccessFile leer= new RandomAccessFile("biblioteca", "r");
        while ((apActual = leer.getFilePointer())!=(apFinal = leer.length())){
            llave = leer.readInt();
            System.out.println("Llave: "+llave);
            nom = leer.readUTF();
            System.out.println("Nombre: "+nom);
            calificacion = leer.readDouble();
            System.out.println("Calificación: "+calificacion);
        }
        leer.close();
    }
}
