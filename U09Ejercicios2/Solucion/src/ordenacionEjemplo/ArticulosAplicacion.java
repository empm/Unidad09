package ordenacionEjemplo;

import java.util.ArrayList;
import java.util.Collections;

public class ArticulosAplicacion {

    public static void main(String[] args) {
        ArrayList<Articulo> almacen = new ArrayList<>();

        Articulo art1 = new Articulo("zs11", "Monitor", 34);
        Articulo art2 = new Articulo("as23", "Teclado", 234);
        Articulo art3 = new Articulo("xs11", "Disco duro", 734);
        Articulo art4 = new Articulo("ba23", "Mouse", 254);

        almacen.add(art1);
        almacen.add(art2);
        almacen.add(art3);
        almacen.add(art4);

        System.out.println("Antes de ordenar....");
        for (Articulo elemento : almacen) {
            System.out.println(elemento);
        }
        
        Collections.sort(almacen);
        
        System.out.println("Después de ordenar....");
        for (Articulo elemento : almacen) {
            System.out.println(elemento);
        }
        
        Collections.sort(almacen,new comparadorArticulos());
        
        System.out.println("Después de ordenar  con nuevo criterio  (descripción) ....");
        for (Articulo elemento : almacen) {
            System.out.println(elemento);
        }
    }
}
