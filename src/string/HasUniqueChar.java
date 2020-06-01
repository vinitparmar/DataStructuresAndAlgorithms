package string;

public class HasUniqueChar {
	
	private static boolean hasUniqueChar(String str) {
		
		char[] charArr = str.toCharArray();
		
		for (int i = 0; i < charArr.length-1; i++) {
			for (int j = i+1; j < charArr.length; j++) {
				
				if(charArr[i]==charArr[j]){
					
					return false;
					
				}
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =  "vint";
		System.out.println(hasUniqueChar(str));

	}

}
