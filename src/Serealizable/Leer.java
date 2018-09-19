package Serealizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Leer {
    public void leerObjeto() throws IOException, ClassNotFoundException {
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("biblioteca3"));
        Creacion c []= new Creacion[5];
        for(int i = 0; i < c.length; i++){
            c[i] = (Creacion) archivo.readObject();
            c[i].mostrarInfo();
        }
        archivo.close();
    }
}
