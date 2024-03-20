Escribe una clase llamada "Inventario", para almacenar referencias a todos los animales existentes en una tienda de mascotas.
Esta clase debe cumplir con los siguientes requisitos:

En la tienda existirán diferentes tipos de Mascotas: Perros, Gatos, Loros y Canarios. Todas las mascotas en su constructor reciben los atributos indicados en el UML.
Los animales deben almacenarse en un ArrayList privado dentro de la clase Inventario.
La clase debe tener un menú que permita:
Inicializa el inventario a vacío: void vaciar()
Método para insertar animales del inventario: void insertaMascota(Mascotas a)
Método para eliminar animales por nombre del inventario: void eliminaMascota(String nombreI)
Método que imprima el atributo "nombreI" de todos los animales de la tienda: void imprimirTodos()
Método que imprima el atributo "nombreI" de todos los perros de la tienda: void imprimirPerros()

Atenció: 
L'enunciat parla del mètode void insertaMascota(Mascotas a), però per passar les proves, el mètode ha de ser void anyadirMascota(Mascotas a)
La classe Mascotas requereix dels atributs:
String nombreI
 int edat
String estado
String fechaNacimiento
La classe Mascotas requereix dels mètodes:
public Mascotas( String nombreI, int edat, String estado, String fechaNacimiento)
String getEstado()
String getNombreI()