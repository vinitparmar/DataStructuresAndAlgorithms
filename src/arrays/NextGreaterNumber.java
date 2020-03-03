package arrays;

import java.util.Arrays;

public class NextGreaterNumber {
	
	static void findGreater(char[] arr) {
		int i;
		int n = arr.length;
		// step 1
		for(i=n-1;i>0;i++) {
			if(arr[i]>arr[i-1]) {
				break;
			}
		}
		// step 2
		if(i==0) {
			System.out.println("not possible");
		}else {
			int x =arr[i-1];
			int min = i;
			for(int j = i+1;j<n ;j++) {
				if(arr[j]>x && arr[j]<arr[min]){
					min = j;
				}
			}
			
			//swap
			swap(arr,i,n);
			//sort
			Arrays.sort(arr,i,n);
		}
	}
	
	static void swap(char[] ar,int i,int n) {
		char temp = ar[i];
		ar[i] = ar[n];
		ar[n] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
