import java.util.*;
public class _646_MaximumLengthofPairChain
{
 

      public static int findLongestChain(int[][] pairs) {
        int n=pairs.length;
       Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
      //  for(int i=0;i<n;i++){
      //   System.out.println(pairs[i][0]+" "+pairs[i][1]);
      //  }
      int curr=pairs[0][1];
      int count=1;
      for(int i=1;i<n;i++){
        if(pairs[i][0]>curr){
          count++;
          curr=pairs[i][1];
        }
      }
        return count;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[][]pairs={{1,2},{1,5},{7,8},{4,8},{4,5}};
findLongestChain(pairs);
sc.close();
}
}