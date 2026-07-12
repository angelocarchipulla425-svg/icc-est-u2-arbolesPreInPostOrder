package structures.graphs;

// - Interface => 
// - No contiene lógica interna
// - Define los metodos
// - No se puede instanciar

public interface PathFinder<T> {
    PathResult<T> find(Graph<T> graph, T start, T end);
}
