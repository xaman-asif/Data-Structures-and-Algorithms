package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Level_of_All_Nodes {
  static int MAX = 100;
  static ArrayList<Integer>[] adj = new ArrayList[MAX];
  static int[] level = new int[MAX];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < MAX; i++) {
      adj[i] = new ArrayList<>();
    }

    int edges, source, nodes;
    System.out.print("How many nodes? ");
    nodes = sc.nextInt();
    System.out.print("How many edges? ");
    edges = sc.nextInt();

    for (int i = 1; i <= edges; i++) {
      int x, y;
      System.out.print("Enter Node P to Q: ");

      x = sc.nextInt();
      y = sc.nextInt();

      adj[x].add(y);
      adj[y].add(x);
    }

    System.out.print("Enter source S: ");
    source = sc.nextInt();

    bfs(source, edges, nodes);
  }

  public static void bfs(int source, int edges, int nodes) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(source);
    level[source] = 1;
    while (!queue.isEmpty())
    {
      int u = queue.peek();
      queue.remove();

      for (int i = 0; i < adj[u].size(); i++) {
        if (level[adj[u].get(i)] == 0) {
          int v = adj[u].get(i);
          level[v] = level[u] + 1;
          queue.add(v);
        }
      }
    }

    System.out.print("Level of all nodes: \n");
    for (int i = 0; i < nodes; i++) {
      System.out.printf("%d - %d\n", i, level[i]);
    }
  }
}
