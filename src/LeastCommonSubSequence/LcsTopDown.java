package LeastCommonSubSequence;

public class LcsTopDown {
	
	static int t[][] =  new int[100][100];
	
	static int lcs(String[] x, String[] y,int m , int n) {
		for (int i = 0; i < m+1; i++) {
			for (int j = 0; j < n+1 ; j++) {
				
				if(i==0 || j==0) {
					t[i][j]= 0;
				}
			}
		}
		
		for (int i = 1; i < m+1; i++) {
			for (int j = 1; j < n+1 ; j++) {
				
				if(x[i-1] == y[j-1]) {
					t[i][j] = 1+t[i-1][j-1];
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}	
			}
		}
		 return t[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] x = {"a","s","d","f","w"};
		int m = x.length;
		String[] y = {"a","s","e","r","t","p"};
		int n = y.length;
		System.out.println(lcs(x, y, m, n));

	}

}
