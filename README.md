# Mis Proyectos en Java 🚀

¡Hola! Este es mi repositorio donde voy subiendo lo que voy programando en Java mientras aprendo y avanzo en mi formación.

---

##  1. Agenda de Contactos (Consola API con Spring Boot) 

Este proyecto nació inicialmente como una aplicación simple en consola para aprender las bases de Java, y posteriormente lo evolucioné a una **API REST funcional** utilizando **Spring Boot**.

### 🔹 Fase 1: Versión de Consola (Java Puro)
Fue mi primer acercamiento al lenguaje. Una agenda simple para guardar nombres y números de teléfono.
* **Lo que aprendí:** Manejo de `ArrayList` dinámicos, bucles `for` tradicionales y fundamentos de Programación Orientada a Objetos (POO) creando la clase `Contacto`.

### 🔹 Fase 2: Evolución a API REST (Spring Boot)
Tomé la lógica del primer proyecto y la migré a un entorno backend moderno. Ahora, en lugar de un menú por consola, los contactos se gestionan mediante peticiones HTTP.
* **Lo que aprendí:**
    * **Arquitectura en Capas:** Separación de responsabilidades en Controlador (`Controller`), Servicio (`Service`) y Modelo (`Model`).
    * **Endpoints REST:** Uso de anotaciones de Spring (`@GetMapping`, `@PostMapping`, `@DeleteMapping`) para interactuar con los datos en formato JSON desde herramientas como Postman o Insomnia.
    * **Inyección de Dependencias:** Uso de `@Autowired` para conectar las capas de forma limpia y eficiente.

#### 🛠️ Endpoints creados en la API:
* `GET /contactos`  Devuelve la lista completa de contactos en formato JSON.
* `POST /contactos`  Recibe un JSON con `nombre` y `telefono` para registrar uno nuevo.
* `DELETE /contactos/{id}`  Elimina un contacto usando su índice posicional en la lista.

---

## 2. Sistema de Inventario

Este es un poco más avanzado. Es un programa para gestionar una tienda desde la consola donde puedes agregar productos, buscarlos por su ID y borrarlos.

###  Lo que aprendí:
* **Usar HashMap:** En vez de un Array común, aquí cambié a `HashMap`. Es genial porque busca los productos al instante usando el **ID** como llave única, muy parecido a cómo funciona una base de datos SQL.
* **Limpiar el Scanner:** Aprendí a la fuerza que después de leer un número con `nextInt()` hay que meter un `sc.nextLine()` para limpiar la consola, si no, el programa se salta las preguntas de texto.

###  Los archivos del inventario:
* `Producto.java`: Guarda los datos (id, nombre, descripción y precio).
* `Inventario.java`: Tiene el `HashMap` y los métodos para guardar, buscar y borrar.
* `Main.java`: Tiene el menú en consola (`do-while` y `switch`) para usar el sistema.

---

## Contacto

Si quieres escribirme o ver mis redes, puedes encontrarme en:

* **GitHub:** [pepe907](https://github.com/pepe907)
* **Mail:** [agustincabezas1454@gmail.com](mailto:agustincabezas1454@gmail.com)

---
¡Gracias por pasar a ver mi progreso! ☕🔥