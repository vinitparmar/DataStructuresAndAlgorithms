package graph;

import java.lang.management.GarbageCollectorMXBean;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class BellmanFord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph1 = new AdjancecyMatrixGraph(8, Graph.GraphType.DIRECTED);
        graph1.addEdge(2, 7, 4);
        graph1.addEdge(0, 3, 23);
        graph1.addEdge(0, 4, 23);
        graph1.addEdge(0, 1, 1);
        graph1.addEdge(2, 1, 3);
        graph1.addEdge(1, 3, 2);
        graph1.addEdge(3, 5, 1);
        graph1.addEdge(3, 6, 3);
        graph1.addEdge(4, 7, 2);
        graph1.addEdge(7, 5, 4);

      //  shortesPath(graph1, 0, 5);


        Graph graph2 = new AdjancecyMatrixGraph(5, Graph.GraphType.DIRECTED);
        graph2.addEdge(0, 1, 2);
        graph2.addEdge(0, 2, 1);
        graph2.addEdge(1, 3, 3);
        graph2.addEdge(1, 4, -2);
        graph2.addEdge(2, 4, 2);
        graph2.addEdge(4, 3, 1);
        graph2.addEdge(2, 1, -5);

        shortesPath(graph2, 0, 3);

        Graph graph3 = new AdjancecyMatrixGraph(5, Graph.GraphType.DIRECTED);
        graph3.addEdge(0, 1, 2);
        graph3.addEdge(0, 2, 3);
        graph3.addEdge(3, 1, 2);
        graph3.addEdge(1, 4, -5);
        graph3.addEdge(2, 4, 6);
        graph3.addEdge(4, 3, -4);

       // shortesPath(graph3, 0, 3);

        Graph graph4 = new AdjancecyMatrixGraph(6, Graph.GraphType.DIRECTED);
        graph4.addEdge(0, 1, 2);
        graph4.addEdge(1, 2, 3);
        graph4.addEdge(2, 3, 2);
        graph4.addEdge(3, 4, -5);
        graph4.addEdge(3, 5, 1);
        graph4.addEdge(4, 5, -3);
        graph4.addEdge(5, 4, -3);

        //shortesPath(graph4, 0, 5);

	}
	
	public static HashMap<Integer, DistanceInfo> buildTableInfo(Graph graph,int source){
		
		HashMap<Integer, DistanceInfo> distanceTable = new HashMap<>();
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i = 0; i<graph.getNumVertices();i++) {
			distanceTable.put(i,new DistanceInfo());
		}
		distanceTable.get(source).setDistance(0);
		distanceTable.get(source).setLastVertex(source);
		
		for (int numVerticesItr = 0; numVerticesItr < graph.getNumVertices()-1; numVerticesItr++) {
			// ADD Eevey c=vertex to the queue
			
			for (int i = 0; i < graph.getNumVertices(); i++) {
				queue.add(i);
			}
			
			// keep the trak of visted edges
			Set<String> visitedEdges = new HashSet<>();
			while(!queue.isEmpty()) {
				int currentVertex = queue.poll();
				// iterare all the neighbouring  vertex to he slected vertex
				for(Integer neighbour : graph.getAdjacentVertices(currentVertex)) {
					
					String edge = String.valueOf(currentVertex)+String.valueOf(neighbour);
					if(visitedEdges.contains(edge)) {
						continue;
					}
					visitedEdges.add(edge);
					
					int distance =  distanceTable.get(currentVertex).getDistance() + graph.getWeightedEdge(currentVertex, neighbour);
					
					if(distanceTable.get(neighbour).getDistance() > distance) {
						distanceTable.get(neighbour).setDistance(distance);
						distanceTable.get(neighbour).setLastVertex(currentVertex);
					}
				}
			}
		}
		
		// add all the vertices to the queue
		for (int i = 0; i < graph.getNumVertices() ; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			int currVertex = queue.poll();
			for (Integer neighbour : graph.getAdjacentVertices(currVertex)) {
				int distance = distanceTable.get(currVertex).getDistance() + graph.getWeightedEdge(currVertex, neighbour);
				
				if(distanceTable.get(neighbour).getDistance() > distance) {
					throw new IllegalArgumentException("graph has negative cycle");
				}
			}
		}
		return distanceTable;
	}
	
	public static void shortesPath (Graph graph, int source , int destination) {
		HashMap<Integer, DistanceInfo> distanceTable =  buildTableInfo(graph, source);
		Stack<Integer> stack = new Stack<>();
		stack.push(destination);
		
		int prevVertex =  distanceTable.get(destination).getLastVertex();
		while(prevVertex !=-1 && prevVertex != source) {
			stack.push(prevVertex);
			prevVertex = distanceTable.get(prevVertex).getLastVertex();
		}
		
		 if (prevVertex == -1) {
	            System.out.println("There is no path from node: " + source
	                    + " to node: " + destination);
	        }
	        else {
	            System.out.print("Smallest Path is " + source);
	            while (!stack.isEmpty()) {
	                System.out.print(" -> " +stack.pop());
	            }
	            System.out.println("\nBellmanFord DONE!");
	        }
		
	}
	public static class DistanceInfo{
		int lastVertex;
		int distance;
		
		public DistanceInfo()
		{
			lastVertex = -1;
			distance = 10000000;
		}

		public int getLastVertex() {
			return lastVertex;
		}

		public void setLastVertex(int lastVertex) {
			this.lastVertex = lastVertex;
		}

		public int getDistance() {
			return distance;
		}

		public void setDistance(int distance) {
			this.distance = distance;
		}
		
	}
	
	

}
