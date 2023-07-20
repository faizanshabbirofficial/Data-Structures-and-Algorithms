public class LL {
  Node head;

  public class Node {

    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  public void prepend(String data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void append(String data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;

    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  public void insert(int index, String data) {

    Node newNode = new Node(data);
    Node currNode = head;
    Node temp;

    for (int i = 0; i < index - 1; i++) {
      currNode = currNode.next;
    }

    if (currNode == null) {
      System.out.println("Invalid index");
      return;
    }

    temp = currNode.next;
    currNode.next = newNode;
    newNode.next = temp;

  }

  public void traverse() {

    if (head == null) {
      System.out.println("Empty List");
      return;
    }

    Node currNode = head;

    while (currNode != null) {
      System.out.print(currNode.data + " --> ");
      currNode = currNode.next;
    }
    System.out.print("NULL");
  }

  public void deleteFirst() {

    if (head == null) {
      System.out.println("Empty List");
      return;
    }

    head = head.next;
  }

  public void deleteLast() {

    if (head == null) {
      System.out.println("Empty List");
      return;
    }

    if (head.next == null) {
      head = null;
      return;
    }

    Node prevNode = null;
    Node currNode = head;

    while (currNode.next != null) {
      prevNode = currNode;
      currNode = currNode.next;
    }

    prevNode.next = null;

  }

  public void remove(int index) {

    if (head == null) {
      System.out.println("Empty List");
      return;
    }

    if (index == 0) {
      head = head.next;
      return;
    }

    Node currNode = head;

    for (int i = 0; i < index - 1; i++) {
      currNode = currNode.next;
      if (currNode == null) {
        System.out.println("Invalid index");
        return;
      }

      currNode.next = currNode.next.next;

    }
  }

  public static void main(String[] args) {
    LL list = new LL();
    list.prepend("a");
    list.prepend("is");
    list.prepend("this");
    list.append("list");
    list.traverse();

    System.out.println();
    list.deleteLast();

    list.traverse();

    System.out.println();
    list.insert(2, "between");
    list.traverse();
    System.out.println();
    list.insert(4, "new");
    // list.insert(99, "new");
    list.traverse();
    System.out.println();

    list.remove(3);
    list.traverse();

  }
}