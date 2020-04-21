package DynamicProgrammingPractice;

public class EqualSumPartition {
	static boolean[][] t = new boolean[100][100];
	static boolean equalSum(int[] arr,int n) {
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum = sum +arr[i];
		}
		
		if(sum % 2 != 0) {
			return false;
		}
		
		int val = sum/2;
		
		for(int i = 0 ; i< n+1 ; i++ ) {
			for(int j = 0 ; j< val+1 ; j++ ) {
				if(i==0) {
					t[i][j]=false;
				}
				if(j == 0) {
					t[i][j]=true; 
				}
			}
		}
		for(int i = 1 ; i< n+1 ; i++ ) {
			for(int j = 1 ; j< val+1 ; j++ ) {
				if(arr[i-1]<= j) {
					t[i][j]= t[i-1][j-arr[i-1]] || t[i-1][j];
				}else {
					t[i][j]= t[i-1][j];
				}
			}
		}
		
		return t[n][val];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,9};
		int n = arr.length;
		System.out.println(equalSum(arr, n));
	}

}
