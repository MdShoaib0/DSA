public class AdjacencyMatrix {

    private int V;
    private int[][] AdjMatrix;

    public AdjacencyMatrix(int V) {
        this.V = V;
        this.AdjMatrix = new int[V][V];
    }

    public void addEdges(int u, int v) {
        AdjMatrix[u][v] = 1;
        AdjMatrix[v][u] = 1;
    }

    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(AdjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix matrix = new AdjacencyMatrix(6);
        matrix.addEdges(0, 1);
        matrix.addEdges(0, 2);
        matrix.addEdges(1, 3);
        matrix.addEdges(0, 3);
        matrix.printAdjacencyMatrix();
    }
}
