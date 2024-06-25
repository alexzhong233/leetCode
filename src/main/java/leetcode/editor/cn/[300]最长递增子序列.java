import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLIS(int[] nums) {


        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        int maxlen =1;

        for (int i = 1; i < nums.length; i++) {
//            从0到i-1 选出比i小的数+1
            for (int j = 0; j < i; j++) {
//                i比j的长度小 但是i比j大 i就比j多一位
                if (nums[i]>nums[j]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
//            查看是最长
            if (maxlen<dp[i]){
                maxlen=dp[i];
            }

        }
        return maxlen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
