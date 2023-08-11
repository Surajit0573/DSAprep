import java.util.*;
public class _72_Edit_Distance{

     //Edit Distance - Tabulization
public static int minDistance(String str1,String str2){
    int n=str1.length();
    int m=str2.length();
    int[][]dp=new int[n+1][m+1];

    for(int i=0;i<n+1;i++){
        for(int j=0;j<m+1;j++){
            if(i==0){
                dp[i][j]=j;
            }
            else if(j==0){
                dp[i][j]=i;
            }
              else if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1];
               }else{
                 int del=1+dp[i-1][j];//Delete
                 int add=1+dp[i][j-1];//addition
                 int rep=1+dp[i-1][j-1];//replace
                 dp[i][j]=Math.min(del,Math.min(add,rep));
               }
        }
    }
    return dp[n][m];

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}