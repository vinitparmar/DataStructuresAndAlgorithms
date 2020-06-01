package string;

public class PallidromePermutation {
	
	static boolean pallidromicPermutation(String str) {
		
		int leftPtr = 0;
		int rightPtr = str.length()-1;
		
		while(leftPtr < rightPtr) {
			
			if(str.charAt(leftPtr) != ' ' && str.charAt(rightPtr) != ' ' ) {
				
				if(str.charAt(leftPtr) != str.charAt(rightPtr)) {
					return false;
				}
				leftPtr++;
				rightPtr--;
			}else if(str.charAt(leftPtr) == ' ') {
				
				leftPtr++;
				
			}else{
				
				rightPtr--;
				
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "i w wi";
		
		System.out.println(pallidromicPermutation(s));

	}

}
