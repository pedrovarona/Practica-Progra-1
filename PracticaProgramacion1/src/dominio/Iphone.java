package src.dominio;

/**
 * Clase que representa un iPhone.
 *
 * @version 1.0
 */
public class Iphone extends ProductoApple {
    private String modeloRed;

    public Iphone(String nombremodelo, double precio, double tamano, String modeloRed) {
        super(nombremodelo, precio, tamano);
        this.modeloRed = modeloRed;
    }

    public String getModeloRed() {
        return modeloRed;
    }

    public void setModeloRed(String modeloRed) {
        this.modeloRed = modeloRed;
    }

    @Override
    public String toString() {
        return super.toString() + ". Modelo de Red: " + modeloRed;
    }
}
