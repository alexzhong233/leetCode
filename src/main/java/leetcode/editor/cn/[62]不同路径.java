
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0]=1;
        for (int i =1; i < m; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i < n; i++) {
            dp[0][i]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int i1 = 1; i1 < n; i1++) {
                dp[i][i1]=dp[i-1][i1]+dp[i][i1-1];
            }
        }
        return dp[m-1][n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
