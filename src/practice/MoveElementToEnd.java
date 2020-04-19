package practice;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
	
	static List<Integer> moveToEnd(List<Integer>array , int moveTo){
		
		int tailPtr  = array.size()-1;
		
		int headPtr = 0;
		
		while(headPtr < tailPtr) {
			if(array.get(headPtr)!= moveTo) {
				headPtr++;
			}else if(array.get(tailPtr) == moveTo) {
				tailPtr--;
			}else if(array.get(headPtr)== moveTo && array.get(tailPtr)!=moveTo) {
				swap(array,headPtr,tailPtr);
			}
		}
		return array;
	}
	
	static void swap(List<Integer> array,int i , int j) {
		int temp = array.get(j); 
		array.set(j , array.get(i));   
		array.set(i, temp); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array  =  new ArrayList<>();
		array.add(1);
		array.add(3);
		array.add(3);
		array.add(5);
		array.add(7);
		
		int m = 3;
		
		System.out.println(moveToEnd(array, m));
	}

}
