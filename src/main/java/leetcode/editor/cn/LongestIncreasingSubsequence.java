
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Solution solution = new LongestIncreasingSubsequence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            Arrays.fill(dp,1);
            for (int i = 0; i < dp.length; i++) {
                for (int i1 = 0; i1 < i; i1++) {
                    if (nums[i1]<nums[i]){
                        dp[i]=Math.max(dp[i],dp[i1]+1);
                    }
                }
            }
            int res= 0;
            for (int i = 0; i < dp.length; i++) {
                res= Math.max(dp[i],res);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}