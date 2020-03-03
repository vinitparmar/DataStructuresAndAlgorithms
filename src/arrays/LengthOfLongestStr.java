package arrays;

import java.util.HashSet;

public class LengthOfLongestStr {
	
	static int longestSubString(String str) {
		int pointer_a = 0;
		int pointer_b = 0;
		int max = 0;
		
		HashSet<Character> hash_set = new HashSet<>();
		
		while(pointer_b < str.length()) {
			if (!hash_set.contains(str.charAt(pointer_b))) {
				hash_set.add(str.charAt(pointer_b));
				pointer_b++;
				max =  Math.max(hash_set.size(), max);
			}else {
				hash_set.remove(str.charAt(pointer_a));
				pointer_a++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
