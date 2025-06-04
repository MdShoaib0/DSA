import java.util.ArrayList;

public class AdjacencyList {

    private int V;
    private ArrayList<ArrayList<Integer>> adjList;

    public AdjacencyList(int V) {

        this.V = V;
        this.adjList = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdges(int u, int v) {

        adjList.get(v).add(u);
        adjList.get(u).add(v);

    }

    public void printAdjacencyList() {

        System.out.println("AdjacencyList : ");
        for(int i = 0; i < adjList.size(); i++) {
            for(int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j)+" -> ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        AdjacencyList graphList = new AdjacencyList(6);

        graphList.addEdges(0, 1);
        graphList.addEdges(2, 4);
        graphList.addEdges(0, 5);
        graphList.addEdges(0,3);
        graphList.addEdges(3, 0);

        graphList.printAdjacencyList();

    }
}