/*
 * 2.- Desarrollar un sistema de gestión de pacientes:
Tendremos un archivador dónde iremos guardando todas las Fichas de los pacientes. 
* Las Fichas contienen la siguiente información: nombre, apellidos y edad.
Todas las Fichas que vayamos creando, se podrán guardar o eliminar del archivador. 
* Al archivador también le podremos pedir un listado. 
* Este listado consistirá en visualizar por pantalla el número de Fichas guardadas, 
* así como el contenido de las Fichas.
La clase GestionPacientes tiene un método main en el que se crea un archivador, 
* dos o tres Fichas que se guardarán en el archivador, se listará el contenido, 
* se eliminará alguna Ficha y se volverá a listar su contenido.
Todas las clases se guardarán en el paquete gestionpacientes

 */
package gestionpacientes;

public class GestionPacientes {

    public static void main(String[] args) {

        //Creamos 3 objetos de tipo Ficha.
        System.out.println("1- Creamos 3 objetos de tipo Ficha.\n");
        Ficha ficha1 = new Ficha("Juan", "González", 27);
        Ficha ficha2 = new Ficha("Sergio", "Popov", 31);
        Ficha ficha3 = new Ficha("Nico", "Estromboli", 41);

        //Creamos un objeto de tipo Archivador.		
        System.out.println("2- Creamos un objeto de tipo Archivador.\n");
        Archivador miArchivador = new Archivador();

        //Añadimos las 3 Fichas al archivador miArchivador.
        System.out.println("3- Añadimos las 3 Fichas al archivador miArchivador.\n");
        miArchivador.anyadir(ficha1);
        miArchivador.anyadir(ficha2);
        miArchivador.anyadir(ficha3);

        //Imprimimos el contenido del archivador.
        System.out.println("4- Imprimimos el contenido del archivador:\n");
        miArchivador.mostrarAcrhivador();

        //Eliminar a Juan del Archivador.
        System.out.println("5a- Eliminamos a Juan:");
        miArchivador.eliminar("Juan");
        //Imprimimos el contenido del archivador.
        System.out.println("5b- Imprimimos el contenido del archivador:\n");
        miArchivador.mostrarAcrhivador();

        //Eliminamos la Ficha1 del Archivador.
        System.out.println("5- Eliminamos el objeto Ficha1:");

        if (miArchivador.eliminar(ficha1)) {
            System.out.println("El objeto se ha eliminado.\n\n");
        } else {
            System.out.println("El objeto no se ha eliminado.\n\n");
        }

        //Imprimimos el contenido del archivador.
        System.out.println("6- Imprimimos el contenido del archivador:\n");
        miArchivador.mostrarAcrhivador();

    }
}
