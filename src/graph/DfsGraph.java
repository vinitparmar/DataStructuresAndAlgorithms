package graph;

import java.util.Stack;

public class DfsGraph {
	//create a vertex
	
	class Vertex {
		public char label;
		public boolean visited;
		
		public Vertex(char label) {
			this.label = label;
			this.visited = false;
		}
	}
	
	class Graph {
		private final int maxVertices = 20;
		private Vertex vertexList[];
		private int adjMatrix[][];
		private int vertexCount;
		private Stack theStack;
		
		public Graph() {
			vertexList =  new Vertex[maxVertices];
			adjMatrix = new int[maxVertices][maxVertices];
			vertexCount = 0;
			for(int i = 0;i<maxVertices;i++) {
				for(int j=0;j<maxVertices;j++) {
					adjMatrix[i][j]= 0;
				}
			}
			
			theStack =  new Stack<>();
		}
		
		public void addVertex(char label) {
			vertexList[vertexCount++]= new Vertex(label);	
		}
		
		public void addEdge(int start, int end) {
			adjMatrix[start][end] = 1;
			adjMatrix[end][start] = 1;
		}
		
		public void displayVertex(int v) {
			System.out.print(vertexList[v].label);
		}
		
		public void dfs() {
			vertexList[0].visited = true;
			displayVertex(0);
			theStack.push(0);
			while(!theStack.isEmpty()) {
				// checkout the adjecent node to the stack top
				int v = getUnvisitedAdjNode((Integer)theStack.peek());
				if(v== -1) {
					theStack.pop();
				} else {
					vertexList[v].visited = true;
					displayVertex(v);
					theStack.push(v);
				}
				
			}
			// reset the flag of the vertex
			for(int j = 0 ;j<vertexCount;j++) {
				vertexList[j].visited = false;
			}
		}
		
		public int getUnvisitedAdjNode(int v) {
			for(int j = 0 ;j<vertexCount;j++) {
				if(adjMatrix[v][j] == 1 && vertexList[j].visited == false) {
					return j;
				}
			}
			return -1;
		}
		
	}
	

}
