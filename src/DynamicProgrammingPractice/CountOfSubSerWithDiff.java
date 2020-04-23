package DynamicProgrammingPractice;

public class CountOfSubSerWithDiff {
	
	static int[][] t = new int[100][100];

	static int diffCount(int[] arr, int sum , int diff) {
		
		int n  = arr.length;
		
		int subsetSum = (diff + sum)/2;
		
		for(int i  = 0 ; i < n+1 ; i ++) {
			for(int j = 0 ; j < subsetSum+1 ; j++ ) {
				if(i== 0 ) {
					t[i][j] = 0;
				}
				if(j == 0) {
					t[i][j] = 1;
				}
			}
		}
		
		for(int i  = 1 ; i < n+1 ; i ++) {
			for(int j = 1 ; j < subsetSum+1 ; j++ ) {
				
				if(arr[i-1]<=j) {
					t[i][j] = t[i-1][j-arr[i-1]]+t[i-1][j];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][subsetSum];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
		}
		
		int diff = 1;
		
		System.out.println(diffCount(arr, sum, diff));

	}

}
