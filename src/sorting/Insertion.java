package sorting;

public class Insertion {
	
	public static void sort(int[] array) {
		int value , index;
		
		for(int i = 1 ; i <=array.length-1 ; i++) {
			value = array[i];
			index = i;
			
			while(array[i-1] > value  && index >= 1) {
				array[index] = array[index-1];
				index--;
			}
			array[index] = value;
		}
	}
	
	static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {4,3,6,8,1};
		
		sort(array);
		
		print(array);

	}

}
