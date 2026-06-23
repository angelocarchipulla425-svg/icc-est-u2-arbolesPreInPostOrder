package trees;

public class Ejercicio1 {

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

}
            
        

    

