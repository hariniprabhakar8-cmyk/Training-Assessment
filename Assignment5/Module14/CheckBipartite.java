package Module14;
import java.util.*;

public class CheckBipartite {
    public static void main(String[] args) {

        int v = 4;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++)
            g.add(new ArrayList<>());

        addEdge(g, 0,1);
        addEdge(g, 1,2);
        addEdge(g, 2,3);

        System.out.println(isBipartite(g));
    }

    static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }

    static boolean isBipartite(ArrayList<ArrayList<Integer>> g) {
        int[] color = new int[g.size()];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int adj : g.get(node)) {
                if (color[adj] == -1) {
                    color[adj] = 1 - color[node];
                    q.add(adj);
                } else if (color[adj] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}