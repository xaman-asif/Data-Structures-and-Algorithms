package Data_Structure.Linked_List;

public class Remove_A_Node {

  static Node head;
  static Node removeNode(Node head, Node node) {
    if (node == head) {
      head = node.next;
      return head;
    }

    Node currentNode = head;

    while (currentNode != null) {
      if (currentNode.next != node) {
        break;
      }
      currentNode = currentNode.next;
    }

    if (currentNode == null) {
      return head;
    }

    currentNode.next = node.next;

    return head;
  }

  public static void main(String[] args) {
    Node a = new Node();
    Node b = new Node();
    Node c = new Node();

    a.data = 10;
    a.next = b;

    b.data = 20;
    b.next = c;

    c.data = 30;
    c.next = null;

    head = a;

    removeNode(head, b);

    Node currentNode = head;

    while (currentNode != null) {
      System.out.printf("%d\n", head.data);
      currentNode = currentNode.next;
    }

  }
}
