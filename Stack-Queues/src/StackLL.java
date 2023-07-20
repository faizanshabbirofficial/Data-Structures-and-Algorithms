public class StackLL {
  private Node top;

  private static class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  public void push(String data) {
    Node newNode = new Node(data);

    if (top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  public String pop() {
    if (top == null) {
      System.out.println("Empty Stack");
      return null;
    }

    String data = top.data;
    top = top.next;
    return data;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public void traverse() {
    if (top == null) {
      System.out.println("Empty Stack");
      return;
    }

    Node currNode = top;

    while (currNode != null) {
      System.out.print(currNode.data + " --> ");
      currNode = currNode.next;
    }
    System.out.print("NULL");
  }

  public static void main(String[] args) {
    StackLL stack = new StackLL();

    stack.push("Google");
    stack.push("Apple");
    stack.push("Microsoft");

    System.out.println("Popped item: " + stack.pop());
    stack.traverse();
  }
}
