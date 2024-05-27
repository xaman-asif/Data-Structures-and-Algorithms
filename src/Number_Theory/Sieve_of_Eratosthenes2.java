//https://shoshikkha.com/archives/2332

package Number_Theory;

public class Sieve_of_Eratosthenes2 {
  public static void main(String[] args) {
    int N = 25;

    int sq = (int) Math.sqrt(N);

    int[] array = new int[N];

    array[0] = 1;
    array[1] = 1;

    //1 is composite
    //0 is prime
    //marking all the even numbers
    for (int i = 4; i < N; i += 2) {
      array[i] = 1;
    }

    for (int i = 3; i <= sq; i += 2) {
      if (array[i] == 0) {
        for (int j = i * i; j <= N; j += i) {
          array[j] = 1;
        }
      }
    }
  }
}
