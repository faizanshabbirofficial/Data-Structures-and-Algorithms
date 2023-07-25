
public class SelectionSort {

  public static void main(String[] args) {

    int[] arr = { 2, 8, 5, 3, 9, 4, 1 };

    int currentMinIndex;

    for (int i = 0; i < arr.length - 1; i++) {
      currentMinIndex = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[currentMinIndex]) {
          currentMinIndex = j;
        }
      }
      int temp = arr[currentMinIndex];
      arr[currentMinIndex] = arr[i];
      arr[i] = temp;

    }

    for (int i : arr) {
      System.out.println(i);
    }
  }
}
