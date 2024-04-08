import java.util.LinkedList;

public class Cola {

    // Atributos
    private LinkedList<Object> cola;

    // Constructor
    public Cola(){
        cola = new LinkedList<>();
    }

    // Metodos
    // meter, sacar y listar

    public void meter(Object e){
        cola.addLast(e);
    }

    public void sacar(){
        cola.removeFirst();
    }

    public void listar(){
        for (Object elementos : cola){
            System.out.println(elementos.toString());
        }
    }
}
