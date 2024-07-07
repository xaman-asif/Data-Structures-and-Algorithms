package Graph.Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Directed_Graph_Using_Adjacency_List {
  static final int MAX = 100_000;
  static ArrayList<Integer>[] edges = new ArrayList[MAX];

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many nodes and edges?");
    int nnodes = scanner.nextInt();
    int nedges = scanner.nextInt();

    for (int i = 1; i <= nnodes; i++) {
      edges[i] = new ArrayList<>();
    }

    // Entering Directed Adjacency List
    for (int i =  1; i <= nedges; i++) {
      System.out.println("Enter Node P to Q:");
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      edges[x].add(y);
    }

    print(nnodes);
    inDegree(nnodes);
    outDegree();
    scanner.close();
  }

  static void print(int nnodes) {
    for (int i = 1; i <= nnodes; i++) {
      for (int j = 0; j < edges[i].size(); j++) {
        System.out.println(i + " " + edges[i].get(j));
      }
    }
  }

  static void inDegree(int nnodes) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which Node inDegree?");

    int x = scanner.nextInt();
    for (int i = 1; i <= nnodes; i++) {
      for (int j = 0; j < edges[i].size(); j++) {
        if (x == edges[i].get(j)) {
          System.out.println(i);
        }
      }
    }
  }

  static void outDegree() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which Node outDegree?");

    int x = scanner.nextInt();
    for (int i = 0; i < edges[x].size(); i++) {
      System.out.println(edges[x].get(i));
    }
  }
}
