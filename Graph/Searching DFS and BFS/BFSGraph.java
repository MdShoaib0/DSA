import java.util.*;

public class BFSGraph {
    private int V; // number of vertices
    private List<List<Integer>> adj; // adjacency list

    // Constructor
    public BFSGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge (undirected by default)
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Remove this line for directed graph
    }

    // BFS traversal from a given starting node
    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        System.out.print("BFS Traversal starting from node " + start + ": ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }

    // main function to test
    public static void main(String[] args) {
        BFSGraph g = new BFSGraph(6); // Graph with 6 nodes: 0 to 5

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        g.BFS(0); // Start BFS from node 0
    }
}
