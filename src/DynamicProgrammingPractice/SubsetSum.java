package DynamicProgrammingPractice;

public class SubsetSum {
	
	static boolean[][]  t =  new boolean[1000][1000];
	
	static boolean subsetSum(int[] arr ,int n, int sum) {
		//initialization
		for(int i = 0 ; i < n+1 ; i++) {
			for(int j = 0 ; j < sum+1 ; j++) {
				if(i == 0) {
					t[i][j] = false;
				}
				
				if(j == 0) {
					t[i][j] = true;
				}
			}
		}
		
		for(int i = 1 ; i < n+1 ; i++) {
			for(int j = 1 ; j < sum+1 ; j++) {
					
					if(arr[i-1] <= j) {
						t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j] ;
					} else {
						t[i][j] = t[i-1][j];
					}
				}
			}
		
		return t[n][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,3,5};
		int sum = 6;
		int size = arr.length;
		
		System.out.println(subsetSum(arr, size, sum));
		
	}

}
