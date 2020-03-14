package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAdjencyList {
	
	static class Graph{
		int V; // number of vertices in the graph 
		LinkedList<Integer> adjListArray[]; // these are the node 
		
		public Graph(int V) {
			// TODO Auto-generated constructor stub
		this.V = V;
		adjListArray =  new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	static void addEdge(Graph graph, int source , int destination) {
		
		graph.adjListArray[source].add(destination);
		
		graph.adjListArray[destination].add(source);
	}
}
