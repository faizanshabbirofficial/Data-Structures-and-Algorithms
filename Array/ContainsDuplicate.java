//public class ContainsDuplicate {
//
//  public static int[] sortArr(int[] arr) {
//    int start = 0;
//    int end = arr.length-1;
//    int[] sortedArray;
//
//    int temp;
//    while (start < end) {
//
//      if (arr[start] <= arr[end]) {
//        start++;
//      } else {
//        temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        System.out.println(arr[end]);
//        end--;
//      }
//    }
//
//    return arr;
//  }
//
//  public static void main(String[] args) {
//
//    int[] arr = {10102, 4324324, 23413, 5,3,9,1,6,0,4, 12, 99, 34, 5,1, 6, 4324324};
//    int[] newArr = sortArr(arr);
//    for (int i:
//        newArr) {
//      System.out.print(i + " ");
//    }
//
//  }
//}

// public class ContainsDuplicate {
//   public static boolean hasDuplicates(int[] array) {
//     int length = array.length;

//     // Iterate through the array
//     for (int i = 0; i < length; i++) {
//       int currentValue = Math.abs(array[i]);

//       if (array[currentValue] >= 0) {
//         array[currentValue] = -array[currentValue];
//       } else {
//         return true;
//       }
//     }

//     return false;
//   }

//   public static void main(String[] args) {
//     int[] array = {1, 2, 3, 4, 5, 1}; // Example array with duplicates

//     if (hasDuplicates(array)) {
//       System.out.println("Array contains duplicate values.");
//     } else {
//       System.out.println("Array does not contain duplicate values.");
//     }
//   }
// }

import java.util.*;

public class ContainsDuplicate {

  public static boolean CheckDuplicate(int[] arr) {

    HashSet<Integer> set = new HashSet<>();

    for (int i : arr) {
      if (set.contains(i)) {
        System.out.println("Duplicate found: " + i);
        return true;
      } else {
        set.add(i);
      }
    }
    System.out.println("No Duplicates");

    return false;

    // HashMap<Integer, Integer> map = new HashMap<>();

    // for (int i : arr) {
    // if (map.containsKey(i)) {
    // System.out.println("duplicate found");
    // System.out.println(i);
    // return true;
    // } else {
    // map.put(i, null);
    // }

    // }

    // return false;
  }

  public static void main(String[] args) {

    // int[] arr = { 5, 3, 3, 1, 5, 6, 6, 4 };
    // int[] arr = { 2, 5, 2, 2, 3, 5, 1, 2, 4 };
    int[] arr = { 1, 2, 3, 4, 5, 6 };

    System.out.println(CheckDuplicate(arr));

  }
}
