package Module14;
import java.util.*;

public class GraphAdjList {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        int v = 4;

        for (int i = 0; i < v; i++)
            graph.add(new ArrayList<>());

        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);

        System.out.println(graph);
    }

    static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}