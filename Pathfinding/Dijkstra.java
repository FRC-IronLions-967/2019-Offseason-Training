public class Dijkstra {
    private static final int INFINITE = Integer.MAX_VALUE;
    private int numNodes;
    private int graph[][];
    private int dist[];
    private int parents[];
    private Boolean verticesChecked[];

    public Dijkstra(int graph[][], int numNodes) {
        this.numNodes = numNodes;
        this.graph = graph;

        dist = new int[numNodes];
        parents = new int[numNodes];
        verticesChecked = new Boolean[numNodes];

        for (int i = 0; i < numNodes; i++) {
            dist[i] = INFINITE;
            verticesChecked[i] = false;
        }
    }

    //standard convenience getter methods for external use to get the algorithm outputs and debugging
    public int[] getDist() {
        return dist;
    }

    public int[] getParents() {
        return parents;
    }

    public int[][] getGraph() {
        return graph;
    }

    //standard convenience setter methods to alter values to run the algorithm again without creating a new objects
    //TODO

    //convenience class method to find the next smallest distance that has not yet been used by the algorithm 
    private int minDistance() {
        int min = INFINITE;
        int min_index = -1; 
  
        for (int i = 0; i < numNodes; i++) {
            if (verticesChecked[i] == false && dist[i] <= min) { 
                min = dist[i]; 
                min_index = i; 
            } 
        }

        return min_index; 
    }

    //method to run Dijkstra's Shortest Path Algorithm on the current object
    public void runAlg(int src) {
        if(graph[0].length != graph.length || graph.length != numNodes) return; //check for bad conditions
        dist[src] = 0;
        parents[src] = -1;

        for(int i = 0; i < numNodes - 1; i++) {
            int x = minDistance();
            verticesChecked[x] = true;

            for(int y = 0; y < numNodes; y++) {
                if (!verticesChecked[j] && graph[x][y] != 0 && dist[x] != INFINITE && dist[x] + graph[x][y] < dist[y]) {
                    dist[y] = dist[y] + graph[x][y];
                    parents[y] = x;
                }
            }
        }
    }


}