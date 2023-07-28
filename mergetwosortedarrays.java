public class Solution {

	public static int[] merge(int arr1[], int arr2[]){
		int mergearray[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
          if(arr1[i]<arr2[j])
          {
              mergearray[k]=arr1[i];
              k++;
              i++;
          }
            else{
              mergearray[k]=arr2[j];
              k++;
              j++;
            }
        }
        while(i<arr1.length)
        {
            mergearray[k]=arr1[i];
            k++;
            i++;        
        
        }
        while(j<arr2.length)
        {
         mergearray[k]=arr2[j];
            k++;
            j++;    
        }
        return mergearray;
    }
}