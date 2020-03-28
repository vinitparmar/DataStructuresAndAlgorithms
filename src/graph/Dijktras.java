package graph;

import java.util.*;

public class Dijktras {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Graph graph1 = new AdjancecyMatrixGraph(8, Graph.GraphType.DIRECTED);
		        graph1.addEdge(2, 7, 4);
		        graph1.addEdge(0, 3, 2);
		        graph1.addEdge(0, 4, 2);
		        graph1.addEdge(0, 1, 1);
		        graph1.addEdge(2, 1, 3);
		        graph1.addEdge(1, 3, 2);
		        graph1.addEdge(3, 5, 1);
		        graph1.addEdge(3, 6, 3);
		        graph1.addEdge(4, 7, 2);
		        graph1.addEdge(7, 5, 4);
		        shortestPath(graph1,0,5);
	}
	
	
	public static HashMap<Integer,DistanceInfo> buildDistanceTable(Graph graph,int source){
		PriorityQueue<VertexInfo> queue =new  PriorityQueue<VertexInfo>(new Comparator<VertexInfo>() {
			public int compare(VertexInfo v1,VertexInfo v2) {
				return ((Integer)v1.getDistance()).compareTo(v2.getDistance());
			}
		});
		// create a table
		HashMap<Integer,DistanceInfo> distanceTable = new HashMap();
		
		//create a map of vertex info
		HashMap<Integer, VertexInfo> vertexInfoMap =  new HashMap<>();
		
		for(int i =0;i<graph.getNumVertices();i++) {
			distanceTable.put(i, new DistanceInfo());
		}
		
		distanceTable.get(source).setDistance(0);
		distanceTable.get(source).setLastVertex(0);
		
		VertexInfo sourceVertexInfo = new VertexInfo(source, 0);
		queue.add(sourceVertexInfo);
		vertexInfoMap.put(source,sourceVertexInfo);
		
		while (!queue.isEmpty()) {
			VertexInfo vertexInfo = queue.poll();
			int currentVertex =  vertexInfo.getVertexId();
			
			for(Integer neighbour : graph.getAdjacentVertices(currentVertex)) {
				// get the new distance with current edge and the neighbour
				int distance = distanceTable.get(currentVertex).getDistance()+graph.getWeightedEdge(currentVertex, neighbour);
				// if we find the new shortest path to the neighbour
				// the distance and the last vertex
				if(distanceTable.get(neighbour).getDistance() > distance) {
					distanceTable.get(neighbour).setDistance(distance);
					distanceTable.get(neighbour).setLastVertex(currentVertex);
					
					// we have found the new shortest path
					
					VertexInfo neighbourVertexInfo =  vertexInfoMap.get(neighbour);
					if(neighbourVertexInfo != null) {
						queue.remove(neighbourVertexInfo);
					}
					
					neighbourVertexInfo = new VertexInfo(neighbour, distance);
					queue.add(neighbourVertexInfo);
					vertexInfoMap.put(neighbour, neighbourVertexInfo);		
				}
			}	
		}
		return distanceTable;
	}
	
	public static void shortestPath(Graph graph,int source, int destination) {
		HashMap<Integer,DistanceInfo> distanceTable = buildDistanceTable(graph,source);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(destination);
		
		int prevVertex =  distanceTable.get(destination).getLastVertex();
		while(prevVertex != -1 && prevVertex != source) {
			stack.push(prevVertex);
			prevVertex =  distanceTable.get(prevVertex).getLastVertex();		
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
	            System.out.print("\nDijkstra  DONE!");
	        }
	}
	
	public static class DistanceInfo {
		private int distance;
		private int lastVertex;
		
		public DistanceInfo() {
			distance = Integer.MAX_VALUE;
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
	
	public static class VertexInfo {
		private int vertexId;
		private int distance;
		
		public VertexInfo(int vertexId,int distance) {
			this.vertexId = vertexId;
			this.distance = distance;
		}

		public int getVertexId() {
			return vertexId;
		}

		public void setVertexId(int vertexId) {
			this.vertexId = vertexId;
		}

		public int getDistance() {
			return distance;
		}

		public void setDistance(int distance) {
			this.distance = distance;
		}
		
	}

}
