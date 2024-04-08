package U09.EjerciciosColecciones.Ej2;

import java.util.ArrayList;

public class GestionPacientes {
    public static void main(String[] args) {

        // Fichas
        Fichas jguerra = new Fichas("Javi", "Guerra", 22);
        Fichas jgaya = new Fichas("Jose Luis", "Gaya", 28);
        Fichas hduro = new Fichas("Hugo", "Duro", 24);

        Fichas psanchez = new Fichas("Pedro", "Sanchez", 52);
        Fichas sabascal = new Fichas("Santiago", "Abascal", 48);
        Fichas acolau = new Fichas("Ada", "Colau", 50);

        Archivador fichasValencia = new Archivador();
        Archivador fichasPolitica = new Archivador();

        fichasValencia.addFicha(jguerra);
        fichasValencia.addFicha(jgaya);
        fichasValencia.addFicha(hduro);
        fichasValencia.mostrarFichas();
        System.out.println();

        fichasPolitica.addFicha(psanchez);
        fichasPolitica.addFicha(sabascal);
        fichasPolitica.addFicha(acolau);
        fichasPolitica.mostrarFichas();
        System.out.println();
        fichasPolitica.delFicha(acolau);
        fichasPolitica.mostrarNombreFichas();

    }
}

/**
 * Clase Fichas
 */
class Fichas {

    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Fichas(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters & Setters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

}

/**
 * Clase Archivador
 */
class Archivador {

    // Atributos
    protected ArrayList<Fichas> fichasArchivadas;

    // Constructor
    public Archivador() {
        fichasArchivadas = new ArrayList<>();
    }

    // Metodos
    public void addFicha(Fichas f) {
        fichasArchivadas.add(f);
    }

    public void delFicha(Fichas f) {
        fichasArchivadas.remove(f);
    }

    public void mostrarNombreFichas(){
        for (Fichas name : fichasArchivadas){
            System.out.println(name.getNombre());
        }
    }
    
    public void mostrarFichas() {
        for (Fichas names : fichasArchivadas) {
            System.out.println(names.getNombre() + " "
                    + names.getApellidos() + ", "
                    + names.getEdad());
        }
    }
}