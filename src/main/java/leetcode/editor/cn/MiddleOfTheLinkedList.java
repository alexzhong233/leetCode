
  package leetcode.editor.cn;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class MiddleOfTheLinkedList{
      public static void main(String[] args) {
           Solution solution = new MiddleOfTheLinkedList().new Solution();
      }
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
ListNode slow = head;
ListNode fast = head;
while (fast!=null&&fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}
return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }