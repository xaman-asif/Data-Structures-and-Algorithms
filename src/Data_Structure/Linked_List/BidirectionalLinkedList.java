package Data_Structure.Linked_List;

public class BidirectionalLinkedList {
  static DoublyNode root = null;
  static DoublyNode tail = null;

  static void append(int roll) {
    if (root == null) {
      root = new DoublyNode();
      root.roll = roll;
      root.next = null;
      tail = root;
    } else {
      DoublyNode newNode = new DoublyNode();
      newNode.roll = roll;
      newNode.next = null;
      tail.next = newNode;
      tail = tail.next;
    }
  }
}
