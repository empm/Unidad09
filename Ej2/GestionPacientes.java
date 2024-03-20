package U09Colecciones.Ej2;

import java.util.ArrayList;

public class GestionPacientes {
    public static void main(String[] args) {

        // Fichas
        Fichas jguerra = new Fichas("Javi", "Guerra", 101);
        Fichas jgaya = new Fichas("Jose Luis", "Gaya", 28);
        Fichas hduro = new Fichas("Hugo", "Duro", 24);

        
    
    }
}


/**
 * Clase Fichas
 */
class Fichas {
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Fichas(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }    
}

/**
 * Clase Archivador
 */
class Archivador {
    protected Fichas fichasArchivadas;

    public Archivador(Fichas fichasArchivadas) {
        this.fichasArchivadas = fichasArchivadas;
    }
}