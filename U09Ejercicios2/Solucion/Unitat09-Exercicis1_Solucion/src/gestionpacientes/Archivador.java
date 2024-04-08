package gestionpacientes;

import java.util.ArrayList;
import java.util.Iterator;

public class Archivador {

    private ArrayList<Ficha> pacientes;

    public Archivador() {

        pacientes = new ArrayList<>();
    }

    public void anyadir(Ficha param) {
        pacientes.add(param);
    }
//método para eliminar una Ficha, buscando una Ficha determinada.
//retorna true si ha encontrado el elemento, y por tanto lo ha eliminado. False en caso contrario.
    public boolean eliminar(Ficha param) {
        boolean estado;
        estado = pacientes.remove(param);
        return estado;
    }
//método para eliminar una Ficha, de una posición determinada.
    public Ficha eliminar(int pos) {
        Ficha ficha_buscada;
        ficha_buscada = pacientes.remove(pos);
        return ficha_buscada;
    }
//Esto no funciona. Dispara java.util.ConcurrentModificationException
//por ello, se propone la segunda versión
    
   /* public boolean eliminar(String nombre) {
        boolean hecho = false;
        for (Ficha uno : this.pacientes) {
            if (uno.getNombre().equalsIgnoreCase(nombre)) {

                this.eliminar(uno);
                hecho = true;
            }
        }
        return hecho;
    }*/
    
    public boolean eliminar(String nombre) {
        Iterator<Ficha> iteratorF =this.pacientes.iterator();
        boolean hecho = false;
        while (iteratorF.hasNext()) {
            String nom = iteratorF.next().getNombre();
            if (nom.equals(nombre)) {
                iteratorF.remove();
                hecho=true;
            }
        }
        return hecho;
    }

    @Override
    public String toString() { //método toString.
        String res = "";
        for (Ficha f1 : pacientes) {
            res += "\n" + f1.toString();
        }
        return res;
    }

    public void mostrarAcrhivador() {
        System.out.println("\nNúmero de Fichas: " + pacientes.size());
        System.out.println("Listado de los pacientes:");
        System.out.println("===========================================================");
        System.out.println(this.toString());
        System.out.println("===========================================================\n\n");
    }

}
