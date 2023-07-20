import java.util.*;

public class ContainsDuplicate {

  public static boolean CheckDuplicate(int[] arr) {

    HashSet<Integer> set = new HashSet<>();

    for (int i : arr) {
      if (set.contains(i)) {
        System.out.println("Duplicate found: " + i);
        return true;
      } else {
        set.add(i);
      }
    }
    System.out.println("No Duplicates");

    return false;
  }

  public static void main(String[] args) {

    // int[] arr = { 5, 3, 3, 1, 5, 6, 6, 4 };
    // int[] arr = { 2, 5, 2, 2, 3, 5, 1, 2, 4 };
    int[] arr = { 1, 2, 3, 4, 5, 6 };

    System.out.println(CheckDuplicate(arr));

  }
}
