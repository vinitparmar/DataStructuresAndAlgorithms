package LeastCommonSubSequence;

public class LcsMemoization {
	
	static int t[][] =  new int [100][100];
	
	static int lcs(String[] x,String[] y,int m, int n) {
		
		if(m==0 || n==0) {
			return 0;
		}
		
		if(t[m][n] != -1) {
			return t[m][n];
		}
		
		if(x[m-1] == y[n-1]) {
			
			return t[m][n] = lcs(x,y,m-1,n-1)+1;
		}else {
			return t[m][n] = Math.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = {"a","s","d","f","z"};
		int m = x.length;
		String[] y = {"a","s","e","r","t","p"};
		int n = y.length;
		for (int i = 0; i < m+1; i++) {
			for (int j = 0; j < n+1; j++) {
				t[i][j]=-1;
			}
		}
		System.out.println(lcs(x, y, m, n));
	}

}
