package Data_Structure.Linked_List;

public class Creating_A_Node {

  //Creating a node
  static Node createNode(int item, Node next) {
    Node newNode = new Node();

    newNode.data = item;
    newNode.next = next;

    return newNode;
  }

  public static void main(String[] args) {
    Node node = createNode(10, null);
    System.out.printf("Data: %d\n", node.data);
  }
}
