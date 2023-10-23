package src.dominio;

import java.io.Serializable;
import java.util.UUID;

/**
 * Clase que representa un producto.
 */
public class Producto implements Serializable {
    private String nombremodelo;
    private double precio;
    private double tamano;
    private String codigo;  // Cambiamos el tipo de datos de int a String para usar UUID

    /**
     * Constructor de la clase Producto.
     *
     * @param nombremodelo El nombre del modelo del producto.
     * @param precio       El precio del producto.
     * @param tamano       El tamaño del producto.
     */
    public Producto(String nombremodelo, double precio, double tamano) {
        this.nombremodelo = nombremodelo;
        this.precio = precio;
        this.tamano = tamano;
        this.codigo = UUID.randomUUID().toString();  // Generamos un código único
    }

    // Getters y setters

    /**
     * Obtiene el nombre del modelo del producto.
     *
     * @return El nombre del modelo del producto.
     */
    public String getNombremodelo() {
        return nombremodelo;
    }

    /**
     * Establece el nombre del modelo del producto.
     *
     * @param nombremodelo El nombre del modelo del producto.
     */
    public void setNombremodelo(String nombremodelo) {
        this.nombremodelo = nombremodelo;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el tamaño del producto.
     *
     * @return El tamaño del producto.
     */
    public double getTamano() {
        return tamano;
    }

    /**
     * Establece el tamaño del producto.
     *
     * @param tamano El tamaño del producto.
     */
    public void setTamano(double tamano) {
        this.tamano = tamano;
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
     * Establece el código único del producto.
     *
     * @param codigo El código único del producto.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto: " + nombremodelo + ". Precio: " + precio + " $. " + "Tamaño: " + tamano + " cm. Código: " + codigo;
    }
}

