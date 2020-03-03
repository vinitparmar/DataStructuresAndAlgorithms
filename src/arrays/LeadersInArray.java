package arrays;

public class LeadersInArray {
	
	public void leader(int[] arr) {
		
		int max_element = arr[arr.length-1];
		
		System.out.println(max_element+" ");
		
		for (int i = arr.length -2; i >= 0; i--) {
			
			if(max_element < arr[i]) {
				
				max_element = arr[i];
				System.out.println(max_element+" ");
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
