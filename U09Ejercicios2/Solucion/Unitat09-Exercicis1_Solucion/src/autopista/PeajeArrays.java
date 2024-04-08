package autopista;

import java.util.Scanner;

public class PeajeArrays {

     Cola[]  peaje;

    public PeajeArrays() {
          peaje =new Cola[3];
    }

    private int SeleccionarCola() {
        Scanner teclado = new Scanner(System.in);
        int cola = 0;
        do {
            for (int i = 0; i < peaje.length; i++) {
                System.out.print(" " + i + " : " + peaje[i].getNombre());
            }
            System.out.println(" >> Dime opción:");
            cola = teclado.nextInt();
        } while (cola < 0 || cola > peaje.length - 1);
        return cola;
    }

    public void anyadir() {
        int cola = SeleccionarCola();
        peaje[cola].ponerseEnCola();
    }

    public void quitar() {
        int cola = SeleccionarCola();
        peaje[cola].quitarPrimero();
    }

    public void mostrarColas() {
       
        for (Cola c : peaje) {
            System.out.println(c.getNombre());
            c.mostrarLista();
        }
    }
}
