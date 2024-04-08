package U06Ej5;

import java.util.Scanner;

public class CrearAlumnos {
    public static Alumno crearAlumno() {
        Scanner scan = new Scanner(System.in);
        // public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig)
        System.out.print("Introduce el número personal: ");
        int numPer = scan.nextInt();
        System.out.print("Introduce el primer apellido: ");
        String primerApellido = scan.nextLine();
        System.out.print("Introduce el segundo apellido: ");
        String segundoApellido = scan.nextLine();
        System.out.print("Introduce el nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Introduce el numero de asignaturas: ");
        int numAsignaturas = scan.nextInt();
        System.out.println();
        Alumno a = new Alumno(numPer, primerApellido, segundoApellido, nombre, numAsignaturas);
        return a;
    }
}
