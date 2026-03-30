package Module14;
import java.util.*;
public class ConnectedComponents {
    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++)
            g.add(new ArrayList<>());

        addEdge(g, 0,1);
        addEdge(g, 1,2);
        addEdge(g, 3,4);

        boolean[] visited = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(g, i, visited);
                count++;
            }
        }

        System.out.println("Components: " + count);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }

    static void dfs(ArrayList<ArrayList<Integer>> g, int node, boolean[] visited) {
        visited[node] = true;

        for (int adj : g.get(node)) {
            if (!visited[adj])
                dfs(g, adj, visited);
        }
    }
}