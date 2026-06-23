package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees <T extends Comparable<T>> {
    private Node<T> root;
    private int peso;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        this.root = node;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        this.root = node;
    }

    // Método principal para insertar un valor desde fuera
    public void insert(T value) { 
        Node<T> node = new Node<T>(value);
        this.root = insertRecursivo(root, node);
        peso ++;
    }

    // Recursivo para insertar valores ÁRBOL BINARIO DE BÚSQUEDA
    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // Validar si es mayor o menor y decidir si lo ingreso a la der o izq
        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    // === RECORRIDO PREORDER ===
    public void preOrder() {
        preOrderRecursivo(root);
        System.out.println();
    }

    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null) {
            return;
        }
        System.out.print(actual.getValue() + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    // === RECORRIDO POSTORDER ===
    public void posOrder() {
        posOrderRecursivo(root);
        System.out.println();
    }

    private void posOrderRecursivo(Node<T> actual) {
        if (actual == null) {
            return;
        }
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual.getValue() + " ");
    }

    // === RECORRIDO INORDER ===
    public void inOrder() {
        inOrderRecursivo(root);
        System.out.println();
    }

    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null) {
            return;
        }
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual.getValue() + " ");
        inOrderRecursivo(actual.getRight());
    }

    // === RECORRIDO POR NIVELES (ANCHURA) ===
    public void niveles() {
        if (root == null) return;

        Queue<Node<T>> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            Node<T> actual = cola.poll();
            System.out.print(actual.getValue() + " ");

            if (actual.getLeft() != null) {
                cola.add(actual.getLeft());
            }
            if (actual.getRight() != null) {
                cola.add(actual.getRight());
            }
        }
        System.out.println();
    }

    // === CÁLCULO DE LA ALTURA ===
    public int obtenerAltura() {
        return calcularAltura(root);
    }

    private int calcularAltura(Node<T> actual) {
        if (actual == null) {
            return 0; 
        }
        int alturaIzq = calcularAltura(actual.getLeft());
        int alturaDer = calcularAltura(actual.getRight());

        return Math.max(alturaIzq, alturaDer) + 1;
    }

    public int obtenerPeso(){
        return calcularPeso(root);
    }

    private int calcularPeso(Node<T> actual) {
        if(actual == null){
            return 0;
        }
        int alturaIzq = calcularPeso(actual.getLeft());
        int alturaDer = calcularPeso(actual.getRight());
        return (alturaIzq + alturaDer) + 1;
    }

    //Calcular el peso para que sea O(1)

    public int getPeso(){
        return peso;
    }

}

