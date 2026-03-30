package Module14;
import java.util.*;

public class CountEdgesVertices {
    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++)
            g.add(new ArrayList<>());

        addEdge(g, 0,1);
        addEdge(g, 0,2);
        addEdge(g, 1,3);
        addEdge(g, 2,4);

        int vertices = g.size();
        int edges = 0;

        for (ArrayList<Integer> list : g)
            edges += list.size();

        edges = edges / 2;

        System.out.println("Vertices: " + vertices);
        System.out.println("Edges: " + edges);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }
}