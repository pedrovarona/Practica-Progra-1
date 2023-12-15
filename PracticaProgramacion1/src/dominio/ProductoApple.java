package src.dominio;

import java.io.Serializable;
import java.util.UUID;

/**
 * Clase base que representa un producto Apple.
 *
 * @version 1.0
 */
public class ProductoApple implements Serializable {
    private String nombremodelo;
    private double precio;
    private double tamano;
    private String codigo;

    /**
     * Constructor de la clase ProductoApple.
     *
     * @param nombremodelo El nombre del modelo del producto.
     * @param precio       El precio del producto.
     * @param tamano       El tamaño del producto.
     */
    public ProductoApple(String nombremodelo, double precio, double tamano) {
        this.nombremodelo = nombremodelo;
        this.precio = precio;
        this.tamano = tamano;
        this.codigo = UUID.randomUUID().toString();  // Generamos un código único
    }

    /**
     * Obtiene el código único del producto.
     *
     * @return El código único del producto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Devuelve una representación en cadena del producto.
     *
     * @return Representación en cadena del producto.
     */
    @Override
    public String toString() {
        return "Producto Apple: " + nombremodelo + ". Precio: " + precio + " $. " +
                "Tamaño: " + tamano + " cm. Código: " + codigo;
    }
}
