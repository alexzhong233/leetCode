package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int coinChange(int[] coins, int amount) {
        int length = coins.length;
        int[][] dp = new int[length + 1][amount + 1];
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = amount + 1;
            }
        }
        dp[0][0] = 0;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (j < coins[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]]);
                }
            }
        }
        return dp[length][amount] == amount + 1 ? -1 : dp[length][amount];
    }


}
//leetcode submit region end(Prohibit modification and deletion)
