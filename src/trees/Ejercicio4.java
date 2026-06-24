package trees;

public class Ejercicio4 {
    public void insert(int[] numeros) {
        // crear un arbol BTS - instanciar BinaryTrees
        BinaryTrees<Integer> tree = new BinaryTrees<>();
        
        // Insertar los numeros en el arbol
        for(int numero : numeros) {
            tree.insert(numero);
        }
        
        // Calcular la profundidad máxima e imprimirla
        int profundidad = maxDepth(tree.getRoot());
        System.out.println("Output: " + profundidad);
        System.out.println(); // Salto de línea extra para separar en la consola
    }



    // Calcular la profundidad
    private int maxDepth(Node<Integer> root) {
        // Caso base: si el nodo actual es null
        if (root == null) {
            return 0;
        }

        // Calcular recursivamente la profundidad del subárbol izquierdo
        int leftDepth = maxDepth(root.getLeft());
        
        // Calcular recursivamente la profundidad del subárbol derecho
        int rightDepth = maxDepth(root.getRight());

        // Evaluar cuál camino fue más largo
        if (leftDepth > rightDepth) {
            // Si la rama izquierda es más profunda, le sumamos 1 (por el nodo actual)
            return leftDepth + 1;
        } else {
            // Si la rama derecha es mayor o igual, usamos esa y le sumamos 1
            return rightDepth + 1;
        }
    }
}
