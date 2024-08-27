
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();
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
        public ListNode reverseList(ListNode head) {
            ListNode tmp = new ListNode(0);
            while (head != null) {
//                把head的下一个节点拿出来 不要断掉           1 2 3        3    2      0 1 null
                ListNode back = head.next;
//                先把head的下一个节点刷新成之前连接的节点   23   1 null      2 1 null
                head.next=tmp.next;
//                调换连接的节点和head的位置     2 3      0，1，null         0 2 1 null 3
                tmp.next = head;
//                继续取下一个节点   2 3            3
                head = back;
            }
        return tmp.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}