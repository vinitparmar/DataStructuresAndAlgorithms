package LeastCommonSubSequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintLCS {
	static int t[][] = new int [100][100];
	static void lcs(String x , String y, int m , int n) {
		// base condition
		for (int i = 0; i < m+1; i++) {
			for (int j = 0; j < n+1 ; j++) {
				
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		
		for (int i = 1; i < m+1; i++) {
			for (int j = 1; j < n+1 ; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					t[i][j] = t[i][j]+1;
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		
		int i = m ;
		int j = n;
		List<Character> result =  new ArrayList<Character>();
		while(i>0 && j>0) {
			if(x.charAt(i-1) == y.charAt(j-1)) {
				result.add(x.charAt(i-1));
				i--;
				j--;
			}else {
				if(x.charAt(i-1) > y.charAt(j-1)) {
					i--;
				}else {
					j--;
				}
			}
		}
		
		print(result);
		
	}
	
	static void print(List<Character> res) {
		
		Collections.reverse(res);
		Iterator<Character> itr = res.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String X = "AGGTAB"; 
	        String Y = "GXTXAYB"; 
	        int m = X.length(); 
	        int n = Y.length(); 
	        lcs(X, Y, m, n); 
		

	}

}
