package Module14;
import java.util.*;

public class DetectCycle {
    public static void main(String[] args) {

        int v = 3;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++)
            g.add(new ArrayList<>());

        addEdge(g, 0,1);
        addEdge(g, 1,2);
        addEdge(g, 2,0); // cycle

        boolean[] visited = new boolean[v];

        if (dfs(g, 0, -1, visited))
            System.out.println("Cycle Detected");
        else
            System.out.println("No Cycle");
    }

    static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> g, int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int adj : g.get(node)) {
            if (!visited[adj]) {
                if (dfs(g, adj, node, visited))
                    return true;
            } else if (adj != parent) {
                return true;
            }
        }
        return false;
    }
}