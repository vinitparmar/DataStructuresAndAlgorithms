package graph;

import java.util.ArrayList;
import java.util.List;

public class AdjencySetAndListGraph implements Graph {
	
	int numVertices = 0;
	GraphType graphType = GraphType.DIRECTED;
	List<Node> vertexList = new ArrayList<Node>();
	

	public AdjencySetAndListGraph(int numVertices , Graph graphtype) {
		this.numVertices = numVertices;
		for (int i = 0; i < numVertices ; i++) {
			vertexList.add(new Node(i));
		}
		
		this.graphType = graphType;
	}


	@Override
	public void addEdge(int v1, int v2) {
		// TODO Auto-generated method stub
		vertexList.get(v1).addEdge(v2);
		if(graphType == graphType.UNDIRECTED) {
			vertexList.get(v2).addEdge(v1);
		}
		
	}

	@Override
	public List<Integer> getAdjacentVertices(int v) {
		// TODO Auto-generated method stub
		return vertexList.get(v).getAdjancencySet();
	}
	
	
}
