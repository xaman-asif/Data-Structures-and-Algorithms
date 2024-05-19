package Number_Theory;

public class Sieve_of_Eratosthenes {
  public static void siv(int N, boolean[] status) {

    for (int i = 4; i <= N; i += 2) {
      status[i] = true;
    }

    status[0] = status[1] = true;

    int sq = (int) Math.sqrt(N);

    for (int i = 3; i <= sq; i += 2) {
      if (!status[i]) {
        for (int j = i * i; j <= N; j += i * 2) {
          status[j] = true;
        }
      }
    }

    status[1] = true;
  }

  public static void main(String[] args) {
    boolean[] status = new boolean[51];
     siv(50, status);
  }
}
