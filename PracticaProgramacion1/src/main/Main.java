package src.main;

import src.interfaz.Interfaz;

/**
 * Clase principal que contiene el punto de entrada del programa.
 */
public class Main {
    /**
     * Punto de entrada principal del programa. Crea una instancia de la clase Interfaz y
     * llama al método iniciar para gestionar la interfaz de usuario.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz(); // Crear una instancia de la clase Interfaz
        interfaz.iniciar(); // Llamar al método iniciar de la clase Interfaz

        // Guardar la lista al salir del programa
    }
}
