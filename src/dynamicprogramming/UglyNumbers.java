package dynamicprogramming;

public class UglyNumbers {
	
	static int uglyNum(int num) {
		int[] ugly = new int[num];// to store ugly numbers
		int n2=0,n3=0,n5=0;
		int next_multiple_of_2 = 2;
		int next_multiple_of_3 = 3;
		int next_multiple_of_5 = 5;
		int next_ugly_number = 1;
		
		ugly[0] = 1;
		
		for(int i=1;i<num;i++) {
			
			next_ugly_number = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));
			
			ugly[i]= next_ugly_number;
			
			
			if (next_ugly_number == next_multiple_of_2) {
				n2 = n2+1;
				next_multiple_of_2 = ugly[n2]*2;
			}
			
			if (next_ugly_number == next_multiple_of_3) {
				n3 = n3+1;
				next_multiple_of_3 = ugly[n3]*3;
			}
			
			if (next_ugly_number == next_multiple_of_5) {
				n5 = n5+1;
				next_multiple_of_5 = ugly[n5]*5;
			}
		}
		
		return next_ugly_number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6; 
        
        System.out.println(uglyNum(n)); 
	}

}
