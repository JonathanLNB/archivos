package Binario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArchivoB {
    public void escribir() throws IOException {
        int x [] = new int[5];
        Scanner entrada = new Scanner(System.in);
        FileWriter archivo = new FileWriter("binario.dato");
        System.out.println("Escribe 5 numeros: ");
        for(int i = 0; i<5; i++){
            x[i] = entrada.nextInt();
            archivo.write(x[i]);
        }
        archivo.close();
    }

    public void leer() throws IOException{
        int y [] = new int[5];
        FileReader archivo = new FileReader("binario.dato");
        BufferedReader archivoL = new BufferedReader(archivo);
        for(int i = 0; i<5; i++){
            y[i] = archivoL.read();
            System.out.println("Datos Leidos: "+y[i]);
        }
        archivoL.close();
    }
}
