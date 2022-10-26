import java.util.*;
// Problem statement :- Print BFS of a graph
// However this problem is not properly compiling here so I am trying to solve it by ArrayList instead of Array, check the solution from here.
// https://ide.geeksforgeeks.org/d45243c5-8efe-45f3-830a-9220051d54f2



public class G06BFS {
    private int v;
    private ArrayList<LinkedList<Integer>> edge = new ArrayList<LinkedList<Integer>>();

    G06BFS(int vert){
        v = vert;

        for(int i = 0; i < v; i++){
            edge.add(new LinkedList<Integer>());
        }
    }

    void add(int a, int b){
        edge.get(a).add(b);
    }

    void bfs(int a){
        boolean visited[] = new boolean[v];
        
        LinkedList<Integer> q = new LinkedList<Integer>();

        visited[a]=true;
        q.add(a);

        while(q.size() != 0){
            a = q.removeFirst();
            System.out.println(a);

            ListIterator<Integer> li = edge.get(a).listIterator();
            while(li.hasNext()){
                int n = li.next();
                if(visited[n] == false){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    

    public static void main (String args[]){
        G06BFS g = new G06BFS(4);

        g.add(0,1);
        g.add(0,2);
        g.add(1,2);
        g.add(2,0);
        g.add(2,3);
        g.add(3,3);

        g.bfs(2);
    }

}



// Check out this link to see in detail
// https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/



// A solution by using array

// public class test {
//     private int v;
//     private LinkedList<Integer> []edge;

//     test(int vert){
//         v = vert;

//         edge = new LinkedList[v];
//         for(int i = 0; i < v; i++){
//             edge[i] = new LinkedList<Integer>();
//         }
//     }

//     void add(int a, int b){
//         edge[a].add(b);
//     }

//     void bfs(int a){
//         boolean visited[] = new boolean[v];
        
//         LinkedList<Integer> q = new LinkedList<Integer>();

//         visited[a]=true;
//         q.add(a);

//         while(q.size() != 0){
//             a = q.removeFirst();
//             System.out.println(a);

//             ListIterator<Integer> li = edge[a].listIterator();
//             while(li.hasNext()){
//                 int n = li.next();
//                 if(visited[n] == false){
//                     visited[n] = true;
//                     q.add(n);
//                 }
//             }
//         }
//     }

    

//     public static void main (String args[]){
//         test g = new test(5);

//         g.add(0,1);
//         g.add(0,2);
//         g.add(1,2);
//         g.add(2,0);
//         g.add(2,3);
//         g.add(3,3);
//         g.add(3,4);

//         g.bfs(2);
//     }

// }
