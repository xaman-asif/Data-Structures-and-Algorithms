package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

// Class to represent a graph using adjacency list
public class Graph {
  int vertices;
  LinkedList<Integer>[] adjList;

  @SuppressWarnings("unchecked")
  Graph(int vertices) {
    this.vertices = vertices;
    adjList = new LinkedList[vertices];
    for (int i = 0; i < vertices; ++i) {
      adjList[i] = new LinkedList<>();
    }
  }

  // Function to add an edge to the graph
  void addEdge(int u, int v) {
    adjList[u].add(v);
  }

  // Function to perform Breadth First Search on a graph
  // represented using adjacency list
  void bfs(int startNode) {
    // Create a queue for BFS
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[vertices];

    // Mark the current node as visited and enqueue it
    visited[startNode] = true;
    queue.add(startNode);

    // Iterate over the queue
    while (!queue.isEmpty()) {
      // Dequeue a vertex from queue and print it
      int currentNode = queue.poll();
      System.out.print(currentNode + " ");

      // Get all adjacent vertices of the dequeued
      // vertex currentNode If an adjacent has not
      // been visited, then mark it visited and
      // enqueue it
      for (int neighbor : adjList[currentNode]) {
        if (!visited[neighbor]) {
          visited[neighbor] = true;
          queue.add(neighbor);
        }
      }
    }
  }
}