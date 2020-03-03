package arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating1stCharacterString {
	
	public static void nonRepeatingChar(String str) {
		
	char[]  charArr =  str.toCharArray();
	
	Map<Character,Integer> hm = new LinkedHashMap<>();
	
	for(int i =0;i<charArr.length;i++){
			if(hm.containsKey(charArr[i])) {
				hm.put(charArr[i], hm.get(charArr[i])+1);
			}else {
				hm.put(charArr[i], 1);
			}
		}
	
	for (Map.Entry<Character,Integer> entry : hm.entrySet())  {
       /* System.out.println("Key = " + entry.getKey() + 
                         ", Value = " + entry.getValue()); */
			if(entry.getValue() == 1) {
				System.out.println("non repeating element"+entry.getKey());
			}else {
				System.out.println("no element found");
			}
		} 
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
