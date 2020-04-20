package DynamicProgrammingPractice;

// top down appraoch
public class KnapSack01Memoization {
	
	
	static int t[][] =  new int[1000][1000] ;
	
	static int knapSack(int[] wt,int[] val,int W,int n) {
	
		if(n==0 || W==0) {
			return 0;
		}
		
		if(t[n][W] !=-1) {
			return t[n][W];
		}	

		if(wt[n-1]<= W){ 
			return t[n][W]=Math.max(val[n-1]+knapSack(wt, val, W-wt[n-1], n-1), knapSack(wt, val, W, n-1));
		}else if(wt[n-1]>W) {
			return t[n][W]= knapSack(wt, val, W, n-1);
		}
	
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int t[][] = new int[n+1][W+1];*/
		int val[] = new int[]{60, 100, 120}; 
        int wt[] = new int[]{10, 20, 30}; 
        int  W = 50; 
        int n = val.length; 
     
		for(int i = 0; i<n+1; i++) {
			for(int j = 0; j < W+1 ; j++) {
				t[i][j] = -1;
			}
		}
		
		System.out.println(knapSack(wt, val, W, n));
	}

}
