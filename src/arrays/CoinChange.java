package arrays;

import java.util.Arrays;

public class CoinChange {
	
	static long countWays(int[] arr,int m, int n) {
		
		long[] table = new long[n+1];
		
		//Arrays.fill(table,0);
		
		table[0] = 1;
		
		for(int i =0;i<m;i++){
			for(int j = arr[i];j<=n;j++) {
				table[j] += table[j-arr[i]];
			}
		}
		return table[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3}; 
        int m = arr.length; 
        int n = 4; 
        System.out.println(countWays(arr, m, n));
	}

}
