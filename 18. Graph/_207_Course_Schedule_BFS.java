import java.util.*;

public class _207_Course_Schedule_BFS {

    public boolean canFinish(int n, int[][] p) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[n];
      int[] inorder=new int[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < p.length; i++) {
            graph[p[i][1]].add(p[i][0]);
            inorder[p[i][0]]++;
        }
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inorder[i]==0){
                que.add(i);
            }
        }
        int len=0;
        while(!que.isEmpty()){
            int curr=que.remove();
            len++;
            for(int i=0;i<graph[curr].size();i++){
                int t=graph[curr].get(i);
                inorder[t]--;
                if(inorder[t]==0){
                    que.add(t);
                }
            }
        }
        if(len<n){
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}