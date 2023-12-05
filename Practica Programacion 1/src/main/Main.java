package src.main;

import src.interfaz.Interfaz;

/**
 * Clase principal que contiene el punto de entrada del programa.
 */
public class Main {
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz(); // Crear una instancia de la clase Interfaz
        interfaz.iniciar(); // Llamar al método iniciar de la clase Interfaz
    }
}
