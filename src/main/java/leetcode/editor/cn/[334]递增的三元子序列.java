import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp,1);
        int maxlen =1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }

            // 在更新 dp[i] 的过程中，发现了一个更长的子序列
            if(maxlen < dp[i]){
                // 那么把更长的子序列的长度赋值给 maxLength
                maxlen = dp[i];
            }

            if (maxlen>=3){
                return true;
            }
        }
    return false;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
