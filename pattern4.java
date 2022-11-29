import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = n;
        for (int a = 0 ; a<n ; a++){
            for (int b = 1 ; b<=a ; b++){
                System.out.print(" ");
                
            }
            for (int c = 0 ; c<(n-a) ; c++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}