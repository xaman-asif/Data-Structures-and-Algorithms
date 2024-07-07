package Graph.Basic;

import java.util.Arrays;

public class AdjacencyList {
  // Total Nodes 10,000    0 to 9999.
  // Initialize them to -1.
  int[] head = new int[10_000];

  // Total edge 100,000
  int[] data = new int[100_000];
  int[] next = new int[100_000];
  // Global variable has initial value of 0
  int id = 0;

  public void fillArray() {
    Arrays.fill(head, -1); // Initialize head array to -1
  }

  // add node (y) in the list of (x)
  void insert(int x, int y) {
    data[id] = y;         // data is the array where data is stored in linked list
    next[id] = head[x];   // next[id] contains the address of previous node head[x]
    head[x] = id;         // head[x] is the list, it represents total number of nodes
    id++;                 // let's just think it as pointer or do it on paper
  }

  // erase last node from head of x
  void erase(int x) {
    // if you are not sure if the linked list empty check if head[x] == -1 or not
    head[x] = next[head[x]];
  }

  // search node (y) in the list of (x)
  boolean search(int x, int y) {
    for (int p = head[x]; p != -1; p = next[p]) { // that is the key to understand this whole thing
      // checking the data with all nodes of a adjacency list
      if (data[p] == y)
        return true; // that is found
    }
    return false; // not found
  }
}
