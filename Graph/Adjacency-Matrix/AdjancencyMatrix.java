import java.util.Scanner;

public class AdjancencyMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertex and edges: ");

        int vertex = sc.nextInt();
        int edges = sc.nextInt();

        int[][] AdjMatrix = new int[vertex][vertex];
        
        int u;
        int v;
        int weight;

        for(int i = 0; i < edges; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            weight = sc.nextInt();

            AdjMatrix[u][v] = weight;
            AdjMatrix[v][u] = weight;
        }
        for(int i = 0; i < vertex; i++) {
            for(int j = 0; j < vertex; j++) {
                System.out.print(AdjMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }  
}