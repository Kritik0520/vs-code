public class Solution {
	public static int countWords(String str) { 
		int a = str.length();
		int b = 1;
		char q;
		if(a==0){
			return 0;
		}
		for (int i = 0 ; i<a ; i++){
			q = str.charAt(i);
			if(q==' '){
				b++;
			}
		}
		return b;
	}

}