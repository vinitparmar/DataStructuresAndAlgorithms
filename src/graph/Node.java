package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
	int vertexNumber;
	Set<Integer> adjacencySet = new HashSet<Integer>();
	
	Node(int vertexNumber){
		this.vertexNumber = vertexNumber;
	}
	
	public int vertexNumber() {
		return vertexNumber;
	}
	
	public void addEdge(int vertexNumber) {
		adjacencySet.add(vertexNumber);
	}
	
	List<Integer> getAdjancencySet(){
		List<Integer> sortedList = new ArrayList<Integer>(adjacencySet);
		
		Collections.sort(sortedList);
		
		return sortedList;
	}
}
