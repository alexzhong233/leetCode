
  package leetcode.editor.cn;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class IntersectionOfTwoLinkedLists{
      public static void main(String[] args) {
           Solution solution = new IntersectionOfTwoLinkedLists().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;

        ListNode p2 = headB;
    while (p1!=p2){
        if (p1!=null){
            p1=p1.next;
        }else {
            p1=headB;
        }
        if (p2!=null){
            p2=p2.next;
        }else{
            p2=headA;
        }

    }
    return p2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }