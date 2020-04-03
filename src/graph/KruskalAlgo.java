package graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

public class KruskalAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void spanningTree(Graph graph) {
		// add all the edges in the priorty Queu
		PriorityQueue<EdgeInfo> queue = new PriorityQueue<>(new Comparator<EdgeInfo>() {
			public  int compare(EdgeInfo v1, EdgeInfo v2) {
				return  ((Integer)v1.getWeight()).compareTo(v2.getWeight());
			}
		});
		
		//add all the edges in the priority Queue
		for (int i = 0; i < graph.getNumVertices() ; i++) {
			for(int neighbour : graph.getAdjacentVertices(i)) {
				queue.add(new EdgeInfo(i,neighbour,graph.getWeightedEdge(1, neighbour)));
			}
		}
		
		Set<Integer> visitedVertices = new HashSet<>();
		Set<EdgeInfo> spanningTree = new HashSet<>();
		HashMap<Integer, Set<Integer>> edgeMap = new HashMap();
		
		for (int i = 0; i < graph.getNumVertices() ; i++) {
			edgeMap.put(i, new HashSet());
		}
		
		while(!queue.isEmpty() && spanningTree.size() < graph.getNumVertices()-1) {
			EdgeInfo currEdge = queue.poll();
			edgeMap.get(currEdge.getVertex1()).add(currEdge.getVertex2());
			//checkout the cycle
			if(hasCycle(edgeMap)) {
				edgeMap.get(currEdge.getVertex1()).remove(currEdge.getVertex2());
				continue;
			}
			spanningTree.add(currEdge);
			visitedVertices.add(currEdge.getVertex1());
			visitedVertices.add(currEdge.getVertex2());
		}
		
		 // Check whether all vertices have been covered with the spanning tree.
        if (visitedVertices.size() != graph.getNumVertices()) {
            System.out.println("Minimum Spanning Tree is not possible");
        } else {
            System.out.println("Minimum Spanning Tree using Kruskal's Algorithm");
            for(EdgeInfo edgeInfo : spanningTree ) {
                System.out.println(edgeInfo);
            }
        }
	}
	
	static boolean hasCycle(HashMap<Integer,Set<Integer>> edgeMap) {
		
		for(Integer sourceVertex : edgeMap.keySet()) {
			LinkedList<Integer> queue =  new LinkedList<>();
			queue.add(sourceVertex);
			Set<Integer> visitedVertex = new HashSet<>();
			while(!queue.isEmpty()) {
				int currVertex = queue.pollFirst();
				if(visitedVertex.contains(currVertex)) {
					return true;
				}
				visitedVertex.add(currVertex);
				queue.addAll(edgeMap.get(currVertex));
			}
		}
		return false;
	}
	
	public static class EdgeInfo{
		private Integer vertex1;
		private Integer vertex2;
		private Integer weight;
		
		public EdgeInfo(Integer vertex1,Integer vertex2,Integer weight) {
			this.weight = weight;
			this.vertex1 = vertex1;
			this.vertex2 = vertex2;
		}

		public int getVertex1() {
			return vertex1;
		}

		public void setVertex1(int vertex1) {
			this.vertex1 = vertex1;
		}

		public int getVertex2() {
			return vertex2;
		}

		public void setVertex2(int vertex2) {
			this.vertex2 = vertex2;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return String.valueOf(vertex1)+String.valueOf(vertex2);
		}
		
		
	}

}
