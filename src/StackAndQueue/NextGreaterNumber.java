package StackAndQueue;

public class NextGreaterNumber {
	
	public static int[] greaterNumber(int [] arr) {
		
		int[] res = new int[arr.length];
		
		int z = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
					if(arr[i]<arr[j]) {
						
						res[z++] = arr[j];
						
						break;
						
					}else if(j == arr.length-1) {
						res[z++] = -1;
					}
				
					
			}
			
			if(i == arr.length-1) {
				res[z++] = -1;
			}
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[]= {11, 13, 21, 3};
		 
		 for(int i : greaterNumber(arr)) {
			 
			 System.out.print(i + " ");
		 }

	}

}
