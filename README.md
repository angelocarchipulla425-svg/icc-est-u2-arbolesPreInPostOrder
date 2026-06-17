# Proyecto: Árboles Binarios (PreOrder, InOrder, PostOrder)

## Datos del Estudiante
* **Universidad:** [Nombre de la Universidad]
* **Carrera:** Ingeniería en Ciencias de la Computación
* **Nombre:** [Tu Nombre Completo]
* **Grupo:** [Tu Grupo / Ciclo]
* **Fecha:** 17 de junio de 2026

---

## Descripción del Proyecto
Este proyecto es una implementación en **Java** enfocada en el estudio y manipulación de estructuras de datos no lineales, específicamente **Árboles Binarios**. Incluye la creación de nodos individuales, árboles para tipos de datos primitivos (como enteros) y árboles genéricos o adaptados para objetos personalizados, permitiendo realizar los recorridos clásicos de ordenamiento y búsqueda: **Preorden**, **Inorden** y **Postorden**.

---

## Estructura del Código (`src/structures`)

El proyecto está organizado dentro del paquete de estructuras con las siguientes clases clave:

### 1. `Node.java`
* **Descripción:** Representa el componente básico (nodo) del árbol.
* **Responsabilidad:** Contiene el valor del nodo y las referencias (punteros) a sus hijos izquierdo y derecho (`left` y `right`).

### 2. `Person.java`
* **Descripción:** Clase modelo que define un objeto de tipo Persona (con atributos como nombre, edad, etc.).
* **Responsabilidad:** Sirve como el tipo de dato complejo para probar el comportamiento del árbol con objetos en lugar de tipos primitivos.

### 3. `IntTree.java`
* **Descripción:** Implementación de un árbol binario diseñado específicamente para manejar números enteros (`int`).
* **Responsabilidad:** Contiene los métodos para insertar elementos y ejecutar los recorridos básicos de forma sencilla.

### 4. `BinaryTrees.java`
* **Descripción:** La clase principal de la estructura del árbol (puede ser genérica o adaptada para interactuar con la clase `Person`).
* **Responsabilidad:** Controla la lógica principal del árbol binario, la inserción organizada de nodos y los métodos principales para los recorridos:
  * **PreOrden:** (Raíz, Izquierda, Derecha)
  * **InOrden:** (Izquierda, Raíz, Derecha)
  * **PostOrden:** (Izquierda, Derecha, Raíz)

### 5. `App.java`
* **Descripción:** El punto de entrada del programa (`main`).
* **Responsabilidad:** Instancia las clases anteriores, quema o solicita datos de prueba, construye los árboles y muestra los resultados de los recorridos por la terminal.

---

## Requisitos de Ejecución
* **Entorno de Desarrollo:** Visual Studio Code / NetBeans
* **JDK:** Versión 11 o superior
* **Herramientas de Control de Versiones:** Git