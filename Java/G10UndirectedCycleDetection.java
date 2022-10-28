import java.util.*;

public class G10UndirectedCycleDetection {
    public int v;
    public ArrayList<LinkedList<Integer>> edg = new ArrayList<LinkedList<Integer>>();

    G10UndirectedCycleDetection(int ver) {
        v = ver;

        for (int i = 0; i < ver; i++) {
            edg.add(new LinkedList<Integer>());
        }
    }

    void add(int a, int b) {
        edg.get(a).add(b);
    }

    boolean isCyclicUtil(int a, boolean visited[], boolean stack[]) {

        if (stack[a] == true)
            return true;

        if (visited[a] == true)
            return false;

        visited[a] = true;
        stack[a] = true;

        for (Integer n : edg.get(a))
            if (isCyclicUtil(n, visited, stack))
                return true;

        stack[a] = false;
        return false;

    }

    boolean isCyclic() {
        boolean visited[] = new boolean[v];
        boolean stack[] = new boolean[v];

        for (int i = 0; i < v; i++)
            if (isCyclicUtil(i, visited, stack))
                return true;

        return false;
    }

    public static void main(String args[]) {

        G10UndirectedCycleDetection graph = new G10UndirectedCycleDetection(4);
        graph.add(0, 1);
        graph.add(0, 2);
        graph.add(1, 2);
        graph.add(2, 0);
        graph.add(2, 3);
        graph.add(3, 3);

        if (graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
}
