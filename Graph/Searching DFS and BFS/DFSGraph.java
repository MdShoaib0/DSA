import java.util.*;

public class DFSGraph {
    private int V; // Number of vertices
    private List<List<Integer>> adj; // Adjacency list

    // Constructor to initialize the graph
    public DFSGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        // Initialize empty adjacency list for each vertex
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Function to add an undirected edge
    public void addEdge(int u, int v) {
        adj.get(u).add(v); // Add v to u's list
        adj.get(v).add(u); // Add u to v's list (for undirected graph)
    }

    // Recursive DFS utility function
    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true; // Mark current node as visited
        System.out.print(node + " "); // Print the node

        // Visit all unvisited adjacent nodes
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited); // Recursive call
            }
        }
    }

    // Recursive DFS traversal starting from a given node
    public void DFS(int start) {
        boolean[] visited = new boolean[V]; // Track visited nodes
        System.out.print("DFS Traversal (Recursive) starting from node " + start + ": ");
        dfsUtil(start, visited); // Start DFS
        System.out.println();
    }

    // Iterative DFS traversal using a stack
    public void dfs(int start) {
        boolean[] visited = new boolean[V]; // Track visited nodes
        Stack<Integer> stack = new Stack<>(); // Stack for DFS

        stack.push(start); // Push starting node

        System.out.print("DFS Traversal (Iterative) starting from node " + start + ": ");

        while (!stack.isEmpty()) {
            int node = stack.pop(); // Pop the top node

            if (!visited[node]) {
                visited[node] = true; // Mark it visited
                System.out.print(node + " "); // Print the node

                // Push adjacent unvisited neighbors in reverse order
                List<Integer> neighbors = adj.get(node);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor); // Push to stack
                    }
                }
            }
        }

        System.out.println();
    }

    // Main method to test the DFS implementations
    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(6); // Create a graph with 6 vertices: 0 to 5

        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        // Perform DFS
        g.DFS(0);  // Recursive DFS
        g.dfs(0);  // Iterative DFS
    }
}
