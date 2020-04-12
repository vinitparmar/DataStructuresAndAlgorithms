package searching;

public class UnorderedLinearSearch {
	
	public static int linearSearch(int[] array , int item) {
		
		for(int i : array) {
			
			if(item == i) {
				
				return i;
			}
			
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,15,6,4};
		
		
		System.out.println("the number "+linearSearch(arr, 3)+" is present");
	}

}
