package dynamicprogramming;

public class ClimbingStairs {
	
	static int climbNStps(int n) {
		
		int[] S = new int[n+1];
		S[1]=1;
		S[2]= 2;
		
		for(int i=3;i<n;i++) {
			S[i] = S[i-1]+S[i-2];
		}
		
		return S[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
