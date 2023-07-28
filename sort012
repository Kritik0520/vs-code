
public class Solution {

    public static void sort012(int[] arr){
        int nz = 0;
        int nt = arr.length-1;
        int i = 0;
    	while(i<=nt){
            int temp = arr[i];
            if (arr[i] == 0){ 
                arr[i] = arr[nz];
                arr[nz] = temp;
                nz++;
                i++;
            }
            else if(arr[i]==1){
                i++;
            }
            else if (arr[i] == 2){ 
                arr[i] = arr[nt];
                arr[nt] = temp;
                nt--;
            
            }
        }
    }
}