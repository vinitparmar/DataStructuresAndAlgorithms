package arrays;

public class PeakElementInArray {
	
	static int findPeak(int[] arr,int low,int high,int n) {
		
		// find the mid element
		int mid  = (low + high)/2;
		
		if((mid==0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid]>= arr[mid+1])) {
			return mid;
		}else if(mid > 0  &&  arr[mid-1] > arr[mid]) {
			return findPeak(arr, low, mid-1, n);
		}else {
			return findPeak(arr, mid+1, high , n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
