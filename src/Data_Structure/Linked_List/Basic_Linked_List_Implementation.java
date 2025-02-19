//https://www.shafaetsplanet.com/planetcoding/?p=2689

package Data_Structure.Linked_List;

public class Basic_Linked_List_Implementation {
  static Node root = null;

  static void append(int data) {
    //see if the linked list was empty at the first place
    if (root == null) {
      root = new Node();

      root.data = data;
      root.next = null;
    } else {
      //copying address of root node to another node
      Node currentNode = root;

      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }

      Node newNode = new Node();
      newNode.data = data;
      newNode.next = null;

      currentNode.next = newNode;
    }
  }

  static void print() {
    Node currentNode = root;

    while (currentNode != null) {
      System.out.printf("%d", currentNode.data);
      currentNode = currentNode.next;
    }
  }

  static void deleteNode(int data) {
    Node currentNode = root;
    Node previousNode = null;

    //searching for the node
    while (currentNode.data != data) {
      //save the previous node before exit
      previousNode = currentNode;
      currentNode = currentNode.next;
    }

    //see if root is the wanted node
    if (currentNode == root) {
      currentNode = currentNode.next;
    } else {
      //previous node points current node's next node
      previousNode.next = currentNode.next;
    }
  }

  static void addNode(int data1, int data2, int data) {
    Node currentNode = root;

    //Searching for these two nodes
    while (currentNode.data != data1 && currentNode.next.data != data2)
    {
      currentNode = currentNode.next;
    }

    //creating a new node
    Node newNode = new Node();
    newNode.data = data;

    //injecting new node between two nodes
    newNode.next = currentNode.next;
    currentNode.next = newNode;
  }

  public static void main(String[] args) {
    append(1);
    append(2);
    addNode(1, 2, 5);
    append(3);
    print();
  }
}
