public class QueueWithStack {

  private ArrayStack inputStack;
  private ArrayStack outputStack;
  private int size;

  public QueueWithStack(int size) {
    this.inputStack = new ArrayStack(size);
    this.outputStack = new ArrayStack(size);
    this.size = size;
  }

  public void enqueue(String data) {
    if (inputStack.length == size) {
      System.out.println("Queue Full");
      return;
    }
    inputStack.push(data);
  }

  public String dequeue() {
    if (isEmpty()) {
      System.out.println("Queue Empty");
      return null;
    }

    if (outputStack.isEmpty()) {
      while (!inputStack.isEmpty()) {
        outputStack.push(inputStack.pop());
      }
    }

    return outputStack.pop();
  }

  public boolean isEmpty() {
    return inputStack.isEmpty() && outputStack.isEmpty();
  }

  public void traverse() {
    if (isEmpty()) {
      System.out.println("Queue Empty");
      return;
    }

    System.out.print("Queue: ");
    for (int i = 0; i <= inputStack.length; i++) {
      System.out.print(inputStack.stack[i] + " ");
    }

    for (int i = outputStack.length; i >= 0; i--) {
      System.out.print(outputStack.stack[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    QueueWithStack queue = new QueueWithStack(5);

    queue.enqueue("Google");
    queue.enqueue("Apple");
    queue.enqueue("Microsoft");

    queue.traverse();

    System.out.println("Dequeued item: " + queue.dequeue());
    queue.traverse();
  }
}
