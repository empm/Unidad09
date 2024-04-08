/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionPacientesVer2;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Roger Sancho
 * @fecha 22 mar 2023 18:00:13
 * @company Ciclo Superior de Informática
 * @version Sin información de la versión
 */
public class FichaPaciente {

    private String nombre, apellidos;
    private int edad;

    public FichaPaciente(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
    public String toString() {
        return "{" + apellidos + ", " + nombre + ". " + edad + " años}";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof FichaPaciente) {
            //id comparison
            FichaPaciente paciente = (FichaPaciente) o;
            return this.nombre.equalsIgnoreCase(paciente.nombre)
                    && this.apellidos.equalsIgnoreCase(paciente.apellidos);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

}

class ComparadorPacientes_Nombre implements Comparator<FichaPaciente> {

    @Override
    public int compare(FichaPaciente o1, FichaPaciente o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}

class ComparadorPacientes_Apellidos implements Comparator<FichaPaciente> {

    @Override
    public int compare(FichaPaciente o1, FichaPaciente o2) {
        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}

class ComparadorPacientes_Edad implements Comparator<FichaPaciente> {

    @Override
    public int compare(FichaPaciente o1, FichaPaciente o2) {
        return o1.getEdad() - o2.getEdad();
    }
}
