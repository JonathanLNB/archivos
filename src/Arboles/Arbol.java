package Arboles;

public class Arbol {
    private Nodo raiz;
    public void insertar(int llave, int posicion){
        Nodo nuevo;
        Nodo anterior = null;
        Nodo recorrido;
        if(raiz == null){
            raiz = new Nodo(llave, posicion);
            System.out.println("Nodo agregado: "+llave);
        }
        else{
            nuevo = new Nodo(llave, posicion);
            System.out.println("Nodo agregado: "+llave);
            recorrido = raiz;
            while (recorrido!=null){
                anterior = recorrido;
                if(recorrido.getLlave() > nuevo.getLlave())
                    recorrido = recorrido.getIzquierdo();
                else
                    recorrido = recorrido.getDerecho();
            }
            if(anterior.getLlave() > nuevo.getLlave())
                anterior.setIzquierdo(nuevo);
            else
                anterior.setDerecho(nuevo);
        }

    }

    public int buscar(int llave){
        int apuntador = 0;
        Nodo rec;
        Nodo ant;
        if(raiz == null)
            System.out.println("El árbol esta vacio");
        else{
            rec = raiz;
            ant = rec;
            while ((ant.getLlave()!=llave)&&(rec!=null)) {
                ant = rec;
                if (rec.getLlave() > llave)
                    rec = rec.getIzquierdo();
                else
                    rec = rec.getDerecho();
            }
            if(ant.getLlave() == llave){
                System.out.println("El valor se encuentra en el árbol: "+ant.getLlave());
                apuntador = ant.getDireccionl();
            }
            else
                System.out.println("El valor "+llave+" no se encuentra en el árbol");
        }
        return apuntador;
    }
}
