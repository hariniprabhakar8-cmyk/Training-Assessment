package Module14;
import java.util.*;

public class PrintNeighbors {
    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++)
            g.add(new ArrayList<>());

        addEdge(g, 0,1);
        addEdge(g, 0,2);
        addEdge(g, 1,3);
        addEdge(g, 2,4);

        int node = 0;

        System.out.print("Neighbors of " + node + ": ");
        for (int adj : g.get(node))
            System.out.print(adj + " ");
    }

    static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }
}