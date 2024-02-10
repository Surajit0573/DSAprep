class Solution {
    public int numSquares(int n) {
        int m = (int) Math.sqrt(n);
        int[][] dp = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            int curr=(int)Math.pow(m+1,2);
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    dp[i][j] = 0;
                }
                else if (i == 0) {
                    dp[i][j] = j;
                }
                else{
                    if(curr<=j){
                        dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-curr]);
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        return dp[m-1][n];
    }
}