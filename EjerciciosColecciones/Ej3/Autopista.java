package U09.EjerciciosColecciones.Ej3;

/*
 * Entendiendo enunciado
 */
/*
 * Autopista peaje / 3 ventanas
 * 1. Efectivo
 * 2. Exacto
 * 3. Tarjeta
 * ?? esta en mayus porque puede ser enum?
 * 
 * Se actua como cola: el primero en entrar, es el primero en salir.
 * 
 * los datos que se almacenan de los coches en las colas:
 * 1. matricula
 * 2. modelo
 * 3. color
 * 
 * La app tiene 3 metodos
 * 1. añadir coche al final de la cola
 * 2. eliminar coche del principio de la cola
 * 3. salir de la app
 * ?? se me ocurre un bucle while
 * 
 */
public class Autopista {


    public static void main(String[] args) {

    }
}

enum Ventanilla {
    EFECTIVO, IMPORTE_EXACTO, TARJETA
}

class Coche{

    // Atributos
    protected String matricula;
    protected String modelo;
    protected String color;

    // Constructor
    public Coche(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    // Getters & Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}