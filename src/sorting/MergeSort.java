package sorting;

public class MergeSort {
	
	public static void sort(int[] arr, int left,int right) {
		if(left < right) {
		int mid = (left+right)/2;
		
		sort(arr, left , mid);
		
		sort(arr, mid+1 , right);
		
		merge(arr, left , mid , right);
		
		}
		
	}
	
	public static void merge(int[] arr,int left,int mid ,int right) {
		
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		for (int i = 0; i < n1 ; i++) {
			leftArray[i] = arr[left+i];
		}
		
		for (int j = 0; j < n2 ; j++) {
			rightArray[j] = arr[mid+j+1];
		}
		
		int ptr1 = 0;
		int ptr2 = 0;
		
		
		int mergedPtr = left;
		
		while(ptr1 < n1 && ptr2 < n2) {
			
			if(leftArray[ptr1] < rightArray[ptr2]) {
				arr[mergedPtr] =  leftArray[ptr1];
				ptr1++;
			}
			else {
				arr[mergedPtr] =  rightArray[ptr2];
				ptr2++;
			}
			mergedPtr++;
		}
		
		while(ptr1 < n1) {
			arr[mergedPtr] = leftArray[ptr1];
			ptr1++;
			mergedPtr++;
		}
		
		while(ptr2 < n2) {
			arr[mergedPtr] = rightArray[ptr2];
			ptr2++;
			mergedPtr++;
		}
	}
	
	public static void print(int[] resultArr) {
		for(int i : resultArr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,6,3,2,1};
		sort(arr,0,arr.length-1);
		print(arr);

	}

}
