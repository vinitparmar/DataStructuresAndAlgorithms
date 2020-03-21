package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.plaf.synth.SynthStyle;

public class GraphBFSTraversal {
	static int numberOfVertices = 8;
	
	static void bfsTraversal(Graph graph,int[] visited,int currentVertex) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(currentVertex);
		
		while(!queue.isEmpty()) {
			int vertex = queue.poll();
			if(visited[currentVertex]==1) {
				continue;
			}
			
			System.out.print(vertex+" ");
			visited[vertex]=1;
			
			List<Integer> list = graph.getAdjacentVertices(vertex);
			for(int n : list) {
				if(visited[n]!=1) {
					queue.add(n);
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Graph graph = new AdjancecyMatrixGraph(numberOfVertices, Graph.GraphType.DIRECTED);
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

	        // This for-loop ensures that all nodes are covered even for an unconnected
	        // graph.
	        for (int i = 0; i < numberOfVertices ; i++) {
	            bfsTraversal(graph, visited, i);
	        }
	}

}
