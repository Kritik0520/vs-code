import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int a = low ; a<=high ; a++){
            int count = 0;
            for (int t = 2 ; t*t<=a ; t++){
                if (a%t==0) {
                    count++;
                    break;
                }
                
            }
            if (count == 0){
                System.out.println(a);
            }
        }
    }
}