/*
 * Desarrollar la implementación de una pila LIFO (Last Input First Output) 
 * y de una cola FIFO (First Input First Output).
 * Nos basaremos en la clase java.util.LinkedList.
 * Las implementaciones deben ser genéricas, es decir, deben aceptar cualquier tipo de objeto.
 * La clase Ejecución tiene un método main en el que se crearán un objeto Pila 
 * y un objeto Lista. Se les añadiráb los mismos elementos y en el mismo orden 
 * y luego se mostrarán por pantalla en el orden que los devuelvan cada una.
 */
package colapila;

public class Ejecucion {

    public static void main(String[] args) {

        String[] array_cadenas = {"Elefante", "Cocodrilo", "León", "Jirafa", "Hipopótamo"};

        // Creamos Cola y Pila
        Cola miCola = new Cola();
        Pila miPila = new Pila();

        //Ahora agregamos todos los elementos a la lista.
        for (int i = 0; i < array_cadenas.length; i++) {
            miCola.meter(array_cadenas[i]);
            miPila.meter(array_cadenas[i]);
        }
        //Y ahora mostramos los elementos de la cola FIFO y de la pila LIFO.
        miCola.mostrarCola();
        miPila.mostrarPila();

        //Ahora quitamos los elementos y enseñaamos el orden de desquite por pantalla.
        System.out.println("\n\nQUITAMOS LOS ELEMENTOS DE FIFO Y LIFO:");

        System.out.println("\nElementos quitados de la cola FIFO: ");

        //Guardaamos el tamaño de FIFO y LIFO, porque al ir quitando 
        //elementos el tamaño de la lista se va reduciendo, y el for terminaría antes.
        int longCola = miCola.tamano();
        int longPila = miPila.tamano();

        for (int i = 0; i < longCola; i++) {

            System.out.println(miCola.sacar() + ".  Quedan "+miCola.tamano());
        }

        System.out.println("\nElementos quitados de la pila LIFO: ");

        for (int i = 0; i < longPila; i++) {

            System.out.println(miPila.sacar()+".  Quedan "+miPila.tamano());
        }

    }

}
