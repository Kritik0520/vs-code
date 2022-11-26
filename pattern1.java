import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = n;
        for (int t = 0 ; t<n ; t++){
            for(int j=n-t;j>0;j--)
            {
                System.out.print("*");
            }
            // while (b != 0){
            //     System.out.print("*");
            //     b=b-1;
            // }
            // b = b-t;
            System.out.println("");
            
        }

    }
}