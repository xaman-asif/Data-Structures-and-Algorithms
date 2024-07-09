
package Graph.BFS;

public class BFSRunner {
  public static void main(String[] args) {
    // Number of vertices in the graph
    int vertices = 5;

    // Create a graph
    BFSGraph BFSGraph = new BFSGraph(vertices);

    // Add edges to the graph
    BFSGraph.addEdge(0, 1);
    BFSGraph.addEdge(0, 2);
    BFSGraph.addEdge(1, 3);
    BFSGraph.addEdge(1, 4);
    BFSGraph.addEdge(2, 4);

    // Perform BFS traversal starting from vertex 0
    System.out.print(
        "Breadth First Traversal starting from vertex 0: ");
    BFSGraph.bfs(0);
  }
}
