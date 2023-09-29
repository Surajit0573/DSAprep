import java.util.*;

public class _452_MinimumNumberofArrowstoBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingDouble(o->o[0]));
        int count=1;
        int end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=end){
                end=Math.min(end,points[i][1]);
                }else{
                count++;
                end=points[i][1];
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}