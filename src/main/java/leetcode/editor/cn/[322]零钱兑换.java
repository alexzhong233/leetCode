package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[] mem;
    public int coinChange(int[] coins, int amount) {
//         mem = new int[amount+1];
//        Arrays.fill(mem,-1);
//return  dp(coins,amount);
        int[] dp =new int[amount +1];
        Arrays.fill(dp ,amount+1);
        dp[0]=0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i-coin<0){
                    continue;
                }
                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return (dp[amount] ==amount+1)?-1:dp[amount];
}
int dp(int[] coins, int amount){
        if (amount<0){
            return-1;
        }
        if(amount==00){
            return 0;

        }
        if(mem[amount]!=-1){
            return mem[amount];
        }
        int res = Integer.MAX_VALUE;
    for (int coin : coins) {
        int sub = dp(coins,amount-coin);
        if (sub==-1){continue;}
        res= Math.min(res,sub+1);
    }
    return res==Integer.MAX_VALUE?-1:res;
}
}
//leetcode submit region end(Prohibit modification and deletion)
