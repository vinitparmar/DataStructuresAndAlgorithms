package DynamicProgrammingPractice;

public class KnapSackTopDown {
	
	static int[][] t = new int[100][100];
	
	static int knapSack(int[] wt,int[] val, int W, int n) {
		
		/// initialization for the 1st row and 1st column
		
		for(int i = 0; i<n+1; i++) {
			for(int j = 0; j < W+1 ; j++) {
				//base condition
				if(i == 0  || j==0) {
					t[i][j] = 0;
				}
				
			}
		}
		
		for(int i = 1; i<n+1; i++) {
			for(int j = 1; j < W+1 ; j++) {
				if(wt[i-1]<= j) {
					t[i][j]= Math.max( val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j] );
				}else if(wt[i-1]>j){
					t[i][j]=t[i-1][j];
				}
				
			}
		}
		
		return t[n][W];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = new int[]{60, 100, 120}; 
        int wt[] = new int[]{10, 20, 30}; 
        int  W = 50; 
        int n = val.length; 
     
		
		System.out.println(knapSack(wt, val, W, n));

	}

}
