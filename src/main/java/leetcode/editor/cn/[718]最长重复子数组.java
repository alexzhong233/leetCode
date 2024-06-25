
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        int maxlen = 0;
        dp[0][0] = 0;
//        没有公共相交的长度
        for (int i = 1; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
//                第几个元素 在+1那
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxlen = Math.max(maxlen, dp[i][j]);
                }
            }
        }
        return maxlen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
