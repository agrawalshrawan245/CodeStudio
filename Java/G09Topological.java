import java.util.*;

public class G09Topological {
    private int v;
    private ArrayList<LinkedList<Integer>> edg = new ArrayList<LinkedList<Integer>>();

    G09Topological(int n) {
        v = n;
        for (int i = 0; i < v; i++) {
            edg.add(new LinkedList<Integer>());
        }
    }

    void add(int a, int b) {
        edg.get(a).add(b);
    }

    void dfs(int a, boolean visited[]) {

        visited[a] = true;

        ListIterator<Integer> it = edg.get(a).listIterator();
        while (it.hasNext()) {
            int n = it.next();

            if (visited[n] == false) {
                visited[n] = true;
                dfs(n, visited);
            }
        }

        System.out.println(a);
    }

    void topologicalSort() {
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                dfs(i, visited);
            }
        }
    }

    public static void main(String args[]) {
        G09Topological g = new G09Topological(6);
        g.add(5, 2);
        g.add(5, 0);
        g.add(4, 0);
        g.add(4, 1);
        g.add(2, 3);
        g.add(3, 1);

        System.out.println("Following is a Topological sort of the given graph");

        g.topologicalSort();
    }
}
