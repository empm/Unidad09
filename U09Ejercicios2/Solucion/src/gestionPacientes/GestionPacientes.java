/*
 2.- Desarrollar un sistema de gestión de pacientes:
 Tendremos un archivador dónde iremos guardando todas las fichas de los
 pacientes. Las fichas contienen la siguiente información: nombre, apellidos y
 edad.

 Todas las fichas que vayamos creando, se podrán guardar o eliminar del
 archivador. Al archivador también le podremos pedir un listado. Este listado
 consistirá en visualizar por pantalla el número de fichas guardadas, así como el
 contenido de las fichas.

 La clase GestionPacientes tiene un método main en el que se crea un
 archivador, dos o tres fichas que se guardarán en el archivador, se listará el
 contenido, se eliminará alguna ficha y se volverá a listar su contenido.
 Todas las clases se guardarán en el paquete gestionpacientes
 */
package gestionPacientes;

import java.util.Comparator;

public class GestionPacientes {

    public static void main(String[] args) {

        Archivador a1 = new Archivador();
        
        Ficha paciente1 = new Ficha("Jordi", "Garcia Sapiña", 21);
        Ficha paciente4 = new Ficha("Antonio", "Garcia Zapiña", 22);
        Ficha paciente2 = new Ficha("Jorge", "Moreno Sanchez", 17);
        Ficha paciente3 = new Ficha("Gorca", "Orkoetxea", 32);

        a1.archivarFicha(paciente1);
        a1.archivarFicha(paciente2);
        a1.archivarFicha(paciente3);
        a1.archivarFicha(paciente4);
      //   a1.eliminarFicha(paciente3);
         
        System.out.println("**********Pacientes Sin Ordenar...");
        System.out.print(a1);
   Ficha paciente33 = new Ficha("Otro", "Orkoetxea", 32);
        System.out.println(paciente33.equals(paciente3));
        System.out.println(a1.buscaPorApellido("Orkoetxea"));
        //
        a1.ordenarNom();
        System.out.println("**********Ordenados por nombre -compareTo-");
        System.out.print(a1);
        
        System.out.println("**********Ordenados por Edad...");
        a1.ordenarEdad();
        System.out.print(a1);
        
        System.out.println("**********Ordenados por Apellido...");
        a1.ordenarApellido();
        System.out.print(a1);
    }
}
