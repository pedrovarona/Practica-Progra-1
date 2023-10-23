package src.main;

import java.util.Scanner;
import src.dominio.Lista;
import src.dominio.Producto;

/**
 * Clase principal que contiene el punto de entrada del programa.
 */
public class Main {
    public static void main(String[] args) {
        Lista listaProductos = new Lista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Agregar un producto");
                System.out.println("2. Eliminar un producto por código");
                System.out.println("3. Ver catálogo de productos");
                System.out.println("4. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea después de leer un entero

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del modelo: ");
                        String nombreModelo = scanner.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese el tamaño: ");
                        double tamano = scanner.nextDouble();

                        Producto nuevoProducto = new Producto(nombreModelo, precio, tamano);
                        listaProductos.agregarProducto(nuevoProducto);
                        System.out.println("Producto agregado con éxito.");
                        break;
                    case 2:
                        System.out.print("Ingrese el código del producto que desea eliminar: ");
                        String codigoEliminar = scanner.next();
                        listaProductos.eliminarProducto(codigoEliminar);
                        System.out.println("Producto eliminado con éxito.");
                        break;
                    case 3:
                        listaProductos.listarProductos();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada incorrecta. Por favor, ingrese una opción válida.");
                scanner.nextLine(); // Limpiar el búfer de entrada para evitar un bucle infinito
            }
        }
    }
}
