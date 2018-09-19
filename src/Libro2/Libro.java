package Libro2;

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
        StringBuffer bf;
        System.out.println("Archivo Maestro");
        RandomAccessFile archivo= new RandomAccessFile("biblioteca2", "rw");
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Clave del libro <<Entero>>: ");
            llave = entrada.nextInt();
            archivo.writeInt(llave);
            System.out.println("Nombre del libro <<Caracteres Sin Espacio>>: ");
            nom= entrada.next();
            bf = new StringBuffer(nom);
            bf.setLength(15);
            archivo.writeChars(bf.toString());
            System.out.println("Calificación del libro <<Real>>: ");
            calificacion = entrada.nextDouble();
            archivo.writeDouble(calificacion);
            System.out.println("¿Otro Libro?: Si =1, No = 0 ");
            n = entrada.nextInt();
        }
        while(n == 1);
        archivo.close();
    }
    public void leerArchivoSecuencialMaestro() throws IOException{
        String aux;
        long apActual, apFinal;
        char nombre[], temp;
        RandomAccessFile leer= new RandomAccessFile("biblioteca2", "r");
        while ((apActual = leer.getFilePointer())!=(apFinal = leer.length())){
            llave = leer.readInt();
            System.out.println("Llave: "+llave);
            nombre = new char[15];
            for (int i = 0; i<nombre.length; i++){
                temp=leer.readChar();
                nombre[i]=temp;
            }
            aux = new String(nombre).replace('\0',' ');
            System.out.println("Nombre: "+aux);
            calificacion = leer.readDouble();
            System.out.println("Calificación: "+calificacion);
        }
        leer.close();
    }
    public void leerArchivoAleatorioMaestro() throws IOException{
        int n, dl;
        char nombre[] = new char[15], temp;
        long lreg, desplaza;
        RandomAccessFile leer= new RandomAccessFile("biblioteca2", "r");
        Scanner entrada = new Scanner(System.in);
        leer.readInt();
        for(int i = 0; i < nombre.length; i++){
            nombre[i] = leer.readChar();
        }
        leer.readDouble();
        lreg = leer.getFilePointer();
        do{
            System.out.println("\nIntroduce la dirección lógica del registro: ");
            dl = entrada.nextInt();
            desplaza = (dl-1)*lreg;
            leer.seek(desplaza);
            llave = leer.readInt();
            System.out.println("Llave: "+llave);
            nombre = new char[15];
            for (int i = 0; i<nombre.length; i++){
                temp=leer.readChar();
                nombre[i]=temp;
            }
            new String(nombre).replace('\0',' ');
            System.out.println("Nombre: "+nombre);
            calificacion = leer.readDouble();
            System.out.println("Calificación: "+calificacion);
            System.out.println("¿Otro Libro?: Si =1, No = 0 ");
            n = entrada.nextInt();
        }while(n == 1);

        leer.close();
    }
}
