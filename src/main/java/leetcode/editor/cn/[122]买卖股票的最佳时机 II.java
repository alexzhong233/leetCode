
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
//        贪心
//        int sum =0;
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i]>prices[i-1]){
//                sum+=prices[i]-prices[i-1];
//            }
//        }
//        return sum;
//    }

//dp
        int length = prices.length;
       int[][] dp = new int[length][2];
        dp[0][1] = -prices[0];
        for (int i = 1; i < length; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[length - 1][0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
