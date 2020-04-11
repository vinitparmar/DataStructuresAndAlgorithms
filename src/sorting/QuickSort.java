package sorting;

public class QuickSort {
	
	public static void  quickSort(int[] arr , int left , int right) {
		int pivot;
		if(left<right) {
			pivot = partition(arr,left,right);
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}
	
	public static int partition(int[] array ,int low , int high) {
		
		int pivot = array[high];
		
		int i = (low -1);
		
		for(int j = low ; j < high ; j++) {
			
			if(array[j] < pivot) {
				
				i++;
				
				swap(array , i , j);
			}
		}
		
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		
		return i+1;
	}
	
	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {3,6,0,5,9};
		
		quickSort(arr, 0, arr.length-1);
		
		print(arr);
		
		
	}

}
