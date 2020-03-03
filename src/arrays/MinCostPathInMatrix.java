package arrays;

public class MinCostPathInMatrix {

	public static int  minCost(int[][] cost ,int m , int n) {
		
		int[][] temp =  new int[m+1][n+1];
		int sum = 0;
		//1st row
		for(int i=0;i<=n;i++) {
			temp[0][i] =  sum + cost[0][i];
			sum = temp[0][i];
		}
		// 1st col
		sum = 0;
		for(int i=0;i<=m;i++) {
			temp[i][0] = sum + cost[i][0];
			sum = cost[i][0];
		}
		
		
		for(int i = 1;i<=m;i++) {
			for(int j =1;j<=n;j++) {
				temp[i][j] = cost[i][j]+ min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1]);
			}
		}
		
		
		return temp[m][n];
	}
	
	private static int min(int a , int b,int c) {
		int l = Math.min(a,b);
		return Math.min(l,c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
