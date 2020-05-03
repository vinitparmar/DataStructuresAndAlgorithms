package LeastCommonSubSequence;

public class SequencePatternMatching {
	
	static int t[][] =  new int [100][100];
	
	public static boolean patternMatching(String a,String b,int m, int n) {
		
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
		
		int min_Val = Integer.MAX_VALUE;
		for (int i = 1; i < m+1 ; i++) {
			for (int j = 1; j < n+1; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					t[i][j] = t[i-1][j-1]+1;
					 
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		min_Val = Math.min(min_Val, t[m][n]);
		
		if(min_Val == Math.min(m, n)) {
			return true;
		}else {
			return false;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "AXY";
		int m = a.length();
		String b = "ADXCPY";
		int n  = b.length();
		
		System.out.println(patternMatching(a, b, m, n));
		
	}

}
