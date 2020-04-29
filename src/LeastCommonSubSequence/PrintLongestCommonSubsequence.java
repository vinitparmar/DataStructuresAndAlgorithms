package LeastCommonSubSequence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class PrintLongestCommonSubsequence {
	
	static int t[][]= new int[100][100];
	
	static void lcs(String x, String y, int m , int n) {
			
		for (int i = 0; i < m+1 ; i++) {
			for (int j = 0; j < n+1 ; j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
			
		}
		
		for (int i = 1; i < m+1 ; i++) {
			for (int j = 1; j < n+1 ; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
				}else{
					t[i][j] =  Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		
		int i = m ; int j = n;
		List<Character> result =  new ArrayList<>();
		
		while(i > 0 && j > 0) {
			if(x.charAt(i-1) == y.charAt(j-1)) {
				result.add(0,x.charAt(i-1));
				j--;
				i--;
			}else {
				if(t[i-1][j]>t[i][j-1]) {
					result.add(0,x.charAt(i-1));
					i--;
				}else {
					result.add(0,y.charAt(j-1));
					j--;
				}
			}
		}
		while(i>0) {
			result.add(0,x.charAt(i-1));
			i--;
		}
		while(j>0) {
			result.add(0,y.charAt(j-1));
			j--;
		}
		
		
		print(result);
	}
	
	static void print(List<Character> res) {

		Iterator<Character> itr =  res.iterator();

		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "AGGTAB";
		int m =  X.length();
		String Y = "GXTXAYB";
		int n =  Y.length();
		
		lcs(X, Y, m, n);
		
		
	}

}
