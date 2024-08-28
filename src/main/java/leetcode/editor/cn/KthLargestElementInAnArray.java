
package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution solution = new KthLargestElementInAnArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
            for (int num : nums) {
                pq.add(num);
            }
            for (int i = 1; i < k; i++) {
                System.out.println( pq.remove());
            }
            return pq.peek();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}