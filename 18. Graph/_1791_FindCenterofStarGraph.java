import java.util.*;
public class _1791_FindCenterofStarGraph{

    public static int findCenter(int[][] edges) {
        //shortcut
        return edges[0][1]==edges[1][0]||edges[0][1]==edges[1][1]?edges[0][1]:edges[0][0];
    //     int n=edges.length+1;
    //     int[] f=new int[n];
    //     for(int i=0;i<edges.length;i++){
    //         f[edges[i][0]-1]++;
    //         f[edges[i][1]-1]++;
    //     }
    //     for(int i=0;i<n;i++){
    //         if(f[i]==n-1){
    //             return i+1;
    //         }
    //     }
    //     return -1;
     }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[][] edges={{4,3},{3,2},{1,3}};
System.out.println(findCenter(edges));
sc.close();
}
}