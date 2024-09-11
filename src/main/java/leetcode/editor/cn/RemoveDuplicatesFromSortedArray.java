
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length==0){
                return 0;
            }
            int i = 1;
            int left = 0, right = 1;
            while (right < nums.length) {
                if (nums[right] != nums[right - 1]) {
                    left++;
                    nums[left] = nums[right];i++;
                }
                right++;
            }
        return i;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}