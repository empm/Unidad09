package autopista;

import java.util.ArrayList;
import java.util.Scanner;

public class Peaje {

    private ArrayList<Cola> peaje;

    public Peaje() {
        peaje = new ArrayList<>();
        peaje.add(new Cola("EFECTIVO"));
        peaje.add(new Cola("EXACTO"));
        peaje.add(new Cola("TARJETA"));
    }

    private int SeleccionarCola() {
        Scanner teclado = new Scanner(System.in);
        int cola = 0;
        do {
            for (int i = 0; i < peaje.size(); i++) {
                System.out.print(" " + i + " : " + peaje.get(i).getNombre());
            }
            System.out.println(" >> Dime opción:");
            cola = teclado.nextInt();
        } while (cola < 0 || cola > peaje.size() - 1);
        return cola;
    }

    public void anyadir() {
        int cola = SeleccionarCola();
        peaje.get(cola).ponerseEnCola();
    }

    public void quitar() {
        int cola = SeleccionarCola();
        peaje.get(cola).quitarPrimero();
    }

    public void mostrarColas() {
      
        for (Cola c : peaje) {
            System.out.println(c.getNombre());
            c.mostrarLista();
        }
    }
}
