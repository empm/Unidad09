/*
 *
 */
package gestionpacientes;

public class Ficha {

    private String nombre = null;
    private String apellidos = null;
    private int edad = 0;

    public Ficha(String nombre, String apellidos, int edad) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        String res = "Nombre: " + nombre + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Edad: " + edad + "\n";

        return res;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //lo probamos
    public static void main(String[] args) {

        Ficha paciente = new Ficha("Pepe", "Lopez", 22);
        System.out.println(paciente);

    }
}
