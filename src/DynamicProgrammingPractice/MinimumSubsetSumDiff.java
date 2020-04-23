package DynamicProgrammingPractice;

public class MinimumSubsetSumDiff {
	
	static boolean[][] t = new boolean[100][100];
	
	static int subsetSumDiffrence(int[] arr ,int range) {
		for(int i = 0 ; i < arr.length+1 ;i++ ) {
			for(int j = 0 ; j < range+1 ;j++ ) {
				if(i==0) {
					t[i][j] = true;
				}
				
				if(j==0) {
					
					t[i][j] = false;
				}	
			}	
		}
		
		for(int i = 1 ; i < arr.length+1 ;i++ ) {
			for(int j = 1 ; j < range+1 ;j++ ) {
					if(arr[i-1] < j) {
						t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];  
					}else {
						t[i][j] = t[i-1][j];
					}
				}	
			}
		
		int min_Val = Integer.MAX_VALUE;
		
		for(int j = range/2 ; j >= 0 ; j--) {
			if(t[arr.length][j] == true) {
				
				min_Val = range - 2  * j;
				break;
				
			}
		}
	
		return min_Val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 6, 11, 5};
		int range = 0;
		for (int i = 0; i < arr.length; i++) {
			range = range +arr[i];
		}
		System.out.println(subsetSumDiffrence(arr, range));
	}

}
