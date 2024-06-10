package Number_Theory;

import java.util.ArrayList;

public class PrimeFactorization {
  public static void main(String[] args) {
    int N = 100;

    boolean[] primes = primeGenerator(N);

    findPrimeFactors(primes, 9999);

  }

  public static void findPrimeFactors(boolean[] primes, int num) {

    ArrayList<Integer> list = new ArrayList<Integer>();

    while (num % 2 == 0) {
      num /= 2;
      System.out.println(2);
    }

    for (int i = 3; i < primes.length; i++) {
      if (!primes[i]) {
        list.add(i);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      while (num % list.get(i) == 0) {
        num /= list.get(i);
        System.out.println(list.get(i));
      }
      if (num == 1) {
        break;
      }
    }

    if (num > 2) {
      System.out.println(num);
    }
  }

  public static boolean[] primeGenerator(int N) {
    boolean[] primes = new boolean[N + 1];

    int sqrt = (int) Math.sqrt(N + 1);

    primes[0] = primes[1] = true;

    for (int i = 4; i <= N; i += 2) {
      primes[i] = true;
    }

    for (int i = 3; i <= sqrt; i += 2) {
      for (int j = i * i; j <= N; j += i) {
        if (!primes[j]) {
          primes[j] = true;
        }
      }
    }

    return primes;
  }
}
