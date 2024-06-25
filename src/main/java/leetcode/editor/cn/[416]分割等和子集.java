import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {

        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) {
            return false;
        }

        int length = nums.length;

        int target = sum / 2;
//        前i个元素能否组成j
        boolean[][] dp = new boolean[length][target + 1];



        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }


        for (int i = 1; i < length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }
                if (nums[i]<j){
                    dp[i][j] =dp[i-1][j]||dp[i-1][j-nums[i]];
                }
            }
        }
return dp[length-1][target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
