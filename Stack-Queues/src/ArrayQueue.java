public class ArrayQueue {

  String[] queue;
  int front;
  int rear;
  int size;

  ArrayQueue(int size) {
    queue = new String[size];
    this.front = 0;
    this.rear = -1;
    this.size = size;
  }

  public void enqueue(String data) {
    if (isFull()) {
      System.out.println("Queue is Full");
      return;
    }

    rear++;
    queue[rear] = data;
  }

  public String dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return null;
    }

    String data = queue[front];
    front++;

    if (front > rear) {
      front = 0;
      rear = -1;
    }

    return data;
  }

  public boolean isEmpty() {
    return rear < front;
  }

  public boolean isFull() {
    return rear == size - 1;
  }

  public static void main(String[] args) {
    ArrayQueue queue = new ArrayQueue(5);
    queue.enqueue("Pakistan");
    queue.enqueue("USA");
    queue.enqueue("UK");
    queue.enqueue("Canada");
    queue.enqueue("China");
    queue.enqueue("bruh");

    while (!queue.isEmpty()) {
      System.out.println(queue.dequeue());
    }
  }
}
