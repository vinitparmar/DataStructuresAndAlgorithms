package priorityqueue;

import arrays.ArrayRotation;

public class Heap {
	int capacity,heap_type,count;
	int[] array;
	public Heap(int capacity,int heap_type) {
		this.heap_type =  heap_type;
		this.count = 0;
		this.capacity = capacity;
		this.array = new int[capacity];
	}
	
	/*
	 * parent node
	 * for a node at ith location 
	 * parent is at (i-1)/2
	 * 
	 * */
	public int parent(int i) {
		if(i<=0 || i>= this.count) {
			return -1;
		}
		return (i-1)/2;
	}
	
	/*
	 * left children of a node
	 * for a node a ith location 
	 * left child 2*i+1
	 * */
	public int leftChild(int i) {
		int left = 2*i+1;
		if(left >= this.count){
			return -1;
		}
		return left;
	}
	
	/*
	 * right children of a node
	 * for a node a ith location 
	 * left child 2*i+2
	 * */
	public int rightChild(int i) {
		int right = 2*i+2;
		if(right >= this.count){
			return -1;
		}
		return right;
	}
	
	/*
	 * max element in heap
	 * for max heap 
	 * max element is root node
	 * 
	 * */
	
	public int getMaxElement(int i) {
		if(this.count == 0) {
			return -1;
		}
		return this.array[0];
	}
	
	/*heapifying the element*/
	public void percolateDown(int i) {
		int l,r,max,temp;
		l = leftChild(i);
		r = rightChild(i);
		if(l!=-1 && array[l]>array[i]) {
			max = l;
		}else {
			max = i;
		}
		
		if(r!=-1 && array[r]>array[max]) {
			max=r;
		}
		
		if(max!=i) {
			temp = this.array[i];
			this.array[i] = this.array[max];
			this.array[max]=temp;
			percolateDown(max);
		}	
			
	}
	
	// delete an element in heap
	int delete(){
		if(this.count == 0) {
			return -1;
		}
		int data = this.array[0];
		this.array[0] =  this.array[this.count-1];
		this.count--;
		percolateDown(0);
		return data;
	}
	
	// destroy heap
	
	public void destroyHeap() {
		this.count = 0;
		this.array = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
