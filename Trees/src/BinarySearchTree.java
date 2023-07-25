import java.util.Scanner;

public class BinarySearchTree {

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

  BinarySearchTree() {
    root = null;
  }

  Node insertNode(Node root, Node new_node) {
    if (root == null) {
      root = new_node;
      System.out.println("Node has been inserted successfully\n");
      return root;
    } else if (new_node.value > root.value) {
      root.right = insertNode(root.right, new_node);
    } else if (new_node.value < root.value) {
      root.left = insertNode(root.left, new_node);
    } else {
      System.out.println("Duplicate Values are not Allowed\n");
      return root;
    }
    return root;
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

  // Find the inorder successor
  Node minValueNode(Node node) {
    Node current = node;

    // Find the leftmost leaf
    while (current != null && current.left != null)
      current = current.left;

    return current;
  }

  Node deleteNode(Node root, Node delete_node) {
    // Return if the tree is empty
    if (root == null)
      return root;

    // Find the node to be deleted
    if (delete_node.value < root.value)
      root.left = deleteNode(root.left, delete_node);
    else if (delete_node.value > root.value)
      root.right = deleteNode(root.right, delete_node);
    else {
      // If the node is with only one child or no child
      if (root.left == null) {
        Node temp = root.right;
        root = null;
        return temp;
      } else if (root.right == null) {
        Node temp = root.left;
        root = null;
        return temp;
      }

      // If the node has two children
      Node temp = minValueNode(root.right);

      // Place the inorder successor in position of the node to be deleted
      root.value = temp.value;

      // Delete the inorder successor
      root.right = deleteNode(root.right, temp);
    }
    return root;
  }

  public static void menu() {
    System.out.println("BST Insert and Display");
    System.out.println("0. Exit Program");
    System.out.println("1. Insert Node");
    System.out.println("2. Delete Node");
    System.out.println("3. Inorder");
    System.out.println("4. Preorder");
    System.out.println("5. Postorder");
  }

  public static void main(String[] args) {
    BinarySearchTree obj = new BinarySearchTree();
    Scanner scanner = new Scanner(System.in);
    int option, val;

    do {
      menu();
      System.out.print("Choose an Option: ");
      option = scanner.nextInt();

      Node new_node = obj.new Node();
      Node delete_node = obj.new Node();

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
          System.out.print("Enter the Value to be deleted: ");
          val = scanner.nextInt();
          delete_node.value = val;
          obj.root = obj.deleteNode(obj.root, delete_node);
          System.out.println();
          break;

        case 3:
          System.out.print("InOrder: ");
          obj.inOrder(obj.root);
          System.out.println("\n");
          break;

        case 4:
          System.out.print("PreOrder: ");
          obj.preOrder(obj.root);
          System.out.println("\n");
          break;

        case 5:
          System.out.print("PostOrder: ");
          obj.postOrder(obj.root);
          System.out.println("\n");
          break;
      }
    } while (option != 0);
    scanner.close();
  }

}
