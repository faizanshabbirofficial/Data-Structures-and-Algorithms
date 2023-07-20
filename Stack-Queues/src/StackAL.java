import java.util.ArrayList;

public class StackAL {
  static class Stack {
    ArrayList<String> list = new ArrayList<>();

    public void push(String data) {
      list.add(data);
    }

    public boolean isEmpty() {
      return list.size() == 0;
    }

    public String pop() {
      if (isEmpty()) {
        return null;
      }
      String top = list.remove(list.size() - 1);
      return top;
    }

    public String peek() {
      if (isEmpty()) {
        return null;
      }
      return list.get(list.size() - 1);
    }
  }

  public static void main(String args[]) {
    Stack stack = new Stack();
    stack.push("Pakistan");
    stack.push("USA");
    stack.push("UK");
    stack.push("China");

    while (!stack.isEmpty()) {
      System.out.println(stack.peek());
      stack.pop();
    }
  }
}