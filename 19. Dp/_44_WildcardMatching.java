import java.util.*;
public class _44_WildcardMatching{

     //Wild Card Mathching ( ? - replace * - as u wish )
public static boolean isMatch(String str,String ptr){
    int n=str.length();
    int m=ptr.length();
    boolean[][]dp=new boolean[m+1][n+1];
    //Intialization
    dp[0][0]=true;
    for(int i=1;i<m+1;i++){
        if(ptr.charAt(i-1)=='*'&&dp[i-1][0]){
            dp[i][0]=true;
        }else{
            dp[i][0]=false;
        }
    }
    for(int i=1;i<m+1;i++){
        for(int j=1;j<n+1;j++){
               if(ptr.charAt(i-1)=='?'||str.charAt(j-1)==ptr.charAt(i-1)){
                dp[i][j]=dp[i-1][j-1];
               }
               else if(ptr.charAt(i-1)=='*'){
                dp[i][j]=dp[i][j-1]||dp[i-1][j];
              }
              else{
                  dp[i][j]=false;
              }
        }
    }
    return dp[m][n];

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}