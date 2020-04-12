package searching;

public class BinarySearch {
	
	public static int binarySearch(int[] array ,int left,int right,int data) {
		int mid = left+(right-left)/2;
		if(left < right) {
		if(array[mid]==data) {
			return mid;
		}else if(array[mid] < data) {
			 return binarySearch(array, mid+1, right, data);
		}else {
			return binarySearch(array, left, mid-1, data);
		   }
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,6,7,9,11};
		
		int res =  binarySearch(arr, 0, arr.length, 1);
		
		System.out.println("index of the value is "+res);
	}

}
