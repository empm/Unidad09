import java.util.LinkedList;

public class Pila {

    // Atributo
    private LinkedList<Object> lista;

    // Constructor
    public Pila(){
        lista = new LinkedList<>();
    }

    // Metodos
    public void meter(Object e){
        lista.addFirst(e);
    }

    public void sacar(){
        lista.removeFirst();
    }

    public void listar(){
        for (Object elementos : lista){
            System.out.println(elementos.toString());
        }
    }



}
