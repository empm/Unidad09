/*
 2.- Desarrollar un sistema de gestión de pacientes:
 Tendremos un archivador dónde iremos guardando todas las fichas de los
 pacientes. Las fichas contienen la siguiente información: nombre, apellidos y
 edad.

 Todas las fichas que vayamos creando, se podrán guardar o eliminar del
 archivador. Al archivador también le podremos pedir un listado. Este listado
 consistirá en visualizar por pantalla el número de fichas guardadas, así como el
 contenido de las fichas.

 La clase GestionPacientes tiene un método main en el que se crea un
 archivador, dos o tres fichas que se guardarán en el archivador, se listará el
 contenido, se eliminará alguna ficha y se volverá a listar su contenido.
 Todas las clases se guardarán en el paquete gestionpacientes
 */
package gestionPacientes;

public class Ficha implements Comparable<Ficha> {

    private String nombre;
    private String apellidos;
    private int edad;

    public Ficha(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object otra) {
        return (this.apellidos).equals(((Ficha) otra).apellidos);
    }

    @Override
    public String toString() {
        String aux = "\tNombre: " + nombre + "\tApellidos: " + apellidos
                + "\tEdad: " + edad;
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     @Override
    public int compareTo(Ficha o) {
        return nombre.compareTo(o.nombre);
    }
    /* 
    @Override
    public int compareTo(Ficha o) {
        return this.edad - o.edad;
    }
    /*es equivalent a
    public int compareTo(Ficha o) {
        if (this.edad < o.edad) {
            return -1; //o qualsevol número negatiu
        } else if (this.edad > o.edad) {
            return +1; //o qualsevol número positiu
        } else {
            return 0;
        }
    }*/
}
