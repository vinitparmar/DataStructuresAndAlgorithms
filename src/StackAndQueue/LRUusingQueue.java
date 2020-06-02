package StackAndQueue;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LRUusingQueue {
	
	static Queue<Integer> q =  new LinkedList<>();
	static Set<Integer> res ;
	static int capacity = 0;
	
	static void cache(int data) {
	
		q.add(data);
		
		if(!q.isEmpty() && q.size() > capacity) {
			q.poll();
		}
		
		res = new LinkedHashSet<>(); 
		for(int i : q) {
			res.add(i);
		}
		
	}
	
	public static  void print() {
		for(int r : res) {
			System.out.print(r+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capacity = 2;
		cache(1);
		cache(4);
		cache(5);
		cache(8);
		cache(1);
		cache(33);
		
		print();

	}

}
