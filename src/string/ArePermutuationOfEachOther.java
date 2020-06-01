package string;

import java.util.Arrays;

public class ArePermutuationOfEachOther {
	
	static boolean arePermutation(String str1 , String str2) {
		
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		if(charArr1.length != charArr2.length) {
			
			return false;
		}
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
	
		
		return Arrays.equals(charArr1, charArr2);
		//return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abj";
		
		String str2 = "jab";
		
		System.out.println(arePermutation(str1, str2));

	}

}
