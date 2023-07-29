public class Solution {
	public static void printSubstrings(String str) {
		int l = str.length();
		for (int i = 0 ; i<l ; i++){
			for (int j = i ; j<=l ; j++){  //<= is used because of substring function 
				String str2 = str.substring(i,j);
				System.out.println(str2);
			}
		}
	}
}