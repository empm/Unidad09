package U06Ej5.Ej5;

import java.util.Scanner;

public class Alumno {
    private int numeroPersonal;
    private String apellido1, apellido2, nombre;
    private int numAsignaturas;
    private double[] notasFinales;
    private double notaMediaFinal;

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig) {
        numeroPersonal = numPer;
        apellido2 = ap2;
        apellido1 = ap1;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = new double[numAsignaturas];
    }

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig, double[] notasF, double nmf) {
        numeroPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = notasF;
        notaMediaFinal = nmf;
    }

    @Override
    public String toString() {
        String resul;
        resul = "NP: " + numeroPersonal +
                "\nNombre: " + nombre +
                " Apellido1: " + apellido1 + " Apellido2: " + apellido2 +
                "\n Nota Media Final: " + notaMediaFinal;
        return resul;
    }

    public double obtenerNotaMediaFinal() {
        return notaMediaFinal;
    }

    /*
     * 1. Añade a la clase un método, de nombre asignarNotas, que reciba
     * por parámetro una matriz de valores reales con las notas que el
     * alumno ha obtenido en dos evaluaciones realizadas.
     * 
     * La primera dimensión de la matriz corresponderá al número de evaluaciones
     * y, por tanto, sólo podrá contener 2 posiciones.
     * La segunda dimensión corresponde a las calificaciones obtenidas por el alumno
     * en cada una de las asignaturas.
     * 
     * El método calculará la nota final para cada una de las asignaturas teniendo
     * en cuenta que
     * la nota de la primera evaluación tiene un peso del 60% y la de la segunda
     * evaluación el 40% restante.
     * 
     * El método también determinará la nota media final del alumno.
     */

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

    /*
     * 2. Añade a la clase un método, de nombre pasaDeCurso,
     * que indique si el alumno podrá acceder al siguiente curso.
     * 
     * Se considera que un alumno puede pasar de curso si su nota media final es
     * mayor o igual de 5.0 y tiene menos de 3 asignaturas suspensas.
     */

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

    public static Alumno[] crearArrayAlumnos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce cantidad de alumnos que quieres crear: ");
        int numAlumnos = scan.nextInt();
        Alumno[] arrayAlumnos = new Alumno[numAlumnos];

        for (int i = 0; i < arrayAlumnos.length; i++) {
            arrayAlumnos[i] = crearAlumno();
        }
        return arrayAlumnos;
    }

    public double[] setNotas(){
        Scanner scan = new Scanner(System.in);
        double[] notasAsignatura = new double[this.numAsignaturas];
        for (int i = 0; i < this.numAsignaturas; i++) {
            System.out.print((i+1) + ". Introduce nota: ");
            notasAsignatura[i] = scan.nextDouble();
        }
        return notasAsignatura;
    }


    public static void main(String[] args) {
        // int numPer, String ap1, String ap2, String nom, int numAsig, double[] notasF, double nmf
        Alumno a1 = new Alumno(123, "Perez", "Molina", "Enrique",3);
        Alumno a2 = new Alumno(1328, "Reyes", "Rojas", "Alicia", 4);
        Alumno a3 = new Alumno(011, "Jhones", "Ipsum", "Lorem", 2);
        Alumno a4 = new Alumno(100, "Ap1", "Ap2", "Nom1", 1);
        Alumno a5 = new Alumno(101, "Ap51", "Ap52", "Nom5", 2);

        // a1
        double[][] na1 = new double[2][a1.numAsignaturas];
        na1[0] = a1.setNotas(); // eval1
        na1[1] = a1.setNotas(); // eval2
        a1.asignarNotas(na1);

        // a2
//        double[][] na2 = new double[2][a2.numAsignaturas];
//        na2[0] = a2.setNotas(); // eval1
//        na2[1] = a2.setNotas(); // eval2
//        a2.asignarNotas(na2);

        a1.obtenerNotaMediaFinal();
        a1.pasaDeCurso();
        System.out.println(a1.toString());

//        a2.obtenerNotaMediaFinal();
//        a2.pasaDeCurso();
//        System.out.println(a2.toString());

    }
}
