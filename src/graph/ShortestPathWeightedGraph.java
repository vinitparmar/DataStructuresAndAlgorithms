package graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

import graph.Graph.GraphType;





public class ShortestPathWeightedGraph {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new AdjancecyMatrixGraph(5, GraphType.DIRECTED);
		graph.addEdge(0, 1, 6);
        graph.addEdge(1, 4, 3);
        graph.addEdge(0, 3, 1);
        graph.addEdge(3, 2, 2 );
        graph.addEdge(2, 1, 3);
        
        shortestPath(graph,0,4);

	}
	
	
	public static HashMap<Integer,DistanceEdgeInfo> buildDistanceTable(Graph graph,int source){
		
		
		PriorityQueue<VertexInfo> queue = new PriorityQueue<>(new Comparator<VertexInfo>() {
            @Override
            public int compare(VertexInfo v1, VertexInfo v2) {
                 if (v1.getDistance().compareTo(v2.getDistance()) != 0) {
                     return  v1.getDistance().compareTo(v2.getDistance());
                 }
                 return v1.getNumEdges().compareTo(v2.getNumEdges());
            }
        });
		
		
		HashMap<Integer, DistanceEdgeInfo> distanceTable = new HashMap<>();
		for (int i = 0; i < graph.getNumVertices(); i++) {
				distanceTable.put(i, new DistanceEdgeInfo());
			
		}
		distanceTable.get(source).setInfo(source, 0, 0);
		// create vertex info node
		VertexInfo sourceVertexInfo = new VertexInfo(source, 0, 0);
		
		//use priority queue to add node
		queue.add(sourceVertexInfo);
		
		HashMap<Integer, VertexInfo> vertexInfoMap = new HashMap(); 
		vertexInfoMap.put(source, sourceVertexInfo);
		
		while(!queue.isEmpty()) {
			VertexInfo currVertexInfo = queue.poll();
			
			for(Integer neighbour : graph.getAdjacentVertices(currVertexInfo.getVertexId())) {
			//get distance
			int distance = distanceTable.get(currVertexInfo.getVertexId()).getDistance() + graph.getWeightedEdge(currVertexInfo.getVertexId(), neighbour);
			// get edges
			int edges = distanceTable.get(currVertexInfo.getVertexId()).getDistance()+1;
			
			int neighbourDistance = distanceTable.get(neighbour).getDistance();
			if(neighbourDistance > distance || (neighbourDistance == distance) &&  (distanceTable.get(neighbour).getNumEdges() > edges)) {
				distanceTable.get(neighbour).setInfo(
                        currVertexInfo.getVertexId(), distance, edges);

                VertexInfo neighbourVertexInfo = vertexInfoMap.get(neighbour);
                if (neighbourVertexInfo != null) {
                    queue.remove(neighbourVertexInfo);
                }

                // Set up the updated neigbour vertex info with the new distance
                // and number of edges.
                neighbourVertexInfo = new VertexInfo(neighbour, distance, edges);
                queue.add(neighbourVertexInfo);
                vertexInfoMap.put(neighbour, neighbourVertexInfo);
            
			}
			
			}
		}
		
		return  distanceTable;
	}
	
	
	public static void shortestPath(Graph graph,int source, int destination)	{
		HashMap<Integer,DistanceEdgeInfo> distanceTable = buildDistanceTable(graph, source);
		 Stack<Integer> stack = new Stack<>();
	        stack.push(destination);

	        int previousVertex = distanceTable.get(destination).getLastVertex();
	        while (previousVertex != -1 && previousVertex != source) {
	            stack.push(previousVertex);
	            previousVertex = distanceTable.get(previousVertex).getLastVertex();
	        }

	        if (previousVertex == -1) {
	            System.out.println("There is no path from node: " + source
	                    + " to node: " + destination);
	        }
	        else {
	            System.out.print("Smallest Path is " + source);
	            while (!stack.isEmpty()) {
	                System.out.print(" -> " +stack.pop());
	            }
	            System.out.println();
	            System.out.println("ShortestPathWeightWithMinEdges DONE!");
	        }
	}
	

    public static class DistanceEdgeInfo {

        private Integer distance;
        private Integer numEdges;
        private Integer lastVertex;

        public DistanceEdgeInfo() {
            distance = Integer.MAX_VALUE;
            lastVertex = -1;
            numEdges = Integer.MAX_VALUE;
        }

        public Integer getDistance() {
            return distance;
        }

        public Integer getLastVertex() {
            return lastVertex;
        }

        public Integer getNumEdges() {
            return numEdges;
        }

        public void setInfo(int lastVertex, int distance, int numEdges) {
            this.distance = distance;
            this.lastVertex = lastVertex;
            this.numEdges = numEdges;
        }
    }

    public static class VertexInfo {

        private Integer vertexId;
        private Integer distance;
        private Integer numEdges;

        public VertexInfo(int vertexId, int distance, int edges) {
            this.vertexId = vertexId;
            this.distance = distance;
            this.numEdges = edges;
        }

        public Integer getVertexId() {
            return vertexId;
        }

        public Integer getDistance() {
            return distance;
        }

        public Integer getNumEdges() {
            return numEdges;
        }
    }}
