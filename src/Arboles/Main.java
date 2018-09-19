package Arboles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int llave, pos;
        Scanner leer = new Scanner(System.in);
        Arbol arbol = new Arbol();
        for(int i = 0; i<5;i++)
            arbol.insertar(i+100, i+1);
        do{
            System.out.println("Introduce una llave (100 ... 104) Elige 0 para salir");
            llave = leer.nextInt();
            pos = arbol.buscar(llave);
            if(pos!=0)
                System.out.println("La posición es: "+pos);
        }while (llave!=0);
        System.out.println("Adíos :3");
    }
}
