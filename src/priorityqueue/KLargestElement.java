package priorityqueue;

import java.util.Arrays;
import java.util.Collections;

public class KLargestElement {
	
	static void solve(Integer[] arr , int k) {
		 
		Arrays.sort(arr,Collections.reverseOrder());
		
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] =  { 1, 23, 12, 9, 30, 2, 50 }; 
				int k = 3; 
				solve(arr, k); 
	}

}
