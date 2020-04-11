package sorting;

public class Selelction {
	
	public static void sort(int[] array) {
		int min;
		
		for(int i = 0 ; i < array.length-1 ; i++) {
			
			min = i;
			
			for(int j = i+1; j < array.length ; j++) {
				
				if(array[min] > array[j]) {
					
					min = j;
				}
				
			}
			
			 swap(array , i , min);
		}
	}
	
	public static void swap(int[] arr , int  i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,1,4,5,3,2,6};
		
		sort(arr);
		
		print(arr);
	}

}
