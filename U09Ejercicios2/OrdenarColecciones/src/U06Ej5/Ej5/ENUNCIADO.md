Arrays y Clases. Ejercicios 5
Sea la clase Alumno que se presenta a continuación:
public class Alumno {
int númeroPersonal:
String apellido1, apellido2, nombre:
int numAsignaturas:
double[ ] notasFinales:
double notaMediaFinal:
public Alumno(int numPer, String ap1, String ap2, String nom, int
num Asig) {
númeroPersonal = numPer:
apellido1 = ap1:
apellido2 = ap2:
nombre = nom:
numAsignaturas = numAsig:
notasFinales = new double[numAsignaturas]:
}
public Alumno(int numPer, String ap1, String ap2, String nom, int
numAsig, double[ ] notasF, double nmf) {
númeroPersonal = numPer:
apellido1 = ap1:
apellido2 = ap2:
nombre = nom:
numAsignaturas = numAsig:
notasFinales = notasF:
notaMediaFInal = nmf:
}
public String toString( ) {
String resul:
resul = “NP: “ + númeroPersonal + “\n” +
“ Nombre: “ + nombre +
“ Apellido1: “ + apellido1 +
“ Apellido2: “ + apellido2 + “\n” +
“ Nota Media Final: “ + notaMediaFinal + “\n”:
return resul:
}
public double obtenerNotaMediaFinal( ) {
return notaMediaFinal:
}
}
Programación - DAM U06 – Ejercicios5
2
1. Añade a la clase un método, de nombre asignarNotas, que reciba
   por parámetro una matriz de valores reales con las notas que el
   alumno ha obtenido en dos evaluaciones realizadas. La primera
   dimensión de la matriz corresponderá al número de evaluaciones y,
   por tanto, sólo podrá contener 2 posiciones. La segunda dimensión
   corresponde a las calificaciones obtenidas por el alumno en cada
   una de las asignaturas. El método calculará la nota final para
   cada una de las asignaturas teniendo en cuenta que la nota de la
   primera evaluación tiene un peso del 60% y la de la segunda
   evaluación el 40% restante. El método también determinará la nota
   media final del alumno.
2. Añade a la clase un método, de nombre pasaDeCurso, que
   indique si el alumno podrá acceder al siguiente curso. Se considera
   que un alumno puede pasar de curso si su nota media final es
   mayor o igual de 5.0 y tiene menos de 3 asignaturas suspensas.
   Y ahora...
3. Crea un array de 5 alumnos. (Recuerda crear cada uno de
   los objetos alumno). Solicita los datos de los alumnos al usuario y
   visualízalos.
4. Solicita las notas de cada uno de los alumnos y a partir de
   ellas y usando el método asignarNotas asigna las notas finales a
   cada alumno
5. Muestra los datos de todos los alumnos
   Puedes crear otros métodos que consideres convenientes