package leetcode.editor.cn;


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
//dp table
class Solution {
    //    int times1=0;
//    记录算过的数据
    int[] memo;

    public int fib(int n) {
//        翻译答案做法
//        return myFib1(n);
//        记忆化搜索
        memo = new int[n + 1];
//        return  myFib2(n);
//        dp 从下而上解决问题
        return myFib3(n);
    }

    //记忆化搜索
    private int myFib2(int n) {
//        times1++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo[n] == 0) {
//            有子调用
            memo[n] = myFib2(n - 1) + myFib2(n - 2);
        }
        return memo[n];
    }

    //单纯翻译答案
    private int myFib1(int n) {
//        times1++;
        if (n == 0) return 0;
        if (n == 1) return 1;
//        有子调用
        return myFib1(n - 1) + myFib1(n - 2);
    }

    //dp 从下而上
    private int myFib3(int n) {
//        times1++;
        if (n == 0) return 0;
        if (n == 1) return 1;
//        初始化dp数组
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
//        直接返回 没有子调用
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
//leetcode submit region end(Prohibit modification and deletion)
