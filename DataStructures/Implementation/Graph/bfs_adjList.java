package DataStructures.Implementation.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class bfs_adjList {

    private int V;
    private LinkedList<Integer> adj[]; // Linked List of Linked List

    // Create a graph
    bfs_adjList(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; ++i)
            adj[i] = new LinkedList<>();
    }

    // Add edges to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void displayGraph() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print(i + " : ");

            for (Integer l : adj[i]) {
                System.out.print(l + " -> ");
            }
            System.out.print("END");
            System.out.println();
        }
    }

    public void iterative_bfs(int start) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);

        int[] visit = new int[V];

        while (queue.size() != 0) {
            int element = queue.poll();
            visit[element] = 1;
            System.out.print(element + " -> ");
            Iterator<Integer> it = adj[element].iterator();

            while (it.hasNext()) {
                int next = it.next();
                if (visit[next] == 0) {
                    queue.add(next);
                    visit[next] = 1;
                }
            }

        }

        System.out.println("END");

    }

    public static void main(String[] args) {

        int n = 4;
        int start = 2;
        bfs_adjList g = new bfs_adjList(n);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.displayGraph();

        // Recursive BFS

        // Iterative BFS -> Queue
        g.iterative_bfs(start);
    }
}
