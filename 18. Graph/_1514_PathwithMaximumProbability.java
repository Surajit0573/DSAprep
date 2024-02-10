import java.util.*;

public class _1514_PathwithMaximumProbability {

    public static class node implements Comparable<node> {
        int val;
        double wt;

        node(int val, double wt) {
            this.val = val;
            this.wt = wt;
        }

        public int compareTo(node n) {
            if (n.wt > this.wt) {
                return -1;
            } else if (n.wt < this.wt) {
                return 1;
            }
            return 0;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        @SuppressWarnings("unchecked")
        ArrayList<node>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(new node(edges[i][1], -Math.log(succProb[i])));
            graph[edges[i][1]].add(new node(edges[i][0],  -Math.log(succProb[i])));
        }
        PriorityQueue<node> pq = new PriorityQueue<>();
        double[] succ = new double[n];
        Arrays.fill(succ,Double.MAX_VALUE);
        succ[start_node] = 0;
        pq.add(new node(start_node,0));
        boolean[] vis = new boolean[n];
        while (!pq.isEmpty()) {
            node curr = pq.remove();
            vis[curr.val] = true;
            for (int i = 0; i < graph[curr.val].size(); i++) {
                node t = graph[curr.val].get(i);
                if (vis[t.val] == false) {
                    succ[t.val] = Math.min(succ[t.val], succ[curr.val]+t.wt);
                    t=new node(t.val,succ[t.val]);
                   graph[curr.val].set(i,t);
                    pq.add(t);
                }

            }
        }
        if(succ[end_node]==Double.MAX_VALUE){
            return 0;
        }
        return Math.exp(-succ[end_node]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}