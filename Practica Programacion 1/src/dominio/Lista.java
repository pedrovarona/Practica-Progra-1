package src.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que representa una lista de productos.
 */
public class Lista implements Serializable {
    private ArrayList<Producto> productos;

    /**
     * Constructor de la clase Lista.
     */
    public Lista() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la lista.
     *
     * @param producto El producto que se va a agregar.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Elimina un producto de la lista por su código único.
     *
     * @param codigo El código único del producto que se va a eliminar.
     */
    public void eliminarProducto(String codigo) {
        productos.removeIf(producto -> producto.getCodigo().equals(codigo));
    }

    /**
     * Muestra el catálogo de productos en la consola.
     */
    public void listarProductos() {
        System.out.println("Catálogo de productos:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
