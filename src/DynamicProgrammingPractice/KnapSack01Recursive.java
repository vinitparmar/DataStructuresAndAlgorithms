package DynamicProgrammingPractice;

public class KnapSack01Recursive {
	
	static int findMax(int[] wt,int[] val,int W , int n ) {	
	// min value valid condition
	if(n==0 || W == 0) {
		return 0;
	}
	if(wt[n-1]<= W) {
		return Math.max(val[n-1]+findMax(wt,val,W-wt[n-1],n-1),findMax(wt,val,W,n-1));
	}else if(wt[n-1]>W){
		return findMax(val,wt,W,n-1);
	}
	return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = new int[]{60, 100, 120}; 
        int wt[] = new int[]{10, 20, 30}; 
        int  W = 50; 
        int n = val.length; 
        System.out.println(findMax(wt, val, W ,n)); 

	}

}
