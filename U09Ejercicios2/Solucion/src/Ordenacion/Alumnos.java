package Ordenacion;

import java.util.Arrays;

public class Alumnos {

    private Alumno[] grupoAlumnos = new Alumno[5];

    public void ordenarAlumnos() {
        Arrays.sort(grupoAlumnos);
    }

    public void rellenarFicha(Alumno a, int pos) {
        grupoAlumnos[pos] = a;
    }
    public  void getAlumnos(){
        for(int i = 0; i<5; i++){
            System.out.println(grupoAlumnos[i]);
        }
    }
}
