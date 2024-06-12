
package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
//就是把所有不是0的都移到前面
        int length = nums.length;
        int slow = 0;
        int fast = 0;
        while (fast < length) {

            if (nums[fast] != 0 ) {

               nums[slow]=nums[fast];
               slow++;
            }
            fast++;

        }

        for (int i = slow; i < length; i++) {
            nums[i]=0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
