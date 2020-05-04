package MatrixChainMultiplication;

public class McmRecursive {
	
	static int  mcmRecursive(int[] arr , int i , int j) {
		//base condition
		if(i>j) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int k = i; k <= j-1 ; k++) {
			
			int tempAns = mcmRecursive(arr, i, k)+
						  mcmRecursive(arr, k+1, j)+
						  arr[i-1]*arr[k]*arr[j];
			
			min = Math.min(tempAns , min);
			
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {40,20,30};
		int leftIdx = 1;
		int rightIdx = arr.length-1;
		System.out.println(mcmRecursive(arr, leftIdx, rightIdx));
	}

}
