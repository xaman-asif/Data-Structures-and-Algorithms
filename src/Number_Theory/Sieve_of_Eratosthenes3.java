//https://anindyaspaul.com/blog/2013/08/04/sieve-of-eratosthenes/

package Number_Theory;

public class Sieve_of_Eratosthenes3 {
  public static void main(String[] args) {
    primeGenerator(47);
  }

  public static void primeGenerator(int n) {
    int root = (int) Math.sqrt(n);

    boolean[] array = new boolean[n + 1];

    array[0] = array[1] = true;

    //first of all marking all even number as composite except 2

    for (int i = 4; i <= n; i += 2) {
      array[i] = true;
    }

    //then marking all the odd number as composite

    for (int i = 3; i <= root; i += 2) {

      if (!array[i]){
        for (int j = i * i; j <= n; j += i) {
          array[j] = true;
        }
      }
    }

    for (int i = 0; i <= n; i++) {
      if (!array[i]) {
        System.out.println(i);
      }
    }
  }
}
