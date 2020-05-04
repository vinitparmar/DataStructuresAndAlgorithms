package MatrixChainMultiplication;

/*
 * also known as
 * bottom up approach
 * */

public class McmMemoization {
	
	static int[][] t = new int[100][100];
	
	static int solve(int[] arr, int i, int j) {
		
		if(t[i][j] != -1) {
			return t[i][j];
		}
		
		int min = Integer.MAX_VALUE;
		for (int k = i; k <= j-1; k++) {
			
			int temp_Ans = solve(arr, i, k)+
							solve(arr, k+1, j)+
							arr[i-1]*arr[k]*arr[j];
			
			min = Math.min(temp_Ans, min);
			
			t[i][j] = min;
			
		}
		
		
		return t[i][j];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {40,20,30};
		int leftIdx = 1;
		int rightIdx = arr.length-1;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				t[i][j] = -1;
			}
			
		}
		System.out.println(solve(arr, leftIdx, rightIdx));
	}

}
