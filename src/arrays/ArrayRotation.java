package arrays;

public class ArrayRotation {

	public void rotateArr(int[] arr, int k) {
		
		for(int i=0;i< arr.length ;i++) {
			System.out.print((arr.length +k)%(i+k)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
