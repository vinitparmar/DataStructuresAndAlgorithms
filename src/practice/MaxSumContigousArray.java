package practice;

public class MaxSumContigousArray {
	
	static int maxValue(int[] A) {
		int maxValue =0;
		int currValue = 0;
		
		for(int i = 0 ; i < A.length ; i ++) {
			currValue = currValue +A[i];
			
			if(currValue > maxValue) {
				maxValue = currValue;
			}
			
			if(currValue < 0) {
				currValue = 0;
			}
		}
		
		if(maxValue == 0) {
			int min = Integer.MIN_VALUE;
			for(int i = 0 ;i < A.length ; i++) {
			if(min < A[i]) {
				min = A[i];
			 }
			}
			return min;
		}
		return maxValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {1,4,3,2,9};
		int[] arr = {-1,-4,-3,2,-9};
		//int[] arr = {-9};
		System.out.println(maxValue(arr));

	}

}
