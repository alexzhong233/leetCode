
  package leetcode.editor.cn;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class YaVDxD{
      public static void main(String[] args) {
           Solution solution = new YaVDxD().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        int bagSize = sum+target>>1;
        if (bagSize<0){
            bagSize=-bagSize;
        }
        if ((target+sum)%2==1){
            return 0;
        }
        int[] dp = new int[bagSize+1];
        dp[0]=1;
        for (int i =1; i <= nums.length; i++) {
            int num = nums[i-1];
            for (int j = bagSize; j >= 0; j--) {
                if (j - num >= 0) {
                    dp[j] += dp[j - num];
                }
            }
        }
        return dp[bagSize];
    }

}
//leetcode submit region end(Prohibit modification and deletion)

  }