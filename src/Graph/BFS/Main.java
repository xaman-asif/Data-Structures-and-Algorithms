
package Graph.BFS;

public class Main {
  public static void main(String[] args) {
    // Number of vertices in the graph
    int vertices = 5;

    // Create a graph
    Graph graph = new Graph(vertices);

    // Add edges to the graph
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 3);
    graph.addEdge(1, 4);
    graph.addEdge(2, 4);

    // Perform BFS traversal starting from vertex 0
    System.out.print(
        "Breadth First Traversal starting from vertex 0: ");
    graph.bfs(0);
  }
}
