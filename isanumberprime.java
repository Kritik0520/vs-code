import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int t = 0 ; t < n ; t++) {
      int count = 0;
      int a = scn.nextInt();
      for (int b = 2 ; b * b <= a ; b++ ) {
        if (a % b == 0) {
          count++;
        }

      }
      if (count == 0 ) {
        System.out.println("prime");
      }
      else {
        System.out.println("not prime");
      }

    }
  }
}