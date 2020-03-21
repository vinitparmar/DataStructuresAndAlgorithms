package graph;

import java.util.List;

import graph.Graph.GraphType;

public class GraphDFSTraversal {
	
	private static int numberOfVertices = 8;
	private static void dfsTraversal(Graph graph,int[] visited,int currVertex){
		if(visited[currVertex]==1) {
			return;
		}
		
		visited[currVertex]=1;
		
		List<Integer> list = graph.getAdjacentVertices(currVertex);
		
		for(int vertex : list) {
			dfsTraversal(graph, visited, currVertex);
		}
		System.out.print(currVertex+" ");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new AdjancecyMatrixGraph(numberOfVertices, GraphType.DIRECTED);
			graph.addEdge(1, 0);
	        graph.addEdge(1, 2);
	        graph.addEdge(2, 7);
	        graph.addEdge(2, 4);
	        graph.addEdge(2, 3);
	        graph.addEdge(1, 5);
	        graph.addEdge(5, 6);
	        graph.addEdge(6, 3);
	        graph.addEdge(3, 4);
	        
	        int[] visited = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
	        
	        for (int i = 0; i < numberOfVertices; i++) {
	        dfsTraversal(graph,visited,i);
	        }

		
	}

}
