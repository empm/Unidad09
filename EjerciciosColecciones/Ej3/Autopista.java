package U09.EjerciciosColecciones.Ej3;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Entendiendo enunciado
 */
/*
 * Autopista peaje / 3 ventanas
 * 1. Efectivo
 * 2. Exacto
 * 3. Tarjeta
 * ?? esta en mayus porque puede ser enum?
 * 
 * Se actua como cola: el primero en entrar, es el primero en salir.
 * 
 * los datos que se almacenan de los coches en las colas:
 * 1. matricula
 * 2. modelo
 * 3. color
 * 
 * La app tiene 3 metodos
 * 1. añadir coche al final de la cola
 * 2. eliminar coche del principio de la cola
 * 3. salir de la app
 * ?? se me ocurre un bucle while
 * 
 */
public class Autopista {
    LinkedList<Coche> carriles;

    public Autopista() {
        carriles = new LinkedList<>();
    }

    public void addCoche(Coche c) {
        carriles.addFirst(c);
    }

    public static void main(String[] args) {
        Autopista peaje = new Autopista();

        Scanner scan = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Selecciona un acción");
            System.out.println("--------------------");
            System.out.println("0. Salir\n1. Añadir coche\n2. Eliminar coche\n3. Ver cola\n");

            menu = scan.nextInt();
            System.out.println();

            String matricula, modelo, color;

            switch (menu) {
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                System.out.println("Añadir coche: ");
                System.out.println("Escribe matricula: ");
                matricula = scan.nextLine();
                System.out.println("Escribe modelo: ");
                modelo = scan.nextLine();
                System.out.println("Escribe color: ");
                color = scan.nextLine();
                peaje.addCoche(new Coche(matricula, modelo, color));
                    break;

                default:
                System.out.println("Selecciona otro numero");
                    break;
            }

        } while (menu != 0);
    }
}

enum Ventanilla {
    EFECTIVO, IMPORTE_EXACTO, TARJETA
}

class Coche {

    // Atributos
    protected String matricula;
    protected String modelo;
    protected String color;

    // Constructor
    public Coche(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    // Getters & Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}