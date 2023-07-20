//public class MyArray {
//  private int[] array;
//  private int size;
//
//  public MyArray(int capacity) {
//    array = new int[capacity];
//    size = 0;
//  }
//
//  public int getSize() {
//    return size;
//  }
//
//  public int get(int index) {
//
//    return array[index];
//  }
//
//
//}

//public class MyArray {
//  public static void main(String[] args) {
//
//    String text = "this is some text";
//    int start, end;
//    start = 0;
//    end = text.length()-1;
//
//    char[] charText = text.toCharArray();
//
//    while (start < end) {
//      char temp;
//      temp = charText[start];
//      charText[start] = charText[end];
//      charText[end] = temp;
//      start++;
//      end--;
//    }
//
//    String reversedText = new String(charText);
//    System.out.println(reversedText);
//  }
//}

//public class MyArray {
//  public static String reverseString(String text) {
//    int length  = text.length();
//    StringBuilder reversedText = new StringBuilder(length);
//    for (int i = length-1; i >= 0; i--){
//      reversedText.append(text.charAt(i));
//    }
//    return reversedText.toString();
//  }
//
//  public static void main(String[] args) {
//    String text = "this is some text";
//    String reversedText = reverseString(text);
//    System.out.println(reversedText);
//  }
//}

//public class MyArray {
//  public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//    int length = arr1.length + arr2.length;
//    int[] mergedArray = new int[length];
//    int ptr1 = 0;
//    int ptr2 = 0;
//    int ptr3 = 0;
//
//    while (ptr1 < arr1.length && ptr2 < arr2.length) {
//      if (arr1[ptr1] <= arr2[ptr2]) {
//        mergedArray[ptr3] = arr1[ptr1];
//        ptr1++;
//      } else {
//        mergedArray[ptr3] = arr2[ptr2];
//        ptr2++;
//      }
//      ptr3++;
//    }
//
//    while (ptr1 < arr1.length) {
//      mergedArray[ptr3] = arr1[ptr1];
//      ptr1++;
//      ptr3++;
//    }
//
//    while (ptr2 < arr2.length) {
//      mergedArray[ptr3] = arr2[ptr2];
//      ptr2++;
//      ptr3++;
//    }
//
//    return mergedArray;
//  }
//
//  public static void main(String[] args) {
//    int[] arr1 = {0, 3, 4, 31};
//    int[] arr2 = {4, 6, 30};
//    int[] mergedArray = mergeSortedArrays(arr1, arr2);
//
//    // Print the mergedArray
//    for (int i = 0; i < mergedArray.length; i++) {
//      System.out.print(mergedArray[i] + " ");
//    }
//  }
//}

//public class MyArray {
//  public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//    int length = arr1.length + arr2.length;
//    int[] mergedArray = new int[length];
//    int ptr3 = 0;
//
//    for (int i=0; i<=arr1.length-1; i++) {
//      mergedArray[ptr3] = arr1[i];
//      ptr3++;
//    }
//
//    for (int i=0; i<=arr2.length-1; i++) {
//      mergedArray[ptr3] = arr2[i];
//      ptr3++;
//    }
//
//    int ptr1 = 0;
//    int ptr2 = mergedArray.length-1;
//
//    while (ptr1 <= ptr2) {
//      if (mergedArray[ptr1] <= mergedArray[ptr2]) {
//        ptr1++;
//      } else {
//        int temp = mergedArray[ptr1];
//        mergedArray[ptr1] = mergedArray[ptr2];
//        mergedArray[ptr2] = temp;
//        ptr2--;
//      }
//    }
//
//
//
//    return mergedArray;
//  }
//
//  public static void main(String[] args) {
//    int[] arr1 = {0, 3, 4, 31, 56,34,12,11,99};
//    int[] arr2 = {4, 6, 30};
//    int[] mergedArray = mergeSortedArrays(arr1, arr2);
//
//    for (int j : mergedArray) {
//      System.out.print(j + " ");
//    }
//  }
//}

//public class MyArray {
//  public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//    int length = arr1.length + arr2.length;
//    int[] mergedArray = new int[length];
//    int ptr1 = 0;
//    int ptr2 = 0;
//    int i = 0;
//
//    while (ptr1 < arr1.length && ptr2 < arr2.length) {
//      if (arr1[ptr1] < arr2[ptr2]) {
//        mergedArray[i] = arr1[ptr1];
//        ptr1++;
//      } else {
//        mergedArray[i] = arr2[ptr2];
//        ptr2++;
//      }
//      i++;
//    }
//
//    while (ptr1 < arr1.length) {
//      mergedArray[i] = arr1[ptr1];
//      ptr1++;
//      i++;
//    }
//
//    while (ptr2 < arr2.length) {
//      mergedArray[i] = arr2[ptr2];
//      ptr2++;
//      i++;
//    }
//
//
//
//
//    return mergedArray;
//  }
//
//  public static void main(String[] args) {
//    int[] arr1 = {0, 3, 4, 31};
//    int[] arr2 = {4, 6, 30};
//    int[] mergedArray = mergeSortedArrays(arr1, arr2);
//
//    for (int j : mergedArray) {
//      System.out.print(j + " ");
//    }
//  }
//}

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
