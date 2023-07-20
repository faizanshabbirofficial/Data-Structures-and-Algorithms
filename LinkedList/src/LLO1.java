public class LLO1 {
  Node head;
  Node tail; // New tail reference

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
      tail = newNode; // Update tail for the first node
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void append(String data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      tail = newNode; // Update tail for the first node
      return;
    }

    tail.next = newNode; // Append new node after the tail
    tail = newNode; // Update tail to the new node
  }

  public void insert(int index, String data) {
    if (index < 0) {
      System.out.println("Invalid index");
      return;
    }

    if (index == 0) {
      prepend(data);
      return;
    }

    Node newNode = new Node(data);
    Node currNode = head;

    for (int i = 0; i < index - 1; i++) {
      if (currNode == null) {
        System.out.println("Invalid index");
        return;
      }
      currNode = currNode.next;
    }

    if (currNode == null) {
      System.out.println("Invalid index");
      return;
    }

    newNode.next = currNode.next;
    currNode.next = newNode;
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
      tail = null; // Update tail for an empty list
      return;
    }

    Node currNode = head;
    Node prevNode = null;

    while (currNode.next != null) {
      prevNode = currNode;
      currNode = currNode.next;
    }

    prevNode.next = null; // Remove the last node from the list
    tail = prevNode; // Update tail to the new last node
  }

  public void remove(int index) {
    if (index < 0) {
      System.out.println("Invalid index");
      return;
    }

    if (index == 0) {
      deleteFirst();
      return;
    }

    Node currNode = head;

    for (int i = 0; i < index - 1; i++) {
      if (currNode == null) {
        System.out.println("Invalid index");
        return;
      }

      currNode = currNode.next;
    }

    if (currNode == null || currNode.next == null) {
      System.out.println("Invalid index");
      return;
    }

    currNode.next = currNode.next.next;
  }

  public static void main(String[] args) {
    LLO1 list = new LLO1();
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
    list.traverse();
    System.out.println();

    list.remove(3);
    list.traverse();
  }
}
