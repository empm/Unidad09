package ordenacionEjemplo;

import java.util.*;

public class Articulo implements Comparable<Articulo> {

    public String codArticulo; // Código de artículo
    public String descripcion; // Descripción del artículo.
    public int cantidad; // Cantidad a proveer del artículo.

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo(String codArticulo, String descripcion, int cantidad) {
        this.codArticulo = codArticulo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        String resul;
        resul = "Código  " + this.codArticulo + "\t"
                + " Descripción: " + this.descripcion + "\t"
                + " Cantidad: " + this.cantidad + "\t";
        return resul;
    }

    @Override
    public int compareTo(Articulo t) {

        return this.codArticulo.compareToIgnoreCase(t.codArticulo);
    }

//generado por Insert Code...
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        //son iguales si tienen el mismo codigo y la misma descripcion
        if (!Objects.equals(this.codArticulo, other.codArticulo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }

}
