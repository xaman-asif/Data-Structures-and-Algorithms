package Sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {7, 5, 9, 2, 8};
    System.out.println(selectionSort(arr));
  }

  private static int[] selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int mini = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[mini]) {
          mini = j;
        }
      }

      int temp = arr[mini];
      arr[mini] = arr[i];
      arr[i] = temp;

    }

    return arr;
  }
}
