package trees;

public class Ejercicio2 {
    

    public void insert(int[] numeros){

        // crear un arbol BTS - instanciar BinaryTree
        BinaryTrees<Integer> tree = new BinaryTrees<>();

        // Insertar los numeros en el arbol
        for(int numero : numeros) {
            tree.insert(numero);
        }

        // Imprimir el arbol
        printTree(tree.getRoot());
    }


    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el arbol: ");
        invert(root);
    }

    public Node<Integer> invert(Node<Integer> root) {
        // imprimir el árbol original
        printTree(root);
        invertRecursively(root);
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
