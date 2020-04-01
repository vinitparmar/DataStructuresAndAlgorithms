package graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

import graph.Graph.GraphType;

public class PrimSpanningTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Graph graph1 = new AdjancecyMatrixGraph(8, GraphType.UNDIREDTED);
	        graph1.addEdge(2, 7, 4);
	        graph1.addEdge(0, 3, 2);
	        graph1.addEdge(0, 4, 2);
	        graph1.addEdge(0, 1, 1);
	        graph1.addEdge(2, 1, 3);
	        graph1.addEdge(1, 3, 2);
	        graph1.addEdge(3, 5, 1);
	        graph1.addEdge(3, 6, 3);
	        graph1.addEdge(4, 7, 22);
	        graph1.addEdge(7, 5, 4);

	        spanningTree(0,graph1);

	}
	
	public static void spanningTree(int source , Graph graph) {
		HashMap<Integer, DistanceInfo> distanceTable = new HashMap<>();
		PriorityQueue<VertexInfo> queue = new PriorityQueue<>(new Comparator<VertexInfo>() {

			@Override
			public int compare(VertexInfo v1, VertexInfo v2) {
				
				return ((Integer)v1.getDistace()).compareTo(v2.getDistace());
			}
			
		});
		
		for(int i = 0 ;i < graph.getNumVertices(); i++) {
			distanceTable.put(i, new DistanceInfo());
		}
		
		distanceTable.get(source).getDistance();
		distanceTable.get(source).setLastVertex(source);
		
		HashMap<Integer, VertexInfo> vertexInfoMap = new HashMap<>();
		VertexInfo sourceVertexInfo = new VertexInfo(source, 0);
		
		vertexInfoMap.put(source, sourceVertexInfo);
		queue.add(sourceVertexInfo);
		
		Set<String> spanningtree =  new HashSet<>();
		Set<Integer> visitedVertices = new HashSet<>();
		
		while(!queue.isEmpty()) {
			VertexInfo vertexInfo =  queue.poll();
			int currVertex =  vertexInfo.getVertexId();
			// not visit the vertex which are already in the queue
			if(visitedVertices.contains(currVertex)) {
				continue;
			}
			visitedVertices.add(currVertex);
			
			// if current vertex is a source we dont have an edge
			if(currVertex != source) {
				String edge = String.valueOf(currVertex) + String.valueOf(distanceTable.get(currVertex).getLastVertex());
				
				if(!spanningtree.contains(edge)) {
					spanningtree.add(edge);
				}
			}
			
			for(Integer neighbour : graph.getAdjacentVertices(currVertex) ) {
				int distance =  graph.getWeightedEdge(currVertex, neighbour);
				if(distanceTable.get(neighbour).getDistance() > distance) {
					distanceTable.get(neighbour).setDistance(distance);
					distanceTable.get(neighbour).setLastVertex(currVertex);
					
					VertexInfo neighbourVertexInfo = vertexInfoMap.get(neighbour);
					if(neighbourVertexInfo != null) {
						queue.remove(neighbourVertexInfo);
					}
					
					neighbourVertexInfo = new VertexInfo(neighbour, distance);
					vertexInfoMap.put(neighbour, neighbourVertexInfo);
					queue.add(neighbourVertexInfo);
					
				}
				
			}
			
		}
		
		for(String edge :spanningtree) {
			System.out.println(edge);
		}
		
	}
	
	static class DistanceInfo{
		int distance;
		int lastVertex;
		
		public DistanceInfo(){
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
	
	static class VertexInfo {
		int vertexId;
		int distace;
		
		public VertexInfo(int vertexId,int distance) {
			this.vertexId =  vertexId;
			this.distace =  distance;
		}

		public int getVertexId() {
			return vertexId;
		}

		public void setVertexId(int vertexId) {
			this.vertexId = vertexId;
		}

		public int getDistace() {
			return distace;
		}

		public void setDistace(int distace) {
			this.distace = distace;
		}
	}

}
