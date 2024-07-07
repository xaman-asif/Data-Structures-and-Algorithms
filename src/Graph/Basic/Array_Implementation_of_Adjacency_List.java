package Graph.Basic;

public class Array_Implementation_of_Adjacency_List {
  public static void main(String[] args) {
    AdjacencyList list = new AdjacencyList();

    list.fillArray();

    // let's imagine this list
        /*
        0 : 1 -> 2 -> /
        1 : 0 -> 2 -> 4 -> /
        2 : 0 -> 1 -> 3 -> /
        3 : 2 -> 4 -> /
        4 : 1 -> 3 -> /
        */
    // Adding all the nodes to the corresponding list
    list.insert(0, 1);
    list.insert(0, 2);
    list.insert(1, 0);
    list.insert(1, 2);
    list.insert(1, 4);
    list.insert(2, 0);
    list.insert(2, 1);
    list.insert(2, 3);
    list.insert(3, 2);
    list.insert(3, 4);
    list.insert(4, 1);
    list.insert(4, 3);

    // Searching the node '4' in the list '1'
    System.out.println(list.search(1, 4) ? "Found" : "Not Found");

    // Erasing the node '4' from the list '1'
    list.erase(1);

    // Again searching the node '4' in the list '1'
    System.out.println(list.search(1, 4) ? "Found" : "Not Found");

    // Have a nice day :-)
  }
}
