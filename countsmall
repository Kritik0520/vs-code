// You are given two arrays of integers. Let's call the first array A and the second array B. A finds the number of elements in array B that are smaller than or equal to that element for every array element.
public class Solution {
    public static int[] countS(int n, int m, int []a, int []b) {
        int arr[] = new int[a.length];
        for(int i = 0 ; i<a.length ; i++){
            int count = 0;
            for(int j = 0 ; j<b.length ; j++){
                if(a[i]>=b[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}