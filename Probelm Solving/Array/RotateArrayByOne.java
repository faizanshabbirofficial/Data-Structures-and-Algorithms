public class RotateArrayByOne {

  public static int[] rotateArray(int[] arr) {

    int low = 0;
    int high = arr.length - 1;
    int temp = 0;

    for (int i = 0; i < arr.length; i++) {

      temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;

    }

    return arr;

  }

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };
    int[] rotatedArray;

    for (int i : arr) {
      System.out.print(i + " ");
    }

    System.out.println();

    rotatedArray = rotateArray(arr);

    for (int i : rotatedArray) {
      System.out.print(i + " ");

    }

    System.out.println();

    rotatedArray = rotateArray(arr);

    for (int i : rotatedArray) {
      System.out.print(i + " ");

    }

    System.out.println();

    rotatedArray = rotateArray(arr);

    for (int i : rotatedArray) {
      System.out.print(i + " ");

    }
  }

}
