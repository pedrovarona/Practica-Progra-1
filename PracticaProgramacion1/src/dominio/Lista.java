package src.dominio;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase que representa una lista de productos.
 *
 * @version 1.0
 */
public class Lista implements Serializable {
    private ArrayList<ProductoApple> productos;

    /**
     * Constructor de la clase Lista.
     */
    public Lista() {
        cargarDatos();  // Cargar datos al construir la lista
        if (this.productos == null) {
            this.productos = new ArrayList<>();
        }
    }

    /**
     * Agrega un producto a la lista.
     *
     * @param producto El producto que se va a agregar.
     */
    public void agregarProducto(ProductoApple producto) {
        productos.add(producto);
        guardarDatos();  // Guardar datos después de agregar un producto
    }

    /**
     * Elimina un producto de la lista por su código único.
     *
     * @param codigo El código único del producto que se va a eliminar.
     */
    public void eliminarProducto(String codigo) {
        productos.removeIf(producto -> producto.getCodigo().equals(codigo));
        guardarDatos();  // Guardar datos después de eliminar un producto
    }

    /**
     * Muestra el catálogo de productos en la consola.
     */
    public void listarProductos() {
        System.out.println("Catálogo de productos Apple:");
        for (ProductoApple producto : productos) {
            System.out.println(producto);
        }
    }

    /**
     * Carga los datos desde un archivo serializado.
     */
    public void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("productos.ser"))) {
            Lista listaCargada = (Lista) in.readObject();
            this.productos = listaCargada.productos;
            System.out.println("Datos cargados correctamente desde 'productos.ser'");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo 'productos.ser'. Se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Guarda los datos en un archivo serializado.
     */
    public void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("productos.ser"))) {
            out.writeObject(this);
            System.out.println("Datos guardados en 'productos.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
