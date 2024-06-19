import javax.swing.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        if (length == 1) return nums[0];
//        n+1解法
//        return np1s(nums, length);
        //        n解法
        return ns(nums, length);
    }

    private int ns(int[] nums, int length) {
        int[] dp = new int[length];
//        第一家 为dp【0】
        dp[0] =nums[0];
//        偷第一家 或者第二家
        dp[1]=Math.max(nums[0],nums[1]);
//        第n家是dpn-1
        for (int i = 2; i < length; i++) {
//                        要这家 上家不偷 -2    不要这家 等于上家投的金额
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[length-1];
    }

    private int np1s(int[] nums, int length) {
        int[] value = new int[length + 1];
        value[0] = 0;
        value[1] = nums[0];
        for (int i = 2; i < length + 1; i++) {
//                              之前一家 这个不偷      之前两家的  这家
             value[i]= Math.max(value[i-1],value[i-2]+nums[i-1]);
        }
        return value[length];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
