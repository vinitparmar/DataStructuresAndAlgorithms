package practice;

public class MissingNmber {
	
	static int missingNumber(int[] A) {
		int xor_value1 = A[0];
		int xor_value2 = 1;
		
		int size = A.length;
		
		// xor aal the elements in array
		for(int i = 1 ; i < size; i++) {
			xor_value1 = xor_value1^A[i];
		}
		
		for(int i = 2 ; i <= size+1 ; i++) {
			xor_value2 = xor_value2^i;
		}
		return xor_value1^xor_value2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4};
		int sol= missingNumber(arr);
		System.out.println(sol);
	}

}
