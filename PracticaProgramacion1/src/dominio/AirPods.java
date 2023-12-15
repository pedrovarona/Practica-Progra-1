package src.dominio;

/**
 * Clase que representa unos AirPods.
 *
 * @version 1.0
 */
public class AirPods extends ProductoApple {
    private boolean tieneEstucheCarga;

    public AirPods(String nombremodelo, double precio, double tamano, boolean tieneEstucheCarga) {
        super(nombremodelo, precio, tamano);
        this.tieneEstucheCarga = tieneEstucheCarga;
    }

    public boolean isTieneEstucheCarga() {
        return tieneEstucheCarga;
    }

    public void setTieneEstucheCarga(boolean tieneEstucheCarga) {
        this.tieneEstucheCarga = tieneEstucheCarga;
    }

    @Override
    public String toString() {
        return super.toString() + ". Tiene estuche de carga: " + (tieneEstucheCarga ? "Sí" : "No");
    }
}
