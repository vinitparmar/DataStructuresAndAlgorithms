package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void findMajority(int[] arr) {
		Map<Integer,Integer> hm =  new HashMap<>();
		for(int i = 0;i < arr.length; i++) {
			if(hm.containsKey(arr[i])){
				int count = hm.get(arr[i])+1;
				if(count > (arr.length/2)) {
					System.out.println("major"+arr[i]);
					return;
				}
			}else {
				hm.put(arr[i], 1);
			}
			
		}
		System.out.println("no major");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
