
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class HappyStudents {
    public static void main(String[] args) {
        Solution solution = new HappyStudents().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countWays(List<Integer> nums) {
            Collections.sort(nums
            );
            int res = 0;
            for (int i = 0; i <= nums.size(); i++) {
                if (i > 0 && nums.get(i - 1) >= i) {
                    continue;
                }

                if (i < nums.size() && nums.get(i) <= i) {
                    continue;
                }
                res++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}