package DynamicProgrammingPractice;

public class CoinChangeMinNumOfCoins {
	static int t[][] = new int [100][100];
	
	static int minNumerOfCoins(int[] coins,int sum) {
		// initialzation of matrix 1st column and 1st row of matrix
		for (int i = 0; i < coins.length+1; i++) {
			for (int j = 0; j < sum+1; j++) {
				
				if(i==0) {
					t[i][j] = Integer.MAX_VALUE;
				}
				if(j==0) {
					t[i][j] = 0;
				}
				// initialzation of matrix 1st column and 1st row of matrix
				if(i==1) {
					if(j%coins[0] == 0) {
						t[i][j] = j/coins[0];
					}else {
						t[i][j] = Integer.MAX_VALUE;
					}
				}
			}
		}
		
		for (int i = 2; i < coins.length+1; i++) {
			for (int j = 1; j < sum+1 ; j++) {
				if(coins[i-1]<=j) {
					t[i][j]= Math.min(t[i][j-coins[i-1]]+1, t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
				
		
		return t[coins.length][sum];
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,2,3};
		
		int sum = 5;
		
		System.out.println(minNumerOfCoins(coin, sum));

	}

}
