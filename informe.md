# Práctica 4: Ejercicios de lógica con estructuras no lineales: árboles

## Datos del Estudiante
* **Universidad:** Universidad Politécnica Salesiana
* **Carrera:** Computación
* **Asignatura:** Estructura de Datos – Segundo Interciclo
* **Estudiante:** Angelo Miguel Carchipulla Pulla

---

## Descripción general del proyecto
El proyecto busca mejorar la comprensión de la lógica de programación utilizando estructuras de datos no lineales, con **Árboles Binarios** y **Árboles Binarios de Búsqueda (BST)**. A través de distintos ejercicios, se realizan algoritmos fundamentales como la inserción de arreglos numéricos respetando las reglas de un BST, modo "espejo" del árbol, y recorridos visuales del mismo. Tiene una organización ya indicada en el documento el cual se seguir.

---

## Ejercicio 01: Insertar en BST

### Explicación de la lógica y del método `insert`
En este ejercicio se da la inserción de múltiples valores (provenientes de un arreglo de enteros) dentro de un Árbol Binario de Búsqueda (BST). La lógica cumple con el BST: todo valor menor a la raíz se inserta en el subárbol izquierdo, y todo valor mayor o igual se inserta en el subárbol derecho.

* **Método `insert(int[] numeros)`:** Recibe un arreglo de números enteros. Internamente instancia un árbol binario (`BinaryTrees<Integer>`), itera sobre cada elemento del arreglo y utiliza el método de inserción individual del árbol. Finalmente, invoca un método de impresión (`printTree`) que muestra el árbol en consola utilizando tabulaciones (`\t`) calculadas mediante la recursividad de derecha a izquierda, lo que permite visualizar el árbol acostado.

### Evidencia de Código (Ejercicio 01)
```java
public void insert(int[] numeros) {
    // Crear un árbol BST - instanciar BinaryTree
    BinaryTrees<Integer> tree = new BinaryTrees<>();

    // Insertar los números en el árbol
    for (int numero : numeros) {
        tree.insert(numero);
    }

    // Imprimir el árbol
    printTree(tree.getRoot());
}

public void printTree(Node<Integer> root) {
    System.out.println("Imprimiendo el árbol: ");
    printTreeRecursivo(root, 0);
}

private void printTreeRecursivo(Node<Integer> actual, int nivel) {
    // 1. Por si actual es null
    if (actual == null) {
        return;
    }

    // 2. Procesar primero el hijo DERECHO
    printTreeRecursivo(actual.getRight(), nivel + 1);

    // 3. Imprimir el nodo actual con tabulaciones según su nivel
    if (nivel != 0) {
        for (int i = 0; i < nivel - 1; i++) {
            System.out.print("\t");
        }
        System.out.println("\t" + actual.getValue());
    } else {
        // Es la raíz principal
        System.out.println(actual.getValue());
    }

    // 4. Procesar el hijo IZQUIERDO
    printTreeRecursivo(actual.getLeft(), nivel + 1);
}
```
![alt text](image-14.png)




## Ejercicio 02: Invertir árbol binario

### Explicación de la lógica y del método `invertTree`
El objetivo de este ejercicio es aplicar un efecto "espejo" a la estructura de un árbol binario. Esto significa que para cada nodo visitado, su hijo izquierdo pasará a ocupar la posición del hijo derecho, y viceversa, transformando físicamente la disposición de la estructura en memoria.

* **Lógica del algoritmo:** Se utiliza un enfoque de recorrido en profundidad (DFS) recursivo. Al evaluar cada nodo, primero se verifica si es nulo (caso base de la recursión). Si no lo es, se realiza un intercambio clásico de variables (*swap*) utilizando un nodo auxiliar `temporal` para almacenar la referencia izquierda antes de sobreescribirla con la derecha. Una vez hecho el intercambio en el nodo actual, se propagan los llamados recursivos hacia `root.getLeft()` y `root.getRight()` para repetir el proceso de manera descendente en todos los niveles inferiores del árbol.

### Evidencia de Código (Ejercicio 02)
```java
public Node<Integer> invert(Node<Integer> root) {
    // 1. Imprimir el árbol original para contrastar
    System.out.println("--- Arbol Original ---");
    printTree(root);

    // 2. Invertir la estructura físicamente en memoria
    invertRecursively(root);

    // 3. Imprimir el árbol modificado para verificar el efecto espejo
    System.out.println("\n--- Arbol Invertido ---");
    printTree(root);

    return root;
}

public void invertRecursively(Node<Integer> root) {
    // Caso base: si el nodo está vacío, detener la recursión
    if (root == null) {
        return;
    }

    // Intercambiar las referencias de los hijos (Swap)
    Node<Integer> temporal = root.getLeft();
    root.setLeft(root.getRight());
    root.setRight(temporal);

    // Llamados recursivos para aplicar el intercambio en los subárboles descendientes
    invertRecursively(root.getLeft());
    invertRecursively(root.getRight());
}
```
![alt text](image-15.png)
