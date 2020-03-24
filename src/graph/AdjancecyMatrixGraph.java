package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjancecyMatrixGraph implements Graph{
	
	private int adjancencyMatrix[][];
	private GraphType graphType = GraphType.DIRECTED;
	private int numVertices = 0;
	
	
	public int getNumVertices() {
		return numVertices;
	}


	public void setNumVertices(int numVertices) {
		this.numVertices = numVertices;
	}

	
	
	public AdjancecyMatrixGraph(int numVertices ,GraphType graphtype) {
		this.graphType =  graphType;
		this.numVertices =  numVertices;
		adjancencyMatrix =  new int[numVertices][numVertices];
		
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				adjancencyMatrix[i][j]=0;
			}
			
		}
		
	}
	

	@Override
	public void addEdge(int v1, int v2) {
		adjancencyMatrix[v1][v2] = 1;
		if(graphType == graphType.UNDIRECTED) {
			adjancencyMatrix[v2][v1] = 1;
		}
		
	}

	@Override
	public List<Integer> getAdjacentVertices(int v) {
		List<Integer> adjancencyVertexList = new ArrayList<Integer>();
		if(v>=0 && v<numVertices) {
			for(int i=0; i<numVertices;i++) {
				if(adjancencyMatrix[v][i]==1) {
					adjancencyVertexList.add(i);
				}
			}
		}
		//return list in sorted order
		Collections.sort(adjancencyVertexList);
		return adjancencyVertexList;
	}

}
