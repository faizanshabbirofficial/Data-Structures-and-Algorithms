import java.util.Arrays;

public class KthMinMax {

  public static void main(String[] args) {
    int[] arr = { 7, 10, 4, 3, 20, 15 };

    // BubbleSort
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    Arrays.sort(arr);
    System.out.print("Kth Min: " + arr[3]);
    System.out.println();
    System.out.print("Kth Max: " + arr[arr.length - 3]);

  }

}
