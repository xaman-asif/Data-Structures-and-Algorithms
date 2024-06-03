package Number_Theory;

public class BitwiseSieve {
  public static void main(String[] args) {

  }


  public static boolean check(int N, int pos) {
    return (N & (1 << pos)) != 0;
  }

  public static int set(int N, int pos) {
    return N | (1 << pos);
  }

}
