package Number_Theory;

public class BitwiseSieve {
  public static void main(String[] args) {
    int N = 100;

    //if the number was 96 then 96/32 = 3 then 3 would be enough
    //since N is equal to 100 or more that's why it's safe to add another index hence the + 1
    //right shifting N by 5 and dividing N / 32 are same thing
    int[] status = new int[(N >> 5) + 1];

    sieve(N, status);
  }


  public static boolean check(int N, int pos) {
    return (N & (1 << pos)) != 0;
  }

  public static int set(int N, int pos) {
    return N | (1 << pos);
  }

  public static void sieve(int N, int[] status) {
    int i, j, sqrtN;

    sqrtN = (int) Math.sqrt(N);

    for (i = 3; i <= sqrtN; i += 2) {
      if (!check(status[i >> 5], i % 32)) {
        for (j = i * i; j <= N; j += 2 * i) {
          status[j >> 5] = set(status[j >> 5], j & 31);
        }
      }
    }

    System.out.println(2);

    for (i = 3; i <= N; i += 2) {
      if (!check(status[i >> 5], i & 31)) {
        System.out.println(i);
      }
    }
  }
}
