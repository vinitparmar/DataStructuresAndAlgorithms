package priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElement {
	
	static int solve(int[] arr , int  k ) {
		
		Arrays.sort(arr);
		
		
		return arr[k-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,7,4,5};
		
		int k = 3;
		
		System.out.println(solve(arr, k));
	}

}
