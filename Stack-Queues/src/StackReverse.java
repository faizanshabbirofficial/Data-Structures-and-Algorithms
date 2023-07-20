import java.util.*;

public class StackReverse {
  public static void pushAtBottom(Stack<String> stack, String data) {
    if (stack.isEmpty()) {
      stack.push(data);
      return;
    }

    String temp = stack.pop();
    pushAtBottom(stack, data);
    stack.push(temp);
  }

  public static void reverse(Stack<String> stack) {
    if (stack.isEmpty()) {
      return;
    }

    String top = stack.pop();
    reverse(stack);
    pushAtBottom(stack, top);
  }

  public static void main(String args[]) {
    Stack<String> stack = new Stack<>();
    stack.push("Pakistan");
    stack.push("USA");
    stack.push("Canada");

    reverse(stack);

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}