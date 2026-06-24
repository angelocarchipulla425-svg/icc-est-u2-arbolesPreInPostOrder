package trees;

public class Ejercicio2 {
    

    public void insert(int[] numeros){

        // crear un arbol BTS - instanciar BinaryTree
        BinaryTrees<Integer> tree = new BinaryTrees<>();

        // Insertar los numeros en el arbol
        for(int numero : numeros) {
            tree.insert(numero);
        }

        
        invert(tree.getRoot());
    }


    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el arbol: ");
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
    
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }

    public Node<Integer> invert(Node<Integer> root) {
        // 1. Imprimir el árbol original
        System.out.println("--- Arbol Original ---");
        printTree(root);
    
        // 2. Invertir la estructura físicamente
        invertRecursively(root);
    
        // 3. Imprimir el árbol ya invertido
        System.out.println("\n--- Arbol Invertido ---");
        printTree(root);
    
        return root;
    }

    public void invertRecursively(Node<Integer> root){
        if (root == null){
            return ;
        }

        Node<Integer> temporal = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temporal);

        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }
}
