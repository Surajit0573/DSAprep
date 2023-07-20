import java.util.*;

public class _1584_MinCosttoConnectAllPoints {

    public static int Find(int k, int[] perent, int[] rank) {
        if (k == perent[k]) {
            return k;
        }
        return perent[k] = Find(perent[k], perent, rank);
    }

    // Union
    public static boolean Union(int u, int v, int[] perent, int[] rank) {
        int U = Find(u, perent, rank);
        int V = Find(v, perent, rank);
        if (U == V) {
            return false;
        }
        if (rank[U] > rank[V]) {
            perent[V] = U;
        } else if (rank[U] < rank[V]) {
            perent[U] = V;
        } else {
            if (U > V) {
                unionUtil(V, U, perent, rank);
            } else {
                unionUtil(U, V, perent, rank);
            }
        }
        return true;
    }

    public static void unionUtil(int u, int v, int[] perent, int[] rank) {
        perent[v] = u;
        rank[u]++;
    }

    public static class Info implements Comparable<Info> {
        int u;
        int v;
        int cost;

        Info(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }

        public int compareTo(Info p) {
            return this.cost - p.cost;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] rank = new int[n];
        int[] perent = new int[n];
        for (int i = 0; i < perent.length; i++) {
            perent[i] = i;
            rank[i] = 0;
        }
        ArrayList<Info> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                arr.add(new Info(i,j, val));
            }
        }
        Collections.sort(arr);
        int x=0;
          int cost = 0;
        for(int i=0;i<arr.size()&&x<n;i++){
            Info w=arr.get(i);
            if(Union(w.u,w.v, perent, rank)){
                cost+=w.cost;
            }
        }
        return cost;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}