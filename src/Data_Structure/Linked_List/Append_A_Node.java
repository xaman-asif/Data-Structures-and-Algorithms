package Data_Structure.Linked_List;

public class Append_A_Node {

  static Node head = null;
  static Node createNode (int item, Node next) {
    Node newNode = new Node(item);
    newNode.next = next;
    return newNode;
  }

  static Node append(Node head, int item) {
    Node newNode = new Node(item);

    if (head == null) {
      return newNode;
    }

    Node currentNode = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }

    currentNode.next = newNode;

    return head;
  }

  public static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(20);

    a.next = b;


    head = a;
    append(a, 30);

    Node currentNode = head;
    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }
}
