package practice;

public class AbsoluteDiffrence {
	
	static int absoluteDiffrence(int[] A) {
		int size =  A.length ; int res = 0;
		int max1 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < size ; i++) {
			max1 = Math.max(max1, A[i]+i);
			min1 = Math.min(min1, A[i]+i);
			max2 = Math.max(max2,A[i]-i);
			min2 = Math.min(min2, A[i]-i); 
		}
		
		return Math.max(max2-min2,max1-min1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,-1};
		
		System.out.print(absoluteDiffrence(arr));

	}

}
