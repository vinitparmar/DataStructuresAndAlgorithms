package LeastCommonSubSequence;

public class ShortestCommonSubsequence {
	static int t[][] = new int[100][100];	
	
	static int shortestCommonSubsequence(String x,String y,int m , int n) {
		
		for (int i = 0; i < m+1 ; i++) {
			for (int j = 0; j < n+1 ; j++) {
				if(m==0 || n==0) {
					t[i][j]=0;
				}
			}
			
		}
		
		for (int i = 1; i < m+1; i++) {
			for (int j = 1; j < n+1; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
				}else {
					t[i][j] =  Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		
		return m+n-t[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String X = "AGGTAB"; 
	        String Y = "GXTXAYB"; 
	        int m = X.length(); 
	        int n = Y.length(); 
	        System.out.println(shortestCommonSubsequence(X, Y, m, n)); 

	}

}
