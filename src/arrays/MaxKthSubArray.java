package arrays;

public class MaxKthSubArray {
	
	public void maxSumSubArray(int[] arr,int k) {
		int maxAvgSum = 0;
		
		for(int i=0;i<arr.length-k ; i++) {
			 int sum = 0;
			for (int j = 0; j < k; j++) {
				sum+=arr[i+j];
			}
			sum = sum/3;
			
			if(maxAvgSum < sum) {
				maxAvgSum =  sum;
			}
		}
		
		System.out.println("max avg sum "+maxAvgSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
