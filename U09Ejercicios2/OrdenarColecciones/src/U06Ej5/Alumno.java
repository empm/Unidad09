package U06Ej5;

import java.util.Scanner;

public class Alumno implements Comparable<Alumno> {

    // Atributos
    private int numeroPersonal;
    private String apellido1, apellido2, nombre;
    private int numAsignaturas;
    private double[] notasFinales;
    private double notaMediaFinal;

    // Constructor
    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig) {
        numeroPersonal = numPer;
        apellido2 = ap2;
        apellido1 = ap1;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = new double[numAsignaturas];
    }

    // Getters & Setters
    public int getNumeroPersonal() {
        return numeroPersonal;
    }
    public String getApellido1() {
        return apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumAsignaturas() {
        return numAsignaturas;
    }
    public double[] getNotasFinales() {
        return notasFinales;
    }
    public double getNotaMediaFinal() {
        return notaMediaFinal;
    }

    // Metodos
    @Override
    public String toString() {
        String resul;
        resul = "NP: " + numeroPersonal +
                "\n" + nombre + " " + apellido1 + " " + apellido2 +
                "\nNota Media Final: " + notaMediaFinal + "\n";
        return resul;
    }

    @Override
    public int compareTo(Alumno o){
        return this.numeroPersonal - o.numeroPersonal;
        // si da 0, son iguales - ej 4-4 = 0
        // añadimos la implementacion de la interfaz en la clase
        // implements Comparable<T>
    }

    /* NOTAS */
    public void asignarNotas(double[][] notas) {
        double[][] notaAlumno = new double[2][numAsignaturas];

        // Asignar calculo nota final de 2 evaluaciones
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notaAlumno[i][j] = notas[i][j];
                notasFinales[j] = (notas[0][j] * 0.6) + (notas[1][j] * 0.4);
            }
        }

        // Mostrar nota final
        System.out.println("Notas finales:");
        for (double n : notasFinales) {
            System.out.println(n);
        }

    }
    public void pasaDeCurso() {
        int contarSuspensos = 0;

        for (int i = 0; i < notasFinales.length; i++) {
            if (notasFinales[i] < 5.0f) {
                contarSuspensos++;
            }
        }
        if (contarSuspensos > 2)
            System.out.println("\nNo pasa de curso, tiene " + contarSuspensos + " suspensas.");
        else
            System.out.println("\nPasa de curso, felicidades.\nPasa con: " + contarSuspensos + " suspensas.");
    }
    public double[] setNotas() {
        Scanner scan = new Scanner(System.in);
        double[] notasAsignatura = new double[this.numAsignaturas];
        for (int i = 0; i < this.numAsignaturas; i++) {
            System.out.print((i + 1) + ". Introduce nota: ");
            notasAsignatura[i] = scan.nextDouble();
        }
        return notasAsignatura;
    }
}
