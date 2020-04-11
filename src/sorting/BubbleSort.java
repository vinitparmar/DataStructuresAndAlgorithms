package sorting;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		int[] arrToBeSorted = arr;
		for(int pass = 0 ; pass < arrToBeSorted.length ; pass++) {
			
			for(int i = 0 ; i < arrToBeSorted.length-1 ; i++) {
				
				if(arrToBeSorted[i] > arrToBeSorted[i+1])
				{
					swap(arrToBeSorted,i,i+1);
				}
			}
		}
		
	}

	public static void swap(int[] swapArr, int i , int j) {
		int temp = swapArr[i];
		swapArr[i] =  swapArr[j];
		swapArr[j] = temp;
	}
	
	public static void print(int[] arr) {
		//for(int i = 0 ; i < arr.length ; i++) {
		for(int i : arr) {
		System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,3,4,1,9};
			sort(arr);
			print(arr);
		
	}

}
