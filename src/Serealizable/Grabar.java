package Serealizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Grabar {
    private int llave;
    private String nombre;
    private double calificacion;

    public void grabarObjeto() throws IOException {
        Creacion c;
        int n;
        Scanner entrada = new Scanner(System.in);
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("biblioteca3"));
        System.out.println("Captura la informaciòn de 5 libros");
        for(int i = 0; i < 5; i++) {
            System.out.println("Introduce la llave del libro: ");
            llave = entrada.nextInt();
            System.out.println("Introduce el nombre del libro: ");
            nombre = entrada.next();
            System.out.println("Introduce la calificacion del libro: ");
            calificacion = entrada.nextDouble();
            c = new Creacion(llave, nombre, calificacion);
            archivo.writeObject(c);
        }
        archivo.close();
    }
}
