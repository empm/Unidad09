package gestionPacientes;

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
import java.util.*;

public class Archivador {

    ArrayList<Ficha> listadoPacientes;

    public Archivador() {
        listadoPacientes = new ArrayList<>();
    }

    public int buscaPorApellido(String cognom) {
        Ficha tmp = new Ficha(cognom, "res", 100);
        return listadoPacientes.indexOf(tmp);
    }

    public void archivarFicha(Ficha paciente) {
        listadoPacientes.add(paciente);
    }

    public void eliminarFicha(Ficha paciente) {
        listadoPacientes.remove(paciente);
    }

    @Override
    public String toString() {
        String aux = "\n";
        for (Ficha listadoPaciente : listadoPacientes) {
            aux += listadoPaciente.toString() + "\n";
        }
        aux += "Numero de pacientes: " + listadoPacientes.size() + "\n\n";
        return aux;
    }

    public void ordenarNom() {
        Collections.sort(listadoPacientes);
    }

    public void ordenarEdad() {
        Collections.sort(listadoPacientes, new CompararEdad());
    }

    public void ordenarApellido() {
        Collections.sort(listadoPacientes, new CompararApellido());
    }
}

class CompararEdad implements Comparator<Ficha> {

    @Override
    public int compare(Ficha lista, Ficha lista2) {
        return lista.getEdad() - lista2.getEdad();
    }
}

class CompararApellido implements Comparator<Ficha> {

    @Override
    public int compare(Ficha lista1, Ficha lista2) {
        return lista1.getApellidos().compareTo(lista2.getApellidos());
    }
}
