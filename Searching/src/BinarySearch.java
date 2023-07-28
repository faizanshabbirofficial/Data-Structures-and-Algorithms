
public class BinarySearch {

  public static int binarySearch(int[] arr, int key) {
    return binarySearchRecursive(arr, key, 0, arr.length - 1);

  }

  public static int binarySearchRecursive(int[] arr, int key, int left, int right) {

    if (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] > key) {
        return binarySearchRecursive(arr, key, left, mid - 1);
      } else {
        return binarySearchRecursive(arr, key, mid + 1, right);
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15 };
    System.out.println(binarySearch(arr, 11));

  }

}
