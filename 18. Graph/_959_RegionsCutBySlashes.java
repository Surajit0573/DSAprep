import java.util.*;

public class _959_RegionsCutBySlashes {

    // Find - Function time Complexity = O(4k)=O(1)
    public static int Find(int k, int[] perent, int[] rank) {
        if (k == perent[k]) {
            return k;
        }
        return perent[k] = Find(perent[k], perent, rank);// Path compression optimization
    }

    // Union Function ntime Complexity = O(4k)=O(1)
    public static int Union(int u, int v, int[] perent, int[] rank, int cycle) {
        int U = Find(u, perent, rank);
        int V = Find(v, perent, rank);
        if (U == V) {
            cycle++;
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
        return cycle;
    }

    public static void unionUtil(int u, int v, int[] perent, int[] rank) {
        perent[v] = u;
        rank[u]++;
    }
    public static int regionsBySlashes(String[] grid) {
        // find cycles by union ans find mathod
        int n = grid.length + 1;
        int length = (int) Math.pow((n), 2);
        int[] rank = new int[length];
        int[] perent = new int[length];
        for (int i = 0; i < perent.length; i++) {
            perent[i] = i;
            rank[i] = 0;
        }
        int cycle = 0;
        for (int i = 1; i < n; i++) {
            cycle = Union(i, i - 1, perent, rank, cycle);
        }
        for (int i = n + n-1; i < n * n; i = i + n) {
            cycle = Union(i, i - n, perent, rank, cycle);
        }

        int lc = n * n - n;
        for (int i = n*n - 2; i >= lc; i--) {
            cycle = Union(i, i + 1, perent, rank, cycle);
        }
        for (int i = n; i <= lc; i = i + n) {
            cycle = Union(i, i - n, perent, rank, cycle);
        }
        for (int i = 0; i < n - 1; i++) {
            int upline = n * i;
            int downline = upline + n;
            for (int j = 0; j < n - 1; j++) {
                if (grid[i].charAt(j) == '/') {
                    upline++;             
                    cycle = Union(upline, downline, perent, rank, cycle);
                    downline++;
                } else if (grid[i].charAt(j) == '\\') {
                    downline++;
                    cycle = Union(upline, downline, perent, rank, cycle);
                    upline++;
                } else {
                    downline++;
                    upline++;
                }
            }
        }
        return cycle;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] grid={"/ ","/ "};
        System.out.println(regionsBySlashes(grid));
        sc.close();
    }
}