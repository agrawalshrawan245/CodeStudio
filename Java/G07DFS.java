import java.util.*;

public class G07DFS {
    private int v;
    private ArrayList<LinkedList<Integer>> edge = new ArrayList<LinkedList<Integer>>();

    G07DFS(int vert) {
        v = vert;

        for (int i = 0; i < v; i++) {
            edge.add(new LinkedList<Integer>());
        }
    }

    void add(int a, int b) {
        edge.get(a).add(b);
    }

    void dfs(int a) {
        boolean visited[] = new boolean[v];

        LinkedList<Integer> q = new LinkedList<Integer>();

        visited[a] = true;
        q.add(a);

        while (q.size() != 0) {
            a = q.removeLast();
            System.out.println(a);

            ListIterator<Integer> li = edge.get(a).listIterator();
            while (li.hasNext()) {
                int n = li.next();
                if (visited[n] == false) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        G07DFS g = new G07DFS(6);

        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 2);
        g.add(2, 0);
        g.add(2, 3);
        g.add(3, 3);
        g.add(3, 4);
        g.add(4, 5);

        g.dfs(2);
    }

}
