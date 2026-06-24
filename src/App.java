import trees.BinaryTrees;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.IntTree;
import trees.Person;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runPersonTree();
        runEjercicios();
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

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] { 5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros1 = new int[] { 5, 3, 7, 2, 4, 6, 8};
        ejercicio2.insert(numeros1);

        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] numeros3 = new int[] { 4, 2, 7, 1, 3, 6, 9};
        ejercicio3.insert(numeros3);

        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] numeros4 = new int[] { 4, 2, 7, 1, 3, 8, 9};
        ejercicio4.insert(numeros4);

    }
    
}