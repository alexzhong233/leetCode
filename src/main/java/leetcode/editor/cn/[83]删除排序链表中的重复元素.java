
package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;

import javax.imageio.metadata.IIOMetadataFormat;
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode fast = head, slow = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            } else {
                fast = fast.next;
            }

        }
        slow.next = null;
        return dummy.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
