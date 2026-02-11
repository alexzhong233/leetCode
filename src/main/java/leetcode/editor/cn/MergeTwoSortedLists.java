
  package leetcode.editor.cn;
  import java.util.*;

  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class MergeTwoSortedLists{
      public static void main(String[] args) {
           Solution solution = new MergeTwoSortedLists().new Solution();
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a->a.val));
        while (list1!=null){
            pq.add(list1);
            list1=list1.next;
        }
        while (list2!=null){
            pq.add(list2);
            list2=list2.next;
        }
        ListNode listNode = new ListNode(-1);
        ListNode tmp= listNode;
        while (!pq.isEmpty()){
            tmp.next=pq.poll();
            tmp=tmp.next;
        }
        tmp.next=null;
        return listNode.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }