package Data_Structure.Tree.Binary_Tree;

import java.util.Scanner;

public class In_Order_Traversal_Binary_Tree {
  static void inOrder(Node root) {
    if (root.left != null) {
      inOrder(root.left);
    }
    System.out.printf("%s", root.data);
    if (root.right != null) {
      inOrder(root.right);
    }
  }

  static void createTree(Node root) {
    if (root == null) return;

    Scanner sc = new Scanner(System.in);

    String ans;
    System.out.printf("%s has any left child? ", root.data);

    ans = sc.next();

    if (ans.equalsIgnoreCase("Y")) {
      root.left = new Node();
      System.out.printf("Enter left child data of %s: ", root.data);
      root.left.data = sc.next();
    } else {
      root.left = null;
    }

    System.out.printf("%s has any right child?: ", root.data);
    ans = sc.next();
    if (ans.equalsIgnoreCase("Y")) {
      root.right = new Node();
      System.out.printf("Enter right child data of %s: ", root.data);
      root.right.data = sc.next();
    } else {
      root.right = null;
    }

    createTree(root.left);
    createTree(root.right);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Node root = new Node();
    System.out.printf("Enter root data: ");
    root.data = sc.next();

    createTree(root);
    inOrder(root);

    return;
  }
}
