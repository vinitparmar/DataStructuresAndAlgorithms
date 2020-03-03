package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MedianOfSortedArray {
	
	public static void medianOfArr(int[] arr1,int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int[] arr3 = new int[n1+n2];
		
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
			
			if(arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			}else {
				arr3[k++] = arr2[j++];
			}
			
		}
		
		while(i<n1) {
			arr3[k++] = arr1[i++];
		}
		
		while(j<n2) {
			arr3[k++] = arr2[j++];
		}
		
		
		int median = arr3[arr3.length/2];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
