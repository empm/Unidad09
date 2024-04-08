package U06Ej5;

import java.util.Arrays;

public class OrdenarAlumnos {
     // crear un array de alumnos
    // usar un metodo ordenar / array.short(att array)
    // rellenar ficha (objetos, posicion)
    // crear logica
    // crar un getAlumnos

    private Alumno[] grupoAlumnos = new Alumno[5];

    public void ordenarArray(){
        Arrays.sort(grupoAlumnos);
    }

    public void rellenarFicha(Alumno a, int p){
        grupoAlumnos[p] = a;
    }

    public void getAlumnos(){
        for (Alumno list : grupoAlumnos){
            System.out.println(list);
        }
    }
}
