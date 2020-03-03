package dynamicprogramming;

public class HouseRobber {
	
	static int maxLoot(int[] hval,int n) {
		if(n==0) {
			return 0;
		}
		
		int val1 = hval[0];
		if(n==1) {
			return val1;
		}
		
		int val2 = Math.max(val1, hval[1]);
		if(n==2) {
			return val2;
		}
		
		int max_val = 0;
		for(int i = 2; i<n ;i++) {
			max_val = Math.max(val2,val1+hval[i]);
			val1=val2;
			val2= max_val;
		}
		return max_val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
