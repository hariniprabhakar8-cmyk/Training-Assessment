package Module14;
import java.util.*;

public class ShortestPathBFS {

    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++)
            g.add(new ArrayList<>());

        addEdge(g, 0,1);
        addEdge(g, 0,2);
        addEdge(g, 1,3);
        addEdge(g, 2,4);

        shortest(g, 0);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }

    static void shortest(ArrayList<ArrayList<Integer>> g, int start) {
        int[] dist = new int[g.size()];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int adj : g.get(node)) {
                if (dist[adj] == -1) {
                    dist[adj] = dist[node] + 1;
                    q.add(adj);
                }
            }
        }

        System.out.println("Shortest distances: " + Arrays.toString(dist));
    }
}