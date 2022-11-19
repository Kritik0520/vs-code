import java.util.*;

public class Main {

  public static void main(String[] args) {
    int a = 0;
    int d = 1;
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    for (int c = 0; c < b ; c++) {
        System.out.println(a);
        int sum = a + d ;
        a = d;
        d = sum;
        
    }
  }
}