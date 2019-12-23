import java.util.*;

public class Pathfinder {
    static final int V = 9;
    static final int INFINITE = Integer.MAX_VALUE;
    int parents[] = new int[V];

    public int minDistance(int dist[], Boolean verticesChecked[]) { 
        // Initialize min value 
        int min = INFINITE, min_index = -1; 
  
        for (int v = 0; v < V; v++) {
            if (verticesChecked[v] == false && dist[v] <= min) { 
                min = dist[v]; 
                min_index = v; 
            } 
        }
        return min_index; 
    }

    public void printPath(int currentVertex, int[] parents) { 
        // Base case : Source node has 
        // been processed 
        if (currentVertex == -1) { 
            return; 
        } 
        printPath(parents[currentVertex], parents); //recursive call to continue printing e.g. 2 reroutes to 7 reroutes to 5
        System.out.print(currentVertex + " "); 
    } 

    public void printSolution(int startVertex, int[] distances, int[] parents) { 
        System.out.print("Vertex\t Distance\tPath"); 
          
        for (int vertexIndex = 0; vertexIndex < V; vertexIndex++) { 
            if (vertexIndex != startVertex) { 
                System.out.print("\n" + startVertex + " -> "); 
                System.out.print(vertexIndex + " \t\t "); 
                System.out.print(distances[vertexIndex] + "\t\t"); 
                printPath(vertexIndex, parents); 
            } 
        } 
        System.out.println();
        for (int i = 0; i < parents.length; i++) {
            System.out.println(parents[i]);
        }
    } 
  
    // Function that implements Dijkstra's single source shortest path 
    // algorithm for a graph represented using adjacency matrix 
    // representation 
    public void dijkstra(int graph[][], int src, int targetNode) { 
        int dist[] = new int[V]; // The output array. dist[i] will hold 
        // the shortest distance from src to i 
  
        // verticesChecked[i] will true if vertex i is included in shortest 
        // path tree or shortest distance from src to i is finalized 
        Boolean verticesChecked[] = new Boolean[V]; 
  
        // Initialize all distances as INFINITE and verticesChecked[] as false 
        for (int i = 0; i < V; i++) { 
            dist[i] = INFINITE; 
            verticesChecked[i] = false; 
        } 
  
        // Distance of source vertex from itself is always 0 
        dist[src] = 0;
        parents[src] = -1; 
  
        // Find shortest path for all vertices 
        for (int count = 0; count < V - 1; count++) { 
            // Pick the minimum distance vertex from the set of vertices 
            // not yet processed. u is always equal to src in first 
            // iteration. 
            int u = minDistance(dist, verticesChecked); 
            System.out.println(u);
            // Mark the picked vertex as processed 
            verticesChecked[u] = true; 
  
            // Update dist value of the adjacent vertices of the 
            // picked vertex. 
            for (int v = 0; v < V; v++) {
  
                // Update dist[v] only if is not in verticesChecked, there is an 
                // edge from u to v, and total weight of path from src to 
                // v through u is smaller than current value of dist[v] 
                if (!verticesChecked[v] && graph[u][v] != 0 && dist[u] != INFINITE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    parents[v] = u;
                }
            }
        } 
  
        // print the constructed distance array 
        printSolution(src, dist, parents); 
    }
  
    // Driver method 
    public static void main(String[] args) { 
        /* Let us create the example graph discussed above */
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
        Pathfinder t = new Pathfinder(); 
        t.dijkstra(graph, 0, 1); 
    } 
}