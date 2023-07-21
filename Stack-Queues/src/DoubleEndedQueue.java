public class DoubleEndedQueue {

  int front;
  int rear;
  String[] queue;
  int size;

  DoubleEndedQueue(int size) {
    this.queue = new String[size];
    this.front = -1;
    this.rear = -1;
    this.size = size;
  }

  public void enqueueFront(String data) {
    if (isFull()) {
      System.out.println("Queue is Full");
      return;
    }
    if (isEmpty()) {
      this.front = 0;
      this.rear = 0;
    }
    this.front = (this.front - 1 + size) % size;
    queue[front] = data;
  }

  public void enqueueRear(String data) {
    if (isFull()) {
      System.out.println("Queue is Full");
      return;
    }
    if (isEmpty()) {
      this.front = 0;
      this.rear = 0;
    }
    this.rear = (this.rear + 1) % size;
    queue[rear] = data;
  }

  public String dequeueFront() {
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

  public String dequeueRear() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return null;
    }
    String data = queue[rear];
    queue[rear] = null;
    if (front == rear) {
      this.front = -1;
      this.rear = -1;
    } else {
      rear = (rear - 1 + size) % size;
    }
    return data;
  }

  public boolean isEmpty() {
    return this.front == -1 && this.rear == -1;
  }

  public boolean isFull() {
    return (rear + 1) % size == front || (front == 0 && rear == size - 1) || front == rear + 1;
  }

  public static void main(String[] args) {
    DoubleEndedQueue queue = new DoubleEndedQueue(5);

    queue.enqueueFront("1");
    queue.enqueueFront("2");

    queue.enqueueRear("3");
    queue.enqueueRear("4");

    System.out.println("Dequeuing from the front:");
    System.out.println(queue.dequeueFront());
    System.out.println(queue.dequeueFront());

    queue.enqueueRear("5");
    queue.enqueueRear("6");

    System.out.println("Dequeuing from the rear:");
    System.out.println(queue.dequeueRear());
    System.out.println(queue.dequeueRear());
    System.out.println(queue.dequeueRear());
    System.out.println(queue.dequeueRear());

    System.out.println(queue.dequeueFront());
    System.out.println(queue.dequeueRear());
  }

}
