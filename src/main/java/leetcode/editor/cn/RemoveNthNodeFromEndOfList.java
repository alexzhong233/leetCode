
package leetcode.editor.cn;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode ls = new ListNode(0);
            ls.next = head;
            ListNode end = findEnd(ls, n+1 );
            end.next = end.next.next;
            return ls.next;
        }

        ListNode findEnd(ListNode head, int n) {
            ListNode ls =   head;
            for (int i = 0; i < n; i++) {
                ls=ls.next;
            }

            ListNode l2 =   head;
            while (ls!=null){
                ls=ls.next;
                l2=l2.next;
            }
            return l2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}