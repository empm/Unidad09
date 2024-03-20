package U09.U09ClaseInventario;

import java.util.ArrayList;

/**
 * <h1>Ejercicio entregable - Inventario</h1>
 * Clase Inventario: Contiene listado de mascotas
 * <br>
 * <br>
 * 
 * @author eperez
 * @version Marzo 2024
 */

public class Inventario {

    // Atributos
    private ArrayList<Mascotas> arrayMascotas;

    // Constructor
    public Inventario() {
        arrayMascotas = new ArrayList();
    }

    // Metodos
    public void vaciar() {
        arrayMascotas.clear();
    }

    public void anyadirMascota(Mascotas a) {
        arrayMascotas.add(a);
    }

    public void eliminaMascota(String nombreI) {
        for (Mascotas name : arrayMascotas) {
            if (name.getNombreI().equals(nombreI)) {
                arrayMascotas.remove(name);
            }
        }
    }

    public void imprimirTodos() {
        for (Mascotas nombre : arrayMascotas) {
            System.out.println(nombre.getNombreI());
        }
    }

    public void imprimirPerros() {
        for (Mascotas nombre : arrayMascotas) {
            if (nombre.getClass() == Perro.class)
                System.out.println(nombre.getNombreI());
        }
    }

    // Main
    public static void main(String[] args) {
        // Creación de Mascotas
        Perro r = new Perro("Rocky", 1, "OK", "11022017");
        Gato g = new Gato("Negro", 2, "OK", "05012016");
        Loro l = new Loro("Lorinho", 2, "ENFERMO", "05012016");
        Canario c = new Canario("Piolin", 2, "OK", "05012016");

        // Mostramos
        System.out.println(r.getNombreI());
        System.out.println(l.getEstado());
        System.out.println();

        // Creamos inventario
        Inventario i = new Inventario();

        // Añadimos mascotas al inventario
        i.anyadirMascota(r);
        i.anyadirMascota(g);
        i.imprimirTodos();
        i.imprimirPerros();
        i.vaciar();
        System.out.println();
        i.anyadirMascota(g);
        i.anyadirMascota(c);
        i.anyadirMascota(l);
        i.imprimirTodos();
        i.imprimirPerros();

    }
}

abstract class Mascotas {

    // Atributos
    protected String nombreI;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    // Constructor
    public Mascotas(String nombreI, int edad, String estado, String fechaNacimiento) {
        this.nombreI = nombreI;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter & Setter
    public String getEstado() {
        return this.estado;
    }

    public String getNombreI() {
        return this.nombreI;
    }
}

class Perro extends Mascotas {
    public Perro(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

class Gato extends Mascotas {
    public Gato(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

abstract class Aves extends Mascotas {

    public Aves(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

class Loro extends Aves {
    public Loro(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

class Canario extends Aves {
    public Canario(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}