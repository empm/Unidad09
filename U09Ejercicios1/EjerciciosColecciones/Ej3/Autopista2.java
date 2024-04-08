package U09.EjerciciosColecciones.Ej3;

import java.util.LinkedList;

public class Autopista2 {
    LinkedList<Coche> carriles;

    public Autopista2() {
        carriles = new LinkedList<>();
    }

    public void addCoche(Coche c) {
        carriles.addLast(c);
    }

    public void delCoche() {
        System.out.println("Borrando el primer coche que llegó...");
        carriles.removeFirst();
    }

    // metodo para mostrar y ver que hace

    public void showCoche() {
        System.out.println();
        System.out.println("Mostrando coches: ");
        for (Coche coche : carriles) {
            System.out.println("Matricula: " + coche.matricula +
                    "\nModelo: " + coche.modelo +
                    "\nColor: " + coche.color);
        }
    }

    public void exitApp() {
        System.exit(0);
    }

    public static void main(String[] args) {

        // Crear un metodo para crear coches - fuera del main
        Coche audi = new Coche("023939AVS", "a3", "Gris");
        Coche bmw = new Coche("234234BBS", "M3", "Verde");
        Coche mercedes = new Coche("342342AB", "C63", "Azul");
        Coche ford = new Coche("243452UI", "Focus", "Gris");
        Coche ferrari = new Coche("123454F", "Roma", "Rojo");
        Coche toyota = new Coche("75463TY", "Corola", "Blanco");
        Coche rolls = new Coche("00000RR", "Phantom", "Negro");
        Coche opel = new Coche("65756OPS", "Combo", "Gris");

        Autopista2 efectivo = new Autopista2();
        Autopista2 exacto = new Autopista2();
        Autopista2 tarjeta = new Autopista2();

        efectivo.addCoche(audi);
        efectivo.addCoche(bmw);
        efectivo.showCoche();
        efectivo.delCoche();
        efectivo.showCoche();

        System.out.println();

        exacto.addCoche(mercedes);
        exacto.addCoche(ford);
        exacto.addCoche(toyota);
        exacto.showCoche();

        System.out.println();

        tarjeta.addCoche(ferrari);
        tarjeta.addCoche(rolls);
        tarjeta.addCoche(opel);
        tarjeta.delCoche();
        tarjeta.showCoche();

        exacto.exitApp();

        tarjeta.addCoche(mercedes);
        tarjeta.showCoche();
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