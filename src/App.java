import structures.BinaryTrees;
import structures.IntTree;
import structures.Person;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runPersonTree();
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Insertar los datos del ejercicio
        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); 
        arbolNumeros.insert(20); 
        arbolNumeros.insert(15); 

        // === PRUEBAS DE LOS RECORRIDOS ===

        System.out.println("--- RECORRIDOS DEL ARBOL ---");

        // 1. Pre Order
        System.out.print("Pre - order:  ");
        arbolNumeros.preOrder(); // R: 10 5 3 8 20 15

        // 2. In Order
        System.out.print("In - order:   ");
        arbolNumeros.inOrder();  // R: 3 5 8 10 15 20

        // 3. Post Order
        System.out.print("Post - order: ");
        arbolNumeros.posOrder(); // R: 3 8 5 15 20 10

        // 4. Niveles / Anchura
        System.out.print("Niveles:    ");
        arbolNumeros.niveles();  // R: 10 5 20 3 8 15

        // 5. Peso
        System.out.println("Pesos:    ");
        System.out.println(arbolNumeros.obtenerPeso());

        // 6. Peso O(1)
        System.out.println("Peso(compledijad, O(1)):");
        System.out.println(arbolNumeros.getPeso());

        System.out.println("----------------------------");

        // 6. Altura del árbol
        int altura = arbolNumeros.obtenerAltura();
        System.out.println("ALTURA DEL ARBOL: " + altura); // Debería ser: 3
    }

    private static void runPersonTree(){
        BinaryTrees<Person> personTree = new BinaryTrees<>();

        System.out.println("=== Ejemplo con tipo Persona ===");
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));
        personTree.insert(new Person("Rafael", 35));
        personTree.insert(new Person("Ana", 30));

        personTree.inOrder();
        System.out.println();

        // === PRUEBAS DE LOS RECORRIDOS ===

        System.out.println("--- RECORRIDOS DEL ARBOL ---");

        // 1. Pre Order
        System.out.print("Pre - order:  ");
        personTree.preOrder(); // R: 10 5 3 8 20 15

        // 2. In Order
        System.out.print("In - order:   ");
        personTree.inOrder();  // R: 3 5 8 10 15 20

        // 3. Post Order
        System.out.print("Post - order: ");
        personTree.posOrder(); // R: 3 8 5 15 20 10

        // 4. Niveles / Anchura
        System.out.print("Niveles:    ");
        personTree.niveles();  // R: 10 5 20 3 8 15

        // 5. Peso
        System.out.println("Pesos:    ");
        System.out.println(personTree.obtenerPeso());

        // 6. Peso O(1)
        System.out.println("Peso(compledijad, O(1)):");
        System.out.println(personTree.getPeso());

        System.out.println("----------------------------");

        // 6. Altura del árbol
        int altura = personTree.obtenerAltura();
        System.out.println("ALTURA DEL ARBOL: " + altura); // Debería ser: 3
    }
}