import java.util.Scanner;

public class BinaryTree {

  class Node {
    int value;
    Node left;
    Node right;

    Node() {
      value = 0;
      left = null;
      right = null;
    }

    Node(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }

  Node root;

  BinaryTree() {
    root = null;
  }

  Node insertNode(Node root, Node new_node) {
    if (root == null) {
      root = new_node;
      System.out.println("Node has been inserted successfully\n");
      return root;
    } else {
      // We can insert the new node in either left or right child of the current node
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter 'L' to insert on the left, 'R' to insert on the right of " + root.value + ": ");
      String choice = scanner.next();

      if (choice.equalsIgnoreCase("L")) {
        root.left = insertNode(root.left, new_node);
      } else if (choice.equalsIgnoreCase("R")) {
        root.right = insertNode(root.right, new_node);
      } else {
        System.out.println("Invalid choice. Node not inserted.\n");
      }
      scanner.close();
      return root;
    }

  }

  void inOrder(Node root) {
    if (root == null)
      return;

    inOrder(root.left);
    System.out.print(root.value + " ");
    inOrder(root.right);
  }

  void preOrder(Node root) {
    if (root == null)
      return;

    System.out.print(root.value + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  void postOrder(Node root) {
    if (root == null)
      return;

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.value + " ");
  }

  public static void menu() {
    System.out.println("Binary Tree Insert and Display");
    System.out.println("0. Exit Program");
    System.out.println("1. Insert Node");
    System.out.println("2. Inorder");
    System.out.println("3. Preorder");
    System.out.println("4. Postorder");
  }

  public static void main(String[] args) {
    BinaryTree obj = new BinaryTree();
    Scanner scanner = new Scanner(System.in);
    int option, val;

    do {
      menu();
      System.out.print("Choose an Option: ");
      option = scanner.nextInt();

      Node new_node = obj.new Node();

      switch (option) {
        case 0:
          System.out.println("Program Exited Successfully\n");
          break;

        case 1:
          System.out.print("Enter the Value to be inserted: ");
          val = scanner.nextInt();
          new_node.value = val;
          obj.root = obj.insertNode(obj.root, new_node);
          System.out.println();
          break;

        case 2:
          System.out.print("InOrder: ");
          obj.inOrder(obj.root);
          System.out.println("\n");
          break;

        case 3:
          System.out.print("PreOrder: ");
          obj.preOrder(obj.root);
          System.out.println("\n");
          break;

        case 4:
          System.out.print("PostOrder: ");
          obj.postOrder(obj.root);
          System.out.println("\n");
          break;
      }
    } while (option != 0);
    scanner.close();
  }
}
