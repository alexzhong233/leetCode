
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {
int m = grid.length;
int n = grid[0].length;
int[][] dp = new int[m][n];
dp[0][0]= grid[0][0];
//计算大小数值
        for (int i = 1; i < n; i++) {
//            计算这个格子的大小
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
//                从左边还是从上面 取小的
//                加上当前的  等于最小的
                dp[i][j]= Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
