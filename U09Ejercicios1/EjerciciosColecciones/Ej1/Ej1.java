package U09Ejercicios1.EjerciciosColecciones.Ej1;

import java.util.ArrayList;

/**
 * Ej1
 *
 * 1.- Desenvolupar el ArrayList listaPaises vist en els exemples del tema
 */
public class Ej1 {
    public static void main(String[] args) {
        ArrayList<String> listaPaises = new ArrayList<>();

        listaPaises.add("España");
        listaPaises.add("Portugal");
        listaPaises.add("Francia");
        System.out.println(listaPaises.get(2));
        listaPaises.add(2, "Italia");
        listaPaises.addFirst("Alemania");
        listaPaises.remove(4);


        System.out.println("Total paises: " + listaPaises.size());

        for (String lista : listaPaises){
            System.out.println(lista);
        }

    }

}
