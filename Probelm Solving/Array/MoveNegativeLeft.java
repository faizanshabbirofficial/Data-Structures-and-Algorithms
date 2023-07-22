import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveNegativeLeft {
  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-12, 11, -13, -5, 6, -7, 5, -3, -6));
    int low = 0;
    int high = arr.size() - 1;

    System.out.println(arr);

    while (low < high) {
      if (arr.get(low) < 0 && arr.get(high) < 0) {
        low++;
      } else if (arr.get(low) >= 0 && arr.get(high) < 0) {
        Collections.swap(arr, low, high);
        low++;
        high--;
      } else {
        high--;
      }
    }

    System.out.println(arr);

  }
}
