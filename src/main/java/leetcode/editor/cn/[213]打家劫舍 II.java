import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        if (length == 1) return nums[0];
        int[] numsExceptFirst = Arrays.copyOfRange(nums, 1, length);
        int[] numsExceptLast = Arrays.copyOfRange(nums, 0, length - 1);
      return Math.max(irob(numsExceptFirst), irob(numsExceptLast));
//        return Math.max(myRob(numsExceptFirst), myRob(numsExceptLast));
    }

    private  static int irob(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
//        第一家 为dp【0】
        dp[0] =nums[0];
//环形  解环后出现只能偷一家的情况
        if (length==1){
            return nums[0];
        }
        //        偷第一家 或者第二家
        dp[1]=Math.max(nums[0],nums[1]);
//        第n家是dpn-1
        for (int i = 2; i < length; i++) {
//                        要这家 上家不偷 -2    不要这家 等于上家投的金额
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[length-1];
    }
    public int myRob(int[] nums) {
        int n = nums.length;
        int[] value = new int[n + 1];
        value[0] = 0;
        value[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            value[i] = Math.max(value[i - 1], value[i - 2] + nums[i - 1]);
        }
        return value[n];

    }
}
//leetcode submit region end(Prohibit modification and deletion)
