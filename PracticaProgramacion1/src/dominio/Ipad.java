package src.dominio;

/**
 * Clase que representa un iPad.
 *
 * @version 1.0
 */
public class Ipad extends ProductoApple {
    private String tipo;

    public Ipad(String nombremodelo, double precio, double tamano, String tipo) {
        super(nombremodelo, precio, tamano);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ". Tipo: " + tipo;
    }
}
