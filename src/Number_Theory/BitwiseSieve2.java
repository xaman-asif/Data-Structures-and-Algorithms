//https://anindyaspaul.com/blog/2013/08/06/bitwise-sieve/

package Number_Theory;

public class BitwiseSieve2 {
  public static void main(String[] args) {
    int N = (int) Math.pow(10, 2);
    int[] prime = new int[N/32 + 1];

    int[] primes = primeGenerator(N, prime);

    System.out.println(2);

    for (int i = 3; i <= N; i += 2) {
      if (!checkBit(primes[i >> 5], i & 31)) {
        System.out.println(i);
      }
    }
  }

  public static int setBit(int n, int position) {
    return n | (1 << position);
  }

  public static boolean checkBit(int n, int position) {
    return (n & (1 << position)) != 0;
  }

  public static int[] primeGenerator(int n, int[] prime) {
    int x = (int) Math.sqrt(n);

    prime[0] = setBit(prime[0], 0);
    prime[0] = setBit(prime[0], 1);

    for (int i = 4; i <= n; i += 2) {
      prime[i / 32] = setBit(prime[i / 32], i % 32);
    }

    for (int i = 3; i <= x; i += 2) {
      if (!checkBit(prime[i / 32], i % 32)) {
        for (int j = i + i; j <= n; j += i) {
          prime[j / 32] = setBit(prime[j / 32], j % 32);
        }
      }
    }

    return prime;
  }
}
