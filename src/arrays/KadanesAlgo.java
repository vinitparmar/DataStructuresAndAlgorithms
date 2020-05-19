package arrays;

public class KadanesAlgo {
	
	static int maxSumSubArray(int[] array) {
		
		int maxCurrSum = array[0];
		int maxRes = array[0];
		
		for (int i = 1; i < array.length; i++) {
			
			maxCurrSum = Math.max(array[i], maxCurrSum+array[i]);
			maxRes = Math.max(maxRes,maxCurrSum);
			
		}
		return maxRes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
		
		System.out.println(maxSumSubArray(arr));

	}

}
