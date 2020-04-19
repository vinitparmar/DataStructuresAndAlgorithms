package practice;

public class MonotonicArray {
	
	static boolean isMonoTonic(int[] array) {
		boolean nonDecreasing = true;
		boolean nonIncreasing = true;
		
		for(int i = 1 ; i < array.length ; i++) {
			if(array[i-1] < array[i]) {
				nonDecreasing = false;
			}
			
			if(array[i-1] > array[i]) {
				nonIncreasing = false;
			}
		}
		
		return nonIncreasing || nonDecreasing;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,1};
		
		System.out.println(isMonoTonic(arr));

	}

}
