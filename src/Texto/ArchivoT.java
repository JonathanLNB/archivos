package Texto;

import java.io.*;
import java.util.Scanner;

public class ArchivoT {
    public void escribir() throws IOException{
        int x [] = new int [5];
        Scanner entrada = new Scanner(System.in);
        FileWriter archivo = new FileWriter("texto.dato");
        PrintWriter archivoE = new PrintWriter(archivo);
        System.out.println("Escribe 5 numeros: ");
        for (int i = 0 ; i< 5; i++){
            x[i] = entrada.nextInt();
            archivoE.println(x[i]);
        }
        archivoE.close();
    }
    public void leer() throws IOException{
        int y [] = new int[5];
        FileReader archivo = new FileReader("texto.dato");
        BufferedReader archivoL = new BufferedReader(archivo);
        for(int i = 0; i<5; i++){
            y[i] = Integer.parseInt(archivoL.readLine());
            System.out.println("Datos Leidos: "+y[i]);
        }
        archivoL.close();
    }
}
