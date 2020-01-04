public class Navigator {
    public static void main(String args[]) {
        int map[][]  = {
        {5, 7, 4, 8},
        {6, 1, 2, 3},
        {8, 4, 7, 9},
        {3, 3, 3, 5},
        };
        Dijkstra dijkstra = new Dijkstra(map, map[0].length);
        dijkstra.runAlg(0);
        int dist[] = dijkstra.getDist();
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }
    }
}