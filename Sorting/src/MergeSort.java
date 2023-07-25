public class MergeSort {

  public static void conquer(int[] arr, int startIndex, int midIndex, int endIndex, int[] mergedArray) {

    int index = startIndex;
    int indexLeft = startIndex;
    int indexRight = midIndex + 1;

    while (indexLeft <= midIndex && indexRight <= endIndex) {
      if (arr[indexLeft] < arr[indexRight]) {
        mergedArray[index] = arr[indexLeft];
        index++;
        indexLeft++;
      } else {
        mergedArray[index] = arr[indexRight];
        index++;
        indexRight++;
      }
    }

    while (indexLeft <= midIndex) {
      mergedArray[index] = arr[indexLeft];
      index++;
      indexLeft++;
    }

    while (indexRight <= endIndex) {
      mergedArray[index] = arr[indexRight];
      index++;
      indexRight++;
    }

    for (int i = startIndex; i <= endIndex; i++) {
      arr[i] = mergedArray[i];

    }
  }

  public static void divide(int[] arr, int startIndex, int endIndex, int[] mergedArray) {

    int midIndex = startIndex + (endIndex - startIndex) / 2;

    if (startIndex >= endIndex) {
      return;
    }

    divide(arr, startIndex, midIndex, mergedArray);
    divide(arr, midIndex + 1, endIndex, mergedArray);
    conquer(arr, startIndex, midIndex, endIndex, mergedArray);
  }

  public static void main(String[] args) {

    int[] arr = { 6, 3, 9, 5, 2, 8 };
    int size = arr.length;
    int[] mergedArray = new int[size];

    System.out.print("[ ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.print("]");

    divide(arr, 0, size - 1, mergedArray);
    System.out.println();

    System.out.print("[ ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.print("]");
  }

}
