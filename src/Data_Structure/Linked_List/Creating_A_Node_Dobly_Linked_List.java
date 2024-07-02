package Data_Structure.Linked_List;

public class Creating_A_Node_Dobly_Linked_List {
  static class Node {
    int data;
    Node next;
    Node prev;
  }

  static Node createNode(int item, Node next, Node prev) {
    Node newNode = new Node();

    newNode.data = item;
    newNode.next = next;
    newNode.prev = prev;

    return newNode;
  }

  public static void main(String[] args) {
    Node doblyLinkedList = createNode(10, null, null);
  }
}
