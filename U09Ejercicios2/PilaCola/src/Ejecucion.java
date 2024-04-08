public class Ejecucion {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola();

        String[] elementos = {"uno", "dos", "tres"};

        for (int i = 0; i < elementos.length; i++){
            pila.meter(elementos[i]);
            cola.meter(elementos[i]);
        }

        System.out.println("Lista Pila\n-----------");
        pila.listar();
        System.out.println("\nLista Cola\n-----------");
        cola.listar();

        System.out.println("\nEliminamos el último elemento de Pila y Cola\n-----------");
        pila.sacar();
        cola.sacar();

        System.out.println("\nLista Pila\n-----------");
        pila.listar();
        System.out.println("\nLista Cola\n-----------");
        cola.listar();

    }
}
