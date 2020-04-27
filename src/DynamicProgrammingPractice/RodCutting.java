package DynamicProgrammingPractice;

public class RodCutting {
	static int t[][] =  new int [100][100];
	
	static int maxProfit(int[] len, int[] price) {
		int p  = price.length;
		int l = len.length;
		// initialization
		for(int i = 0 ; i < p+1 ; i++) {
			for(int j = 0 ; j < l+1 ; j++) {
				if(i==0) {
					t[i][j]=0;
					}
				if(j==0) {
					t[i][j]=0;
				}
			}
		}
		
		for(int i = 1 ; i < p+1 ; i++) {
			for(int j = 1 ; j < l+1 ; j++) {
				if(len[i-1]<=j) {
					t[i][j]=Math.max(price[i-1]+t[i][j-len[i-1]], t[i-1][j]);
				}else{
					t[i][j]= t[i-1][j];
				}
			}
		}
		
		return t[p][l];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
		int length = price.length ;
		int[] l = new int[length];
		for (int i = 0; i < l.length; i++) {
			l[i]=i;
		}
		
		System.out.println(maxProfit( l , price));
		
	}

}
