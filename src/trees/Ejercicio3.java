package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejercicio3 {

    public void insert(int[] numeros) {
        // crear un arbol BTS - instanciar BinaryTrees
        BinaryTrees<Integer> tree = new BinaryTrees<>();
        
        // Insertar los numeros en el arbol
        for(int numero : numeros) {
            tree.insert(numero);
        }
        
        // Imprimir los niveles del árbol
        printLevels(tree.getRoot());
    }

    // Método para imprimir con las flechas
    private void printLevels(Node<Integer> root) {
        System.out.println("Output:");
        
        List<List<Node<Integer>>> resultado = listLevels(root);

        for (List<Node<Integer>> nivel : resultado) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue()); 
                
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println(); 
        }
        System.out.println(); // Un salto extra
    }

    // Agrupa los nodos por niveles (BFS)
    private List<List<Node<Integer>>> listLevels(Node<Integer> root) {
        List<List<Node<Integer>>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node<Integer>> currentLevelList = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                Node<Integer> actual = queue.poll();
                currentLevelList.add(actual);

                if (actual.getLeft() != null) {
                    queue.offer(actual.getLeft());
                }
                
                if (actual.getRight() != null) {
                    queue.offer(actual.getRight());
                }
            }
            
            result.add(currentLevelList);
        }

        return result;
    }
}
