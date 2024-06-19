
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[] memo;
    public int climbStairs(int n) {
//        return calcWay(n);
        memo = new int[n+1];
//        return calcWay2(n);
        return calcWay3(n);
    }

    private int calcWay2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (memo[n]==0){
            memo[n] = calcWay2( n - 1 ) + calcWay2( n - 2);
        }
        return memo[n];
    }

    private int calcWay(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return calcWay(n - 1) + calcWay(n - 2);
    }

    private int calcWay3(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
       int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i < dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
