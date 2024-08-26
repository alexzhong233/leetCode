import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;


        int[] dp = new int[length];
        Arrays.fill(dp,1);

        int maxlen =1;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]&&dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }
            }
            maxlen= Math.max(dp[i],maxlen);
        }
        return maxlen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
