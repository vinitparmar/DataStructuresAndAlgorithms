package arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
	
	static void freqCount(int[] arr) {
		Map<Integer,Integer> mp = new HashMap<>();
		
		for(int i = 0 ; i< arr.length ; i++) {
			
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}else {
				mp.put(arr[i], 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
