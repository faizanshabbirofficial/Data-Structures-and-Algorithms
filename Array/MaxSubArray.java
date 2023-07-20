public class MaxSubArray {

  public static int maxSub(int[] arr) {
    int currentMaxSum = arr[0]; // Initialize with the first element
    int maxSum = arr[0]; // Initialize with the first element
    int start = 0;
    int end = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > currentMaxSum + arr[i]) {
        currentMaxSum = arr[i];
        start = i;
      } else {
        currentMaxSum = currentMaxSum + arr[i];
        end = i;
      }

      if (currentMaxSum > maxSum) {
        maxSum = currentMaxSum;
      }
    }

    System.out.println("Maximum Subarray:");
    System.out.print("[ ");
    for (int i = start; i < end; i++) {
      System.out.print(arr[i]);
      System.out.print(" ");
    }
    System.out.println("]");

    return maxSum;
  }

  public static void main(String[] args) {

    // int[] arr = { 5, -4, -2, 6, -1 };
    int[] arr = { 5, -4, -2, 6, -1, 2, 9, 3, -1 };

    System.out.println(maxSub(arr));

  }
}