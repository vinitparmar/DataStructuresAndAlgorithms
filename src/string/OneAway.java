package string;

public class OneAway {
	
	public static boolean isOneAway(String str1 , String str2) {
		
		int m = str1.length();
		int n = str2.length();
		
		if(Math.abs(m-n) > 1) {
			return false;
		}
		
		int count = 0;
		int i = 0;
		int j = 0;
		
		while(i<m && j<n) {
			if(str1.charAt(i)!= str2.charAt(j)) {
				
				if(count == 1) {
					return false;
				}
				
				if(m>n) {
					i++;
				}else if(m < n) {
					j++;
				}else {
					i++;
					j++;
				}
				count++;
				
			}else {
				j++;
				i++;
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "vin";
		String str2 = "vi";
		
		System.out.println(isOneAway(str1, str2));
	}

}
