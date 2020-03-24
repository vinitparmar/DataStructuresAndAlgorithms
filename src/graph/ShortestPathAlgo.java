package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import graph.Graph.GraphType;

public class ShortestPathAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjancecyMatrixGraph graph =  new AdjancecyMatrixGraph(8, GraphType.DIRECTED);
			graph.addEdge(2, 7);
	        graph.addEdge(3, 0);
	        graph.addEdge(0, 4);
	        graph.addEdge(0, 1);
	        graph.addEdge(2, 1);
	        graph.addEdge(1, 3);
	        graph.addEdge(3, 5);
	        graph.addEdge(6, 3);
	        graph.addEdge(4, 7);
	        
	        shortestPath(graph,1,7);
	}
	
	// path for the shortest distance in graph
	
	public static void shortestPath(AdjancecyMatrixGraph graph,int source , int destination) {
	
		Map<Integer,DistanceInfo> distanceTable = buildDistanceInfo(graph,source);
		
		Stack<Integer> stack =  new Stack<>();
		stack.push(destination);
		int prevVertex = distanceTable.get(destination).getLastVertex();
		
		while(prevVertex != -1 && prevVertex ==  source) {
			stack.push(prevVertex);
			prevVertex =  distanceTable.get(prevVertex).getLastVertex();	
			}
		if(prevVertex == -1) {
			System.out.println("there is no path");
		}else {
			System.out.println(source);
			while(!stack.isEmpty()) {
				System.out.println("->"+stack.pop());
			}
		}
	}

	// build distance table
	
	public static Map<Integer,DistanceInfo> buildDistanceInfo(AdjancecyMatrixGraph graph,int source){
		Map<Integer,DistanceInfo> distanceTable =  new HashMap<>();
		for (int i = 0; i < graph.getNumVertices(); i++) {
			distanceTable.put(i, new DistanceInfo());	
		}
		
		distanceTable.get(0).distance = 0;
		distanceTable.get(source).lastVertex = source;
		
		Queue<Integer> queue =  new LinkedList<Integer>();
		queue.add(source);
		
		while(!queue.isEmpty()) {
			int currVertex =  queue.poll();
			for(int i : graph.getAdjacentVertices(currVertex)) {
				int currDistance = distanceTable.get(i).getDistance();
				if(currDistance == -1) {
					currDistance = 1 + distanceTable.get(currVertex).getDistance();
					distanceTable.get(i).setDistance(currDistance);
					distanceTable.get(i).setLastVertex(currVertex);
					queue.add(i);
				}
			}
		}
		return distanceTable;
	}
	
	//distance info table
	public static class DistanceInfo{
		private int distance;
		private int lastVertex;
		
		public DistanceInfo() {
			distance = -1;
			lastVertex = -1;
		}

		public int getDistance() {
			return distance;
		}

		public void setDistance(int distance) {
			this.distance = distance;
		}

		public int getLastVertex() {
			return lastVertex;
		}

		public void setLastVertex(int lastVertex) {
			this.lastVertex = lastVertex;
		}
		
	}
	
}
