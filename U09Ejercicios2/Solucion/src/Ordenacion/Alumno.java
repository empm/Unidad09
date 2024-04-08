package Ordenacion;

import java.util.*;

public class Alumno implements Comparable<Alumno> {

    int númeroPersonal;
    private String apellido1, apellido2, nombre;
    private int numAsignaturas;
    private double[] notasFinales;
    private double notaMediaFinal;

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig) {
        númeroPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAsignaturas = numAsig;
       
    }

    @Override
    public String toString() {
        String resul;
        resul = "NP: " + númeroPersonal + "\n"
                + " Nombre: " + nombre
                + " Apellido1: " + apellido1
                + " Apellido2: " + apellido2 + "\n"
                + " Nota Media Final: " + notaMediaFinal + "\n";
        return resul;
    }

    public int getNúmeroPersonal() {
        return númeroPersonal;
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

    public double getNotaMediaFinal() {
        return notaMediaFinal;
    }

    public double obtenerNotaMediaFinal() {
        return notaMediaFinal;
    }

    @Override
    public int compareTo(Alumno o) {
        /* Es lo mismo 
         if(this.númeroPersonal == o.númeroPersonal){
         return 0;
         }else if(this.númeroPersonal < o.númeroPersonal){
         return -1;
         }else{
         return 1;
         }
         */
        return this.númeroPersonal - o.númeroPersonal;
    }

}
