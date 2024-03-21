package U09.EjerciciosColecciones.Ej3;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Entendiendo enunciado
 */
/*
 * Autopista2 peaje / 3 ventanas
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
public class Autopista2 {
    LinkedList<Coche> carriles;

    public Autopista2() {
        carriles = new LinkedList<>();
    }

    public void addCoche(Coche c) {
        carriles.addLast(c);
    }
    public void delCoche() {
        carriles.removeFirst();
    }

    // metodo para mostrar y ver que hace

    public void showCoche(){
        System.out.println("Mostrando coches: ");
        for (Coche coche : carriles) {
            System.out.println(coche.modelo);
        }
    }

    public void exitApp(){
       
    }


    public static void main(String[] args) {

        // Crear un metodo para crear coches - fuera del main
        Coche audi = new Coche("023939AVS", "a3", "Gris");
        Coche bmw = new Coche("234234BBS", "M3", "Verde");
        
        Autopista2 efectivo = new Autopista2();
        Autopista2 exacto = new Autopista2();
        Autopista2 tarjeta = new Autopista2();

        efectivo.addCoche(audi);
        efectivo.addCoche(bmw);
        efectivo.showCoche();
        efectivo.delCoche();
        efectivo.showCoche();
    }
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