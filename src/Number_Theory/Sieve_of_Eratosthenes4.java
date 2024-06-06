package Number_Theory;

public class Sieve_of_Eratosthenes4 {
  public static int[] primeGenerator(int n) {
    int root = (int) Math.sqrt(n);



    return null;
  }

  public int setBit(int num, int pos) {
    return num | (1 << pos);
  }

  public boolean checkBit(int num, int pos) {
    return (num & (1 << pos)) > 0;
  }
}
