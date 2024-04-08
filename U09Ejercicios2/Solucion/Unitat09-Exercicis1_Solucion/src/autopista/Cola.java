/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopista;

import java.util.LinkedList;
import java.util.Scanner;

public class Cola {

    private String nombre;
    private LinkedList<Coche> c;

    public Cola(String nombre) {
        this.nombre = nombre;
        c = new LinkedList<>();
    }

    public void ponerseEnCola() {
        Scanner teclado = new Scanner(System.in);
        String mat, mod, col;
        System.out.println("Matricula:");
        mat = teclado.nextLine();
        System.out.println("Modelo:");
        mod = teclado.nextLine();
        System.out.println("Color:");
        col = teclado.nextLine();
        Coche co = new Coche(mat, mod, col);
        c.addLast(co);
        System.out.println("Añadido... ");
        System.out.println("... a la cola " + this.nombre);
        co.mostrar();
    }

    public void quitarPrimero() {
        if (c.size() != 0) {
            System.out.println("Eliminando... ");
            c.getFirst().mostrar();
            c.removeFirst();
        } else {
            System.out.println("La cola está vacía");
        }
    }

    public void mostrarLista() {
        for (Coche co : c) {
            co.mostrar();
        }
       
    }

    public String getNombre() {
        return nombre;
    }
}
