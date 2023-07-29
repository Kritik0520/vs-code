public class Solution {
	public static boolean isPalindrome(String str) {
		int l = str.length();
		int i = 0;
		int j = l-1;
		while(i<j){
			if (str.charAt(i)!=str.charAt(j)){
				return false;
			}
			else{
				i++;
				j--;
			}
		} 
		return true;
	}

}