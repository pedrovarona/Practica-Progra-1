package src.interfaz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import src.dominio.*;

/**
 * Clase que representa la interfaz de usuario para gestionar productos Apple.
 */
public class Interfaz {
    private Scanner scanner;
    private Lista listaProductos;

    /**
     * Constructor de la clase Interfaz. Inicializa el scanner y la lista de productos.
     */
    public Interfaz() {
        this.scanner = new Scanner(System.in);
        this.listaProductos = new Lista();
    }

    /**
     * Método principal que inicia la interfaz y gestiona las opciones del usuario.
     */
    public void iniciar() {
        while (true) {
            try {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Agregar un producto Apple");
                System.out.println("2. Eliminar un producto por código");
                System.out.println("3. Ver catálogo de productos");
                System.out.println("4. Guardar y salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea después de leer un entero

                switch (opcion) {
                    case 1:
                        agregarProducto();
                        break;
                    case 2:
                        System.out.print("Ingrese el código del producto que desea eliminar: ");
                        String codigoEliminar = scanner.next();
                        listaProductos.eliminarProducto(codigoEliminar);
                        System.out.println("Producto eliminado con éxito.");
                        break;
                    case 3:
                        listarProductos();
                        break;
                    case 4:
                        guardarDatos();
                        System.out.println("Guardando y saliendo del programa.");
                        scanner.close();
                        return; // Salir del método, no es necesario System.exit(0)
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada incorrecta. Por favor, ingrese una opción válida.");
                scanner.nextLine(); // Limpiar el búfer de entrada para evitar un bucle infinito
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Agrega un producto Apple (iPhone, iPad, AirPods) a la lista de productos.
     */
    private void agregarProducto() {
        try {
            System.out.println("Seleccione el tipo de producto Apple:");
            System.out.println("1. iPhone");
            System.out.println("2. iPad");
            System.out.println("3. AirPods");

            int opcionTipo = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer un entero

            switch (opcionTipo) {
                case 1:
                    agregarIphone();
                    break;
                case 2:
                    agregarIpad();
                    break;
                case 3:
                    agregarAirPods();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada incorrecta. Por favor, ingrese una opción válida.");
            scanner.nextLine(); // Limpiar el búfer de entrada para evitar un bucle infinito
        }
    }

    /**
     * Agrega un modelo de iPhone a la lista de productos.
     */
    private void agregarIphone() {
        System.out.print("Ingrese el nombre del modelo: ");
        String nombreModelo = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tamaño: ");
        double tamano = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de leer un double
        System.out.print("Ingrese el modelo de red: ");
        String modeloRed = scanner.nextLine();

        Iphone nuevoIphone = new Iphone(nombreModelo, precio, tamano, modeloRed);
        listaProductos.agregarProducto(nuevoIphone);
        System.out.println("iPhone agregado con éxito.");
    }

    /**
     * Agrega un modelo de iPad a la lista de productos.
     */
    private void agregarIpad() {
        System.out.print("Ingrese el nombre del modelo: ");
        String nombreModelo = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tamaño: ");
        double tamano = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de leer un double
        System.out.print("Ingrese el tipo: ");
        String tipo = scanner.nextLine();

        Ipad nuevoIpad = new Ipad(nombreModelo, precio, tamano, tipo);
        listaProductos.agregarProducto(nuevoIpad);
        System.out.println("iPad agregado con éxito.");
    }

    /**
     * Agrega un modelo de AirPods a la lista de productos.
     */
    private void agregarAirPods() {
        System.out.print("Ingrese el nombre del modelo: ");
        String nombreModelo = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tamaño: ");
        double tamano = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de leer un double

        boolean respuestaValida = false;
        boolean tieneEstucheCarga = false;

        while (!respuestaValida) {
            System.out.print("¿Tiene estuche de carga? (Si/No): ");
            String tieneEstucheCargaStr = scanner.nextLine().trim(); // Eliminar espacios al principio y al final

            if (tieneEstucheCargaStr.equalsIgnoreCase("Si")) {
                tieneEstucheCarga = true;
                respuestaValida = true;
            } else if (tieneEstucheCargaStr.equalsIgnoreCase("No")) {
                tieneEstucheCarga = false;
                respuestaValida = true;
            } else {
                System.out.println("Opción no válida. Por favor, introduzca 'Si' o 'No'.");
            }
        }

        AirPods nuevosAirPods = new AirPods(nombreModelo, precio, tamano, tieneEstucheCarga);
        listaProductos.agregarProducto(nuevosAirPods);
        guardarDatos(); // Guardar después de agregar los AirPods
        System.out.println("AirPods agregados con éxito.");
    }

    /**
     * Muestra el catálogo de productos Apple almacenados en la lista.
     */
    private void listarProductos() {
        listaProductos.cargarDatos();  // Cargar datos antes de mostrar el catálogo
        System.out.println("Catálogo de productos Apple:");
        listaProductos.listarProductos();
    }

    /**
     * Guarda los datos de la lista de productos en un archivo serializado.
     */
    private void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("productos.ser"))) {
            out.writeObject(listaProductos);
            System.out.println("Datos guardados en 'productos.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
