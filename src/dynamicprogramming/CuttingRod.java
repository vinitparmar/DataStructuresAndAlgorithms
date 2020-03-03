package dynamicprogramming;

public class CuttingRod {
	
	static int revenue(int[] price, int n ) {
		int[] rev = new int[n+1];
		
		rev[0] = 0;
		
		for(int i=1;i<=n;i++) {
			int max_val = -1;
			
			for(int j =0;j<i;j++) {
				max_val = Math.max(max_val, price[j]+rev[i-j-1]);
				rev[i]=max_val;
			}
		}
		return rev[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
