package Number_Theory;

public class BitwiseSieve3 {
  public static int[] primeGenerator(int N) {
    int root = (int) Math.sqrt(N);
    int[] bits = new int[(N >> 5) + 1];

    bits[1 >> 5] = setBit(bits[1 >> 5], 1 & 31);
    bits[2 >> 5] = setBit(bits[2 >> 5], 2 & 31);

    for (int i = 4; i <= N; i += 2) {
      bits[i >> 5] = setBit(bits[N >> 5], i & 31);
    }

    for (int i = 3; i <= root; i += 2) {
      if (checkBit(bits[i >> 5], i & 31)) {
        for (int j = i * i; j <= N; j += i) {
          bits[j >> 5] = setBit(bits[j >> 5], j & 31);
        }
      }
    }

    return bits;
  }

  public static void main(String[] args) {
    int N = 50;
    int[] primes = primeGenerator(N);

    for (int i = 3; i <= N; i += 2) {
      if (checkBit(primes[i >> 5], i & 31)) {
        System.out.println(i);
      }
    }
  }



  public static int setBit(int num, int pos) {
    //this function makes the 'num' as composite number
    return num | (1 << pos);
  }

  public static boolean checkBit(int num, int pos) {
    //this function return true for prime number
    //returns false for composite number
    return (num & (1 << pos)) == 0;
  }
}
