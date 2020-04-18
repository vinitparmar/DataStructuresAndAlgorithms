package practice;

public class PlusOne {
	
	public static int[] plusOne(int[] A) {
		int carry = 0;
		int sum = 0;
		for(int i = A.length-1;i>=0;i--) {
			if(i == A.length-1) {
				sum = A[i]+1;
				if(sum>9){
					carry = 1;
					A[i]=sum%10;
				}else {
					A[i]=sum;
				}
			}else {
				sum = A[i]+carry;
				if(sum > 9 ) {
					A[i]=sum%10;
					carry =1;
				}else {
					A[i]=sum;
					carry = 0;
				}
			}
		}
		
		if(carry == 1) {
		int[] temp  = new int[A.length+1];
		temp[0]=1;
			for(int i = 1; i < A.length ; i++) {
				temp[i]=A[i];
			}
			return temp;
		}
		
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {0,9,9,8};
		
		int[] sol = plusOne(arr);
		
		for(int i : sol) {
			System.out.print(i+" ");
		}

	}

}
