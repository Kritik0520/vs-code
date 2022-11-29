import java.util.*;

public class Main {

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int t = 1 ; t<=n ; t++ )
        {
            int b = n-t;
            while (b>=1)
            {
                System.out.print("  ");
                b--;
            }
            for (int a = 0 ; a<t ; a++ )
            {
                    System.out.print("*");
            }
            System.out.println("");
        }

    }
}