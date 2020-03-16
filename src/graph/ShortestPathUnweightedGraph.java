
//link for the question
//https://www.geeksforgeeks.org/number-shortest-paths-unweighted-directed-graph/

package graph;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweightedGraph {
	static int n =  7;// number of vertices
    static LinkedList<Integer> adj[];
    
    // adding the edge
    static void addEdge(int start, int dest) {
    	adj[start].add(dest);
    }
    
    // function to find the shorteest path
    static void shortestPath(int startNode, int destNode) {
    	int[] dist =  new int[n];
    	int[] path = new int[n];
    	
    	for (int i = 0; i < n; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
    	
    	for (int i = 0; i < n; i++) {
			path[i]=0;
		}
    	
    	BFS(path,dist,startNode,destNode);
    	
    }
    
    //traverse the graph in bfs manner
    
    static void BFS(int[] path,int[] dist,int startnode ,int destNode) {
    	//mark all nodes as boolean
    	boolean[] visited =  new boolean[n];
    	for (int i = 0; i < n; i++) {
			visited[i]=false;
		}
    	dist[startnode]=0;
    	path[startnode]=1;
    	
    	Queue<Integer> q = new LinkedList<>();
    	q.add(startnode);
    	visited[startnode]=true;
    	while(!q.isEmpty()) {
    		int curr =  q.poll();
    		
    		//for all neighbors of the node
    		for(int x : adj[curr]) {
    			
    			if(visited[x] == false) {
    				q.add(x);
    				visited[x]= true;
    			}
    			
    			// check if there is a better path
    			if (dist[x] > dist[curr]+1) {
					dist[x]=dist[curr]+1;
					path[x]=path[curr];
					
					if(x == destNode) {
						System.out.print("shortest path : "+dist[x]);
					}
				}
    			
    		}
    	}
    }
	
	public static void main(String[] args) {
		adj = new LinkedList[n];
		for (int i = 0; i < n; i++) {	
			adj[i] =  new LinkedList();
		}
		
		addEdge( 0, 1); 
        addEdge( 0, 2); 
        addEdge( 1, 2); 
        addEdge( 1, 3); 
        addEdge( 2, 3); 
        addEdge( 3, 4); 
        addEdge( 3, 5); 
        addEdge( 4, 6); 
        addEdge( 5, 6); 
        shortestPath( 0, 5); 
	}

}
