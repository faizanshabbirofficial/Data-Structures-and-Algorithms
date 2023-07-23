import java.util.*;

public class UnionIntersection {

  public static ArrayList<Integer> doUnion(int[] arr1, int[] arr2) {
    HashSet<Integer> unionSet = new HashSet<>(Arrays.asList());

    for (int i : arr1) {
      unionSet.add(i);
    }

    for (int i : arr2) {
      unionSet.add(i);
    }

    ArrayList<Integer> unionList = new ArrayList<>(Arrays.asList());

    for (Integer i : unionSet) {
      unionList.add(i);
    }

    return unionList;

  }

  public static ArrayList<Integer> doIntersection(int[] arr1, int[] arr2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    for (int i : arr1) {
      set1.add(i);
    }

    for (int i : arr2) {
      set2.add(i);
    }

    ArrayList<Integer> intersectionList = new ArrayList<>();

    for (Integer i : set1) {
      if (set2.contains(i)) {
        intersectionList.add(i);
      }
    }

    return intersectionList;

  }

  public static void main(String[] args) {
    // int[] arr1 = { 1, 2, 3, 4, 5 };
    // int[] arr2 = { 1, 2, 3 };

    int[] arr1 = { 85, 25, 1, 32, 54, 6 };
    int[] arr2 = { 85, 2 };

    ArrayList<Integer> union = doUnion(arr1, arr2);
    ArrayList<Integer> intersection = doIntersection(arr1, arr2);

    System.out.println(union + " of size: " + union.size());
    System.out.println(intersection + " of size: " + intersection.size());

  }
}
