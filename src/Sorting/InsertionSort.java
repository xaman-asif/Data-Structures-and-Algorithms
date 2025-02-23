package Sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {7, 5, 9, 2, 8};
    System.out.println(insertionSort(arr));
  }

  private static int[] insertionSort(int[] arr) {
    for (int i = 0; i <= arr.length - 1; i++) {
      for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
      }
    }

    return arr;
  }
}
