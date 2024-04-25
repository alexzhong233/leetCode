
package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;

import java.util.PriorityQueue;
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
        if (lists.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
//        for (ListNode list : lists) {
//            if (list!=null){
//
//            }
//        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length, (a, b) -> (a.val - b.val)
        );

        for (ListNode list : lists) {
            if (list != null) {
                pq.add(list);
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
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
