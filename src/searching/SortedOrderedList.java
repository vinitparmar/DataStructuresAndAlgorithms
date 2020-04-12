package searching;

public class SortedOrderedList {
	
	public static int linearSearch(int[] array , int data) {
		
		for(int i : array) {
			
			if(i == data) {
				
				return i;
				
			}else if(i > data) {
				
				return -1;
				
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,9,11,16};
		
		System.out.print(linearSearch(arr, 6));
		
	}

}
