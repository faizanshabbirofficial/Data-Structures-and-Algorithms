public class MyArray {
  public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
    int length = arr1.length + arr2.length;
    int[] mergedArray = new int[length];
    int ptr1 = 0;
    int ptr2 = 0;
    int i = 0;

    while (ptr1 < arr1.length || ptr2 < arr2.length) {
      if (ptr1 < arr1.length && ptr2 < arr2.length) {
        if (arr1[ptr1] < arr2[ptr2]) {
          mergedArray[i] = arr1[ptr1];
          ptr1++;
        } else {
          mergedArray[i] = arr2[ptr2];
          ptr2++;
        }
      } else if (ptr1 < arr1.length) {
        mergedArray[i] = arr1[ptr1];
        ptr1++;
      } else if (ptr2 < arr2.length) {
        mergedArray[i] = arr2[ptr2];
        ptr2++;
      }
      i++;
    }

    return mergedArray;
  }

  public static void main(String[] args) {
    int[] arr1 = { 0, 3, 4, 31 };
    int[] arr2 = { 4, 6, 30 };
    int[] mergedArray = mergeSortedArrays(arr1, arr2);

    for (int j : mergedArray) {
      System.out.print(j + " ");
    }
  }
}
