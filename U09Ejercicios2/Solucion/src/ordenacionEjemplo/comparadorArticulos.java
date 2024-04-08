package ordenacionEjemplo;

import java.util.Comparator;

class comparadorArticulos implements Comparator<Articulo> {

    @Override
    public int compare(Articulo o1, Articulo o2) {
        return o1.descripcion.compareTo(o2.descripcion);
    }
}
