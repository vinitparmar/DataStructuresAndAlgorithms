package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	
	public void printRepeatedElement(int[] arr){
		int n  = arr.length;
		
		Set<Integer> set =  new HashSet<>();
		
		for(int i = 0 ;i<n ; i++) {
			if(set.contains(arr[i])) {
				System.out.println(arr[i]+" ");
			}else {
				set.add(arr[i]);
			}
			
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
