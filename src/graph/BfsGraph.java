package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BfsGraph {
	class Vertex {
		public char label;
		public boolean visited;
		 public Vertex(char label) {
			 this.label = label;
			 visited = false;
		}
	}
	
	class Graph {
		private int maxVertices= 20;
		private Vertex vertexList[];
		private int adjMatrix[][];
		private int vertexCount;
		private Queue theQueue;
		
		public Graph() {
			vertexList = new Vertex[maxVertices];
			adjMatrix =  new int [maxVertices][maxVertices];
			vertexCount = 0;
			
			for (int i = 0; i < maxVertices ; i++) {
				for (int j = 0; j < maxVertices ; j++) {
					adjMatrix[i][j]=0;
				}
			}
			theQueue = new LinkedList();
			
		}
		
		public void addVertex(char label) {
			vertexList[vertexCount++]= new Vertex(label);
		}
		
		public void addEdge(int start,int end) {
			adjMatrix[start][end]=1;
			adjMatrix[end][start]=1;
		}
		private void displayVertex(int v) {
			System.out.print(vertexList[v].label);
		}
		
		public int getUnvisitedNode(int v) {
			for (int i = 0; i < vertexCount; i++) {
				
					if(adjMatrix[v][i]==1 && vertexList[i].visited == false) {
						return i;
					}
				
			}
			return -1 ;
		}
		
		public void bfs() {
			vertexList[0].visited = true;
			displayVertex(0);
			theQueue.add(0);
			int v2;
			
			while(!theQueue.isEmpty()) {
				int v1 = (Integer)theQueue.poll();
				v2 =  getUnvisitedNode(v1);
				if(v2!=-1) {
					vertexList[v2].visited = true;
					displayVertex(v2);
					theQueue.add(v2);
				}
				
			}
			
			for (int i = 0; i < vertexCount; i++) {
				vertexList[i].visited = false;
			}
		}
	}

}
