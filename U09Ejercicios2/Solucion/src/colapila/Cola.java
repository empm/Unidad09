package colapila;

import java.util.LinkedList;

public class Cola {

    private LinkedList lista = null;

    public Cola() {
        lista = new LinkedList<>();
    }

    public void meter(Object ob) {
        lista.addLast(ob);
        //lista.offer(ob);
    }

    public Object sacar() {
        return lista.removeFirst();
    }

    public int tamano() {
        return lista.size();
    }

    public void mostrarCola() {

        int i = 0;

        System.out.println("Cola FIFO:");
        System.out.println("==============================================");
        for (Object s : lista) {
            System.out.print("Elemento " + i + ": ");
            System.out.println(s);
            i++;
        }
        System.out.println("==============================================");

    }
}
