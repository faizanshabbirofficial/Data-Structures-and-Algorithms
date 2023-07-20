public class QueueWithStack {

  QueueWithStack top;
  String[] stack;
  int length;
  int size;

  QueueWithStack(int size) {
    this.stack = new String[size];
    this.top = null;
    this.length = -1;
    this.size = size;
  }

  public void push(String data) {

    if (this.length == size) {
      System.out.println("Stack Full");
      return;
    } else {
      length++;
      stack[length] = data;
    }

  }

  public String pop() {
    if (this.length == -1) {
      System.out.println("Stack Empty");
      return null;
    }
    String temp = stack[length];
    stack[length] = null;
    length--;

    return temp;

  }

  public String peek() {

    if (this.length == -1) {
      System.out.println("Stack Empty");
      return null;
    }

    System.out.println(stack[length]);

    return stack[length];

  }

  public void traverseAll() {

    if (this.length == -1) {
      System.out.println("Stack Empty");
      return;
    }

    for (String string : stack) {
      System.out.println(string);

    }

  }

  public void traverse() {
    if (this.length == -1) {
      System.out.println("Stack Empty");
      return;
    }

    for (int i = 0; i <= length; i++) {
      System.out.println(stack[i]);
    }
  }

  public static void main(String[] args) {

    QueueWithStack stack = new QueueWithStack(5);
    stack.push("Pakistan");
    stack.push("USA");
    stack.push("UK");
    stack.push("Canada");
    stack.push("China");

    stack.peek();

    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();

    stack.traverse();

  }

}
