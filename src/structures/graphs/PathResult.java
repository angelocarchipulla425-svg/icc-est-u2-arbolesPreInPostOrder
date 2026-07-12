package structures.graphs;

import java.util.LinkedHashSet;

public class PathResult<T> {
    
    private final LinkedHashSet<T> visitados;
    private final LinkedHashSet<T> path;

    public PathResult(LinkedHashSet<T> visitados, LinkedHashSet<T> path) {
        this.visitados = visitados;
        this.path = path;
    }
    public LinkedHashSet<T> getVisitados() {
        return visitados;
    }
    public LinkedHashSet<T> getPath() {
        return path;
    }


    @Override
    public String toString() {
        return "PathResult"
            + "\nvisitados=" + visitados +  "\n" + (!path.isEmpty() ? "path=" + path + "]" : "No se encontro camino entre los nodos");
    }
    
    


}
