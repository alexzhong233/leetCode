
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int k, int[] prices) {
        int length = prices.length;
//                     第i天   交易了几次  有没有股票
        int[][][] dp = new int[length][k + 1][2];
//小于交易次数+1就行
        for (int i = 1; i < k + 1; i++) {
//            为了填充这个情况不报错
//            没有股票 就是0
            dp[0][i][0] = 0;
//0天结束 k次交易后 拿了个股票 手里剩钱-股票价格
            dp[0][i][1] = -prices[0];
        }

        for (int i = 1; i < length; i++) {
            for (int j = 1; j < k + 1; j++) {
//        今天没股票的情况    第i天j次 等于 昨天没股票 今天也没有 或者 昨天有股票 今天卖了
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
//              今天有股票  第i天j次 等于 昨天有股票  或昨天没 今天买入 操作了一次 所以要拿操作次数-1
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);

            }

        }
//        最后一天 操作了k次后 手里没有股票了
        return  dp[length-1][k][0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
