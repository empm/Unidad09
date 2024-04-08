package Ordenacion;

public class AlumnoAplicacion {

    public static void main(String[] args) {
        Alumnos grupo6J = new Alumnos();

        Alumno Eustaquio = new Alumno(1, "Jimenez", "Jimenez", "Eustaquio", 2);
        Alumno Ramona = new Alumno(3, "Piegrande", "Bigfoot", "Ramona", 2);
        Alumno Paca = new Alumno(5, "Pelo", "Verde", "Paca", 2);
        Alumno Joselito = new Alumno(2, "Cantaor", "Ruiseñor", "Joselito", 2);
        Alumno Vito = new Alumno(4, "Salvatore", "NoMafioso", "Vito", 2);

        grupo6J.rellenarFicha(Eustaquio, 3);
        grupo6J.rellenarFicha(Ramona, 2);
        grupo6J.rellenarFicha(Paca, 4);
        grupo6J.rellenarFicha(Joselito, 1);
        grupo6J.rellenarFicha(Vito, 0);
        System.out.println("Antes de ordenar....");
        grupo6J.getAlumnos();
        grupo6J.ordenarAlumnos();
        System.out.println("Después de ordenar....");
        grupo6J.getAlumnos();
    }
}
