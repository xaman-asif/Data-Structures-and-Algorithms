package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Breadth_First_Search_Using_Adjacency_List {
  static final int MAX = 100;
  static ArrayList<Integer>[] adj = new ArrayList[MAX];
  static int[] visited = new int[MAX];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < MAX; i++) {
      adj[i] = new ArrayList<>();
    }

    int edges, source;
    System.out.printf("How many edges? \n");
    edges = sc.nextInt();

    for (int i = 1; i <= edges; i++) {
      int x, y;
      System.out.printf("Enter Node P to Q: ");
      x = sc.nextInt();
      y = sc.nextInt();

      adj[x].add(y);
      adj[y].add(x);
    }

    System.out.printf("Enter Source S: ");

    source = sc.nextInt();

    bfs(source, edges);
  }

  private static void bfs(int source, int edges) {
    Queue<Integer> queue = new LinkedList<>();

    queue.add(source);
    visited[source] = 1;

    while (!queue.isEmpty()) {
      int u = queue.peek();
      queue.remove();

      for (int i = 0; i < adj[u].size(); i++) {
        if (visited[adj[u].get(i)] == 0) {
          int v = adj[u].get(i);
          visited[v] = 1;
          queue.add(v);
        }
      }
    }
  }
}
