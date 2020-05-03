package LeastCommonSubSequence;

public class LongestRepeatingSubsequence {
	static int t[][] = new int[100][100];
	
	static int longestRepeatingSubsequence(String a,String b, int m,int n) {
		
		for (int i = 0; i < m+1; i++) {
			for (int j = 0; j < n+1; j++) {
				
				if(i==0) {
					t[i][j] = 0;
				}
				
				if(j==0) {
					t[i][j] = 0;
				}
			}
			
		}
		
		for (int i = 1; i < m+1; i++) {
			for (int j = 1; j < n+1; j++) {
				if((a.charAt(i-1) ==  b.charAt(j-1)) && i != j ) {
					
					t[i][j] = t[i-1][j-1]+1;
					
				}else {
					
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
				
			}
			
		}
		return t[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "AABEBCDD";
		int l = a.length();
		System.out.println(longestRepeatingSubsequence(a, a, l, l));
		
		

	}

}
