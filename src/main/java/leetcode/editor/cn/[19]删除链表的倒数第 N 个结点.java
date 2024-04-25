
package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listnode = new ListNode(-1);
        listnode.next=head;
        ListNode end = findEnd(listnode, n+1);
        end.next =end.next.next;
        return listnode.next;
    }

  ListNode  findEnd(ListNode head, int n){
      ListNode ls= head;
      for (int i = 0; i < n; i++) {
          ls = ls.next;
      }
      ListNode l2 =head;
      while (ls!=null) {
          ls = ls.next;
          l2 = l2.next;
      }
      return l2;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
