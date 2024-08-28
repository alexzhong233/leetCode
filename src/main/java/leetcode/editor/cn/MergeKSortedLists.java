package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class MergeKSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeKSortedLists().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            ListNode dm = new ListNode(0);
            ListNode tmp = dm;
            PriorityQueue<ListNode> pq =
                    new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
            for (ListNode l : lists) {
                if (l != null) {
                    pq.add(l);
                }
            }
            while (!pq.isEmpty()) {
                ListNode node = pq.poll();
                tmp.next = node;
                if (node.next != null) {
                    pq.add(node.next);
                }
                tmp = tmp.next;
            }
            return dm.next;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}