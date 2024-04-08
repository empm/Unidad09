package colapila;

import java.util.LinkedList;

public class Pila {
// Atributos.
    private LinkedList lista = null;
// Constructor.
    public Pila() {
        lista = new LinkedList<>();
    }
// Métodos.
    public void meter(Object ob) {
        lista.addLast(ob);
    }

    public Object sacar() {
        return lista.removeLast();
    }

    public int tamano() {
        return lista.size();
    }
    public void mostrarPila(){
		
		int i=0;
		
		System.out.println("Pila LIFO:");
		System.out.println("==============================================");
		
		for(Object s: lista){
			
			System.out.print("Elemento "+i+": ");
			System.out.println(s);
			
			i++;
		}
		
		System.out.println("==============================================");

	} //fin mostrarLIFO.
	
}
