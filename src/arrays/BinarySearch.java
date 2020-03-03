package arrays;

public class BinarySearch {
	
	public int binarySearch(int[] arr,int l ,int r,int x) {
		
		if(r > l) {
			int mid = (l+r)/2;

			if(arr[mid] == x) {
				return arr[mid];
			}

			if(arr[mid] > x) {
				binarySearch(arr,l,mid-1, x);
			}else {
				binarySearch(arr,mid+1,r, x);
			}
		}	

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
