import java.util.logging.Level;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {

        int length = prices.length;

        if (length <= 1) {
            return 0;
        }
        int[][] dp = new int[length][2];
        dp[0][1] = -prices[0];
        dp[1][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
//        昨天没买今天买了
        dp[1][1] = Math.max(dp[0][1], -prices[1]);
        for (int i = 2; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }

        return dp[length - 1][0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
