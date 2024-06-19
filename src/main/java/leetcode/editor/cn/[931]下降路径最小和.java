
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
//        存放上下多一行结果 左右多个0和最大值 防止-1 +1越界
        int[][] dp = new int[m + 1][n + 2];
        for (int i = 1; i < m+1; i++) {
            dp[i][0] =Integer.MAX_VALUE;
            dp[i][n + 1] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n+1; j++) {

                dp[i][j]=matrix[i-1][j-1]+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i-1][j+1]));
            }
        }

        int ans =Integer.MAX_VALUE;
        for (int i = 1; i < n + 1; i++) {
            ans=Math.min(dp[m][i],ans);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
