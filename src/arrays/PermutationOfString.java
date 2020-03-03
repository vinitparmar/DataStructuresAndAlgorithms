package arrays;

public class PermutationOfString {
	void permuteString(String str,int l,int r) {
		if(l==r) {
			System.out.println(str);
		}else{
			for(int i=0;i<str.length();i++) {
				str = swap(str,l,i);
				permuteString(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}
	
	public String swap(String str,int i , int j) {
		char temp;
		char[] charArr = str.toCharArray();
		temp =  charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
		return String.valueOf(charArr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
