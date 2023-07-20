public class QueueLL {
  private Node front;
  private Node rear;

  private static class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  public void enqueue(String data) {
    Node newNode = new Node(data);

    if (front == null) {
      front = newNode;
      rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }

  }

  public String dequeue() {

    if (front == null) {
      System.out.println("Queue is empty");
      return null;
    }

    String data = front.data;
    front = front.next;

    if (front == null) {
      rear = null;
    }

    return data;
  }

  public boolean isEmpty() {
    return front == null;
  }

  public void traverse() {

    Node currNode = front;

    while (currNode != null) {
      System.out.println(currNode.data);
      currNode = currNode.next;
    }

  }

  public static void main(String[] args) {
    QueueLL queue = new QueueLL();

    queue.enqueue("Google");
    queue.enqueue("Apple");
    queue.enqueue("Microsoft");

    System.out.println("Dequeued item: " + queue.dequeue());
    queue.traverse();
  }
}
