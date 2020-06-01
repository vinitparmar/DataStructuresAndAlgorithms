package string;

public class URLify {
	
	static void urlify(char[] charArr) {
		int spaceCount = 0;
		
		for (int i = 0; i < charArr.length; i++) {
			
			if(charArr[i] == ' ') {
				
				spaceCount++;
				
			}
			
		}
		
		int index =  charArr.length + spaceCount*3;
		
		int z= 0;
		
		char[] res = new char [index];
		
		for (int i = 0; i < charArr.length ; i++) {
			
			if(charArr[i] == ' ') {
				res[z++] = '%';
				res[z++] = '2';
				res[z++] = '0';
				
			}else {
				
				res[z++] = charArr[i];
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			
			System.out.print(res[i]+" ");
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] charArr = {'I',' ','L','O','V','E',' ','I','N','D','I','A'};
		
		urlify(charArr);

	}

}
