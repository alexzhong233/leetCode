
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            int[] res = new int[n];
            System.arraycopy(nums, 0, res, 0, n);
            System.arraycopy(res, n - k, nums, 0, k);
            System.arraycopy(res, 0, nums, k, n - k);
            nums = res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}