package U06Ej5;

public class App {
    public static void main(String[] args) {

        // crear un alumno y asignarle el resto

        OrdenarAlumnos grupo6U = new OrdenarAlumnos();

        Alumno a1 = new Alumno(1, "Perez", "Molina", "Enrique",3);
        Alumno a2 = new Alumno(2, "Reyes", "Rojas", "Alicia", 4);
        Alumno a3 = new Alumno(3, "Jhones", "Ipsum", "Lorem", 2);
        Alumno a4 = new Alumno(4, "Ap1", "Ap2", "Nom1", 1);
        Alumno a5 = new Alumno(5, "Ap51", "Ap52", "Nom5", 2);

        // Notas
//        double[][] na1 = new double[2][a1.getNumAsignaturas()];
//        na1[0] = a1.setNotas(); // eval1
//        na1[1] = a1.setNotas(); // eval2
//        a1.asignarNotas(na1);
//        a1.pasaDeCurso();
//        System.out.println(a1.toString());


        grupo6U.rellenarFicha(a1, 0); // 1
        grupo6U.rellenarFicha(a2, 2); // 3
        grupo6U.rellenarFicha(a3, 4); // 5
        grupo6U.rellenarFicha(a4, 3); // 4
        grupo6U.rellenarFicha(a5, 1); // 2

        System.out.println();
        grupo6U.getAlumnos();
        System.out.println();

        grupo6U.ordenarArray();
        System.out.println();

        grupo6U.getAlumnos();

    }
}

