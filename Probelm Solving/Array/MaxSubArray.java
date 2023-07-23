public class MaxSubArray {

  public static int findMaxSub(int[] arr) {
    int currentMaxSum = 0;
    int maxSum = arr[0];
    int start = 0;
    int end = 0;

    for (int i = 0; i < arr.length; i++) {

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

    System.out.print("[ ");
    for (int i = start; i <= end; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("]");

    return maxSum;
  }

  public static void main(String[] args) {

    // int[] arr = { 1, 2, 3, -2, 5 };
    // int[] arr = { 5, -4, -2, 6, -1 };
    int[] arr = { 5, -4, -2, 6, -1, 2, 9, 3, -1 };
    int maxSum = findMaxSub(arr);
    System.out.println(maxSum);

  }

}
