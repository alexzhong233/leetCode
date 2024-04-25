
package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
//快慢链表
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&slow!=null&&fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
