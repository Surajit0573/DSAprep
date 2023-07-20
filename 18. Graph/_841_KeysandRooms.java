import java.util.*;
public class  _841_KeysandRooms{

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer>q=new LinkedList<>();
        boolean[] vis=new boolean[n];
        Arrays.fill(vis,false);
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            vis[curr]=true;
            for(int i=0;i<rooms.get(curr).size();i++){
                if(vis[rooms.get(curr).get(i)]==false){
                    q.add(rooms.get(curr).get(i));
                }
            }
        }
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                return false;
            }
        }
        return true;
        }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}