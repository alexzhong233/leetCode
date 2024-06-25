import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        int[] count = new int[length];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int maxlen = 1;
        for (int i = 1; i < length; i++) {
            for (int i1 = 0; i1 < i; i1++) {
//                如果大于 则len+1 次数=小的
                if (nums[i] > nums[i1] && dp[i] < dp[i1] + 1) {
                    dp[i] = dp[i1] + 1;
                    count[i] = count[i1];
                } else if (nums[i] > nums[i1] && dp[i] == dp[i1] + 1) {
//                    如果长度== 则次数+=统计的同级次数
                    count[i] += count[i1];
                }
            }
//            存储最大长度
            maxlen = Math.max(maxlen, dp[i]);
        }
        int res = 0;

        for (int i = 0; i < length; i++) {
            if (dp[i] == maxlen) {
                res += count[i];
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
