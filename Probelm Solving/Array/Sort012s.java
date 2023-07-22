import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort012s {
  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 1, 2, 2, 1, 0, 0));
    int low = 0;
    int mid = 0;
    int high = arr.size() - 1;

    System.out.println(arr);

    while (mid <= high) {
      switch (arr.get(mid)) {

        case 0:
          Collections.swap(arr, low, mid);
          low++;
          mid++;
          break;

        case 1:
          mid++;
          break;

        case 2:
          Collections.swap(arr, high, mid);
          high--;
      }
    }

    System.out.println(arr);

  }
}
