package DynamicProgrammingPractice;

public class CountOfSubsetSum {
	static int[][] t = new int[100][100];
	
	static int subsetSum(int[] arr , int n , int sum) {
		
		for(int i = 0 ; i < n+1 ; i++) {
			for(int j = 0 ; j < sum+1 ; j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				
				if(j == 0) {
					t[i][j] = 1;
				}
			}
		}
		
		for(int i = 1 ; i < n+1 ; i++) {
			for(int j = 1 ; j < sum+1 ; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]]+t[i-1][j];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		return t[n][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,6,5};
		int sum = 6;
		int n = arr.length;
		
		System.out.println(subsetSum(arr, n, sum));
	}

}
