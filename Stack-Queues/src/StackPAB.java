import java.util.*;

public class StackPAB {

  public static void pushAtBottom(String data, Stack<String> stack) {
    if (stack.isEmpty()) {
      stack.push(data);
      return;
    }
    String top = stack.pop();
    pushAtBottom(data, stack);
    stack.push(top);

  }

  public static void main(String[] args) {

    Stack<String> stack = new Stack<>();
    stack.push("Pakistan");
    stack.push("USA");
    stack.push("China");
    pushAtBottom("Canada", stack);

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }

}
