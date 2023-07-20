public class MinMaxArray {

  public static int[] MinMaxFinder(int[] arr) {
    int min = 10000;
    int max = 0;

    for (int j : arr) {
      if (j > max) {
        max = j;
      }
      if (j < min) {
        min = j;
      }
    }

    int[] min_max = new int[2];
    min_max[0] = min;
    min_max[1] = max;

    return min_max;
  }
  public static void main(String[] args) {
    int[] arr = {10102, 4324324, 23413, 5,3,9,1,6,0,4, 12, 99, 34, 5,1, 6, 43243245};
    int[] min_max;
    min_max = MinMaxFinder(arr);
    for (int j : min_max) {
      if(j==0){
        System.out.print("Min: " + j + " ");
      }else {
        System.out.print("Max: " + j + " ");

      }
    }
  }
}
