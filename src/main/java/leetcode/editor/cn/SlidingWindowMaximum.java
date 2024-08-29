
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] res = new int[nums.length-k+1];
            for (int i = 0; i < nums.length - k + 1; i++) {
                PriorityQueue<Integer> integers = new PriorityQueue<>((a, b) -> (b - a));
                for (int i1 = i; i1 < i + k; i1++) {
                    integers.add(nums[i1]);
                }
                res[i]=integers.peek();
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}