public class LinearSearch {

  public static int linearSearch(int[] arr, int key) {
    int size = arr.length - 1;

    for (int i = 0; i < size; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;

  }

  public static void main(String[] args) {

    int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15 };
    System.out.println(linearSearch(arr, 5));

  }

}
