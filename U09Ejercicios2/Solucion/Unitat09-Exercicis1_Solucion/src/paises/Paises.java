/*
 * 1.- Desarrollar el ArrayList listaPaises visto en los ejemplos del tema.
 */
package paises;

import java.util.ArrayList;
import java.util.Iterator;

public class Paises {

    public static void main(String[] args) {

        int i;
        ArrayList<String> listaPaises = new ArrayList<>();

        listaPaises.add("Espanya");
        listaPaises.add("Francia");
        listaPaises.add("Alemania");

        //mostrar lista opcion1
        System.out.println("Listado 1");
        for (i = 0; i < listaPaises.size(); i++) {
            System.out.println(listaPaises.get(i));
        }
        //mostrar lista opcion2
        System.out.println("\nListado 2");
        for (String pais : listaPaises) {
            System.out.println(pais);
        }
        //mostrar lista opcion3
        System.out.println("\nListado 3");
        Iterator<String> iter = listaPaises.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //modificar registro 1
        listaPaises.set(1, "Italia");
        System.out.println("\nModificar registro 1");
        for (i = 0; i < listaPaises.size(); i++) {
            System.out.println(listaPaises.get(i));
        }

        //buscar
        String paisBuscado = "Alemania";
        int pos = listaPaises.indexOf(paisBuscado);
        System.out.println("\nBUSCAR ALEMANIA");
        if (pos != -1) {
            System.out.println("\t" + paisBuscado + " --> esta en la posición:" + pos);
        } else {
            System.out.println("\t" + paisBuscado + " --> no se ha encontrado");
        }

        //borrar Alemania. Dispara excepción ConcurrentModificationException
        /*
        for (String pais: listaPaises){
            if (pais.equalsIgnoreCase("Alemania"))
                listaPaises.remove("Alemania");
        }*/
        //listado
          System.out.println("\nListado ");
        for (String pais : listaPaises) {
            System.out.println(pais);
        }
        //borrar la lista
        System.out.println("\nBORRAR");
        listaPaises.clear();
        System.out.println("Se ha borrado? " + listaPaises.isEmpty());




    }
}