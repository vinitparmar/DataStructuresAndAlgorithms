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
		if(graphType == graphType.UNDIREDTED) {
			vertexList.get(v2).addEdge(v1);
		}
		
	}

	@Override
	public List<Integer> getAdjacentVertices(int v) {
		// TODO Auto-generated method stub
		return vertexList.get(v).getAdjancencySet();
	}


	@Override
	public GraphType TypeofGraph() {
		// TODO Auto-generated method stub
		return graphType;
	}


	@Override
	public void addEdge(int v1, int v2, int weight) {
		// TODO Auto-generated method stub
		 throw new IllegalArgumentException("Weight not implemented in Adjacency Set");
		
	}


	@Override
	public int getWeightedEdge(int v1, int v2) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Weight not implemented in Adjacency Set");
	}


	@Override
	public int getNumVertices() {
		// TODO Auto-generated method stub
		return numVertices;
	}


	@Override
	public int getIndegree(int v) {
		int indegree = 0;
        for (int i = 0; i < numVertices; i++) {
          if(getAdjacentVertices(i).contains(v)) {
        	  indegree++;
          }
        }
        return indegree;
	}
	
	
}
