package Data_Structure.Array;

import java.util.HashMap;

public class ArrayCompression {
  public static void compress() {
    HashMap<Integer, Integer> mymap = new HashMap<>();

    int[] input = {
        -102,
        1,
        134565589,
        134565589,
        -102,
        66666668,
        134565589,
        66666668,
        -102,
        1,
        -2
    };

    int assign = 0, c = 0, n = input.length;
    int[] compressed = new int[100];

    for (int i = 0; i < n; i++) {
      int x = input[i];

      if (!mymap.containsKey(x)) {
        mymap.put(x, assign);
        System.out.printf("Mapping %d with %d\n", x, assign);
        assign++;
      }

      x = mymap.get(x);
      compressed[c++] = x;
    }

    System.out.print("Compressed array: ");
    for (int i = 0; i < n; i++) {
      System.out.printf("%d", compressed[i]);
    }

    System.out.println();
  }

  public static void main(String[] args) {
    compress();
  }
}
