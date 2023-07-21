public class CircularQueue {

  int front;
  int rear;
  String[] queue;
  int size;

  CircularQueue(int size) {
    this.queue = new String[size];
    this.front = -1;
    this.rear = -1;
    this.size = size;
  }

  public void enqueue(String data) {

    if (isFull()) {
      System.out.println("Queue is Full");
      return;
    }
    if (isEmpty()) {
      this.front = 0;
    }
    this.rear = (this.rear + 1) % size;
    queue[rear] = data;
  }

  public String dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return null;
    }

    String data = queue[front];
    queue[front] = null;

    if (front == rear) {
      this.front = -1;
      this.rear = -1;
    } else {
      front = (front + 1) % size;
    }

    return data;

  }

  public boolean isEmpty() {
    return this.front == -1 && this.rear == -1;
  }

  public boolean isFull() {
    return ((rear + 1) % this.size == front);
  }

  public static void main(String[] args) {

    CircularQueue queue = new CircularQueue(5);
    queue.enqueue("1");
    queue.enqueue("2");
    queue.enqueue("3");
    queue.enqueue("4");
    queue.enqueue("5");
    queue.dequeue();
    queue.dequeue();
    queue.enqueue("1");
    queue.enqueue("2");
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.enqueue("1");
    queue.enqueue("2");
    queue.enqueue("3");
    queue.enqueue("4");
    queue.enqueue("5");

    while (!queue.isEmpty()) {
      System.out.println(queue.dequeue());
    }

  }

}
