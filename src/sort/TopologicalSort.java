
package sort;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TopologicalSort {

	private int v; //no of vertices
	private LinkedList<Integer> adj[];

	// constructor
	public TopologicalSort(int v) {
		this.v= v;
		adj=new LinkedList[v];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new LinkedList<>();
		}

	}


	// add an edge to the graph
	void addEdge(int start , int end) {
		adj[start].add(end);
	}


	void topologicalSorrUtil(int index ,boolean visited[],Stack stack) {

		//mark the current node as visited
		visited[index]= true;

		// iterate all the vertices adjecent to the node
		Iterator<Integer> it = adj[index].iterator();
		while(it.hasNext()) {
			int i = it.next();
			if(!visited[i]) {
				topologicalSorrUtil(i, visited, stack);
			}
		}

		stack.push(new Integer(index));
	}


	// sorting function
	void toplogicalSort() {
		Stack stack = new Stack();

		boolean visited[] = new boolean[v];
		for (int i = 0; i < v; i++) {
			visited[i] = false;
		}
		for (int i = 0; i < v; i++) {
			if (visited[i]==false) {
				topologicalSorrUtil(i,visited,stack);
			}
		}
		
		//print all the element
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
			
		}

	}
	
	
	public static void main(String[] args) {
		TopologicalSort g = new TopologicalSort(6); 
	        g.addEdge(5, 2); 
	        g.addEdge(5, 0); 
	        g.addEdge(4, 0); 
	        g.addEdge(4, 1); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 1); 
	  
	        System.out.println("Following is a Topological " + 
	                           "sort of the given graph"); 
	        g.toplogicalSort(); 
	}
	
}
