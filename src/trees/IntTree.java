package trees;

import java.util.LinkedList;
import java.util.Queue;

// Clase que representa un árbol binario de enteros
public class IntTree {

    private Node<Integer> root;
    private int peso;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        this.root = node;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }

    // Método principal para insertar un valor desde fuera
    public void insert(Integer value) { 
        Node<Integer> node = new Node<Integer>(value);
        this.root = insertRecursivo(root, node);
        peso++;
    }

    // Recursivo para insertar valores ÁRBOL BINARIO DE BÚSQUEDA
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // Validar si es mayor o menor y decidir si lo ingreso a la der o izq
        if (actual.getValue() > nodeInsertar.getValue()) {
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

    private void preOrderRecursivo(Node<Integer> actual) {
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

    private void posOrderRecursivo(Node<Integer> actual) {
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

    private void inOrderRecursivo(Node<Integer> actual) {
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

        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            Node<Integer> actual = cola.poll();
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

    private int calcularAltura(Node<Integer> actual) {
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

    private int calcularPeso(Node<Integer> actual) {
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