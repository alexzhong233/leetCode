
package leetcode.editor.cn;


import java.util.Objects;

public class SevenWqeDu {
    public static void main(String[] args) {
        Solution solution = new SevenWqeDu().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    long n=(long)nums[i] - (long)nums[j];
                    if (Math.abs(i - j) <= k && Math.abs( n)<= t) {
                        return true;

                    }
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}