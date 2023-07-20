import java.util.*;

public class _787_CheapestFlightsWithinKStops {
    public static class Edge {
        int s;
        int d;
        int w;

        Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public static class Info {
        int v;
        int cost;
        int stop;

        Info(int v, int cost, int stop) {
            this.v = v;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            graph[flights[i][0]].add(new Edge(flights[i][0], flights[i][1], flights[i][2]));
        }
        Queue<Info> q = new LinkedList<>();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        q.add(new Info(src, 0, 0));
        while (!q.isEmpty()) {
            Info t = q.remove();

            for (int i = 0; i < graph[t.v].size(); i++) {
                Edge e = graph[t.v].get(i);
                if (t.stop <= k) {
                    int newdist=t.cost + e.w;
                    if(dist[e.d]>newdist){
                        dist[e.d]=newdist;
                        q.add(new Info(e.d, dist[e.d], t.stop + 1));
                    }
                    
                }

            }
        }
        if (dist[dst] != Integer.MAX_VALUE) {
            return dist[dst];
        } else {
            return -1;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}