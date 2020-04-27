package DynamicProgrammingPractice;

public class CoinChangeMaxNumberOfWay {
	static int[][] t =  new int[100][100];
	
	static int maxNumOfway(int[] coin , int sum) {
		int c = coin.length;
		for (int i = 0; i < c+1 ; i++) {
			for (int j = 0; j < sum+1; j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				if(j==0) {
					t[i][j] = 1;
				}
			}
		}
		
		for (int i = 1; i < c+1; i++) {
			for (int j = 1; j < sum+1; j++) {
				if(coin[i-1]<=j) {
					t[i][j]= t[i][j-coin[i-1]]+t[i-1][j];
				}else {
					t[i][j]=t[i-1][j];
				}
			}
		}
		return t[c][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,2,3};
		
		int sum = 5;
		
		System.out.println(maxNumOfway(coin, sum));
	}

}
