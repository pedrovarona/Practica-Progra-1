# Catálogo de Productos

Este proyecto en Java implementa un simple catálogo de productos con operaciones básicas como agregar, eliminar y mostrar productos. Utiliza una interfaz de consola para interactuar con el usuario.

## Estructura del Proyecto

El proyecto está organizado en tres paquetes principales:

1. **src.main:** Contiene la clase principal `Main` que sirve como punto de entrada del programa.

2. **src.interfaz:** Incluye la clase `Interfaz` que gestiona la interacción con el usuario y proporciona un menú para realizar diversas operaciones en el catálogo de productos.

3. **src.dominio:** Contiene las clases `Producto` y `Lista`. La clase `Producto` representa un artículo en el catálogo, mientras que la clase `Lista` gestiona una colección de productos, permitiendo operaciones como agregar, eliminar y listar.

## Makefile

El archivo `Makefile` proporciona reglas para compilar, empaquetar, generar documentación y ejecutar el programa.

- `make compile`: Compila el código fuente y crea la estructura de directorios en la carpeta `bin`.
- `make jar`: Empaqueta el programa en un archivo JAR llamado `proyecto.jar`.
- `make clean`: Elimina los directorios `bin` y el archivo JAR.
- `make javadoc`: Genera la documentación Javadoc en la carpeta `doc/javadoc`.
- `make run`: Ejecuta el programa JAR.

Para realizar todas las operaciones de compilación, empaquetado, documentación y ejecución, puedes usar el comando:

```bash
make completo
```

## UML
![DiagramaUML](https://github.com/pedrovarona/Practica-Progra-1/assets/121907021/dc82523b-71f0-403c-97b8-86bd4293a329)

## Manifest

El archivo `Manifest.txt` especifica la información necesaria para ejecutar el programa. Indica la clase principal que debe ejecutarse y define la ruta de clases con el Class-Path.

Para compilar, empaquetar y ejecutar el programa, utiliza los siguientes comandos:

```bash
make completo
```

Este comando compila el código, genera la documentación Javadoc, empaqueta el programa en un archivo JAR y lo ejecuta.
