package Module14;
import java.util.*;

public class BFS {
    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++)
            g.add(new ArrayList<>());

        addEdge(g, 0,1);
        addEdge(g, 0,2);
        addEdge(g, 1,3);
        addEdge(g, 2,4);

        bfs(g, 0);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> g, int start) {
        boolean[] visited = new boolean[g.size()];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int adj : g.get(node)) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    q.add(adj);
                }
            }
        }
    }
}