package Sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {7, 5, 9, 2, 8};
    System.out.println(bubbleSort(arr));
  }

  private static int[] bubbleSort(int[] arr) {

    //Here is a little trick if the array is already sorted then the value of didSwap won't change
    //and the complexity will be reduced to O(1)
    boolean didSwap = false;

    for (int i = arr.length - 1; i >= 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          didSwap = true;
        }
      }

      if (!didSwap) {
        break;
      }
    }

    return arr;
  }
}
