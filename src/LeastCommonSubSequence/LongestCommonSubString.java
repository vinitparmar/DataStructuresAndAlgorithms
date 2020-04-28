package LeastCommonSubSequence;

public class LongestCommonSubString {
	
	static int t[][] = new int[100][100];
	
	static int lcs(char[] x ,char[] y, int m, int n ) {
		int result = 0;
		for (int i = 0; i < m+1; i++) {
			for (int j = 0; j < n+1 ; j++) {
				if(i==0 || j == 0) {
					t[i][j] = 0;
 				}
			}
		}
		
		for (int i = 1; i < m+1; i++) {
			for (int j = 1; j < n+1 ; j++) {
				if(x[i-1] == y[j-1]) {
					
					t[i][j] = 1+t[i-1][j-1];
					result = Math.max(result, t[i][j]);
				
				}else{
					
					t[i][j] = 0;
					
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "asdf";
		int m = x.length();
		String y = "asdi";
		int n = y.length();
		
		System.out.println(lcs(x.toCharArray(), y.toCharArray(), m, n));
		
		

	}

}
