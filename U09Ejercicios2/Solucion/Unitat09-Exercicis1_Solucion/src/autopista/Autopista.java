package autopista;

import java.util.Scanner;

public class Autopista {

    public static void main(String[] args) {
        
        String[] menu = {"0. Salir", "1. Poner en cola", "2. Salir de la cola", "3. Mostrar colas"};
        Scanner teclado = new Scanner(System.in);
        int op;
        Peaje p = new Peaje();
        do {
            for (String item : menu) {
                System.out.println(item);
            }
            op = teclado.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    p.anyadir();
                    break;
                case 2:
                    p.quitar();
                    break;
                case 3:
                    p.mostrarColas();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (op != 0);
    }
}
