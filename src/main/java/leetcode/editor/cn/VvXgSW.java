
  package leetcode.editor.cn;
  import java.util.*;

  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class VvXgSW{
      public static void main(String[] args) {
           Solution solution = new VvXgSW().new Solution();
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> ls = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode list : lists) {
            while (list!=null){
                ls.add(list);
                list=list.next;
            }
        }
        ListNode tmp = new ListNode(-1);
        ListNode node = tmp;
  while (!ls.isEmpty()){
            node.next=ls.poll();
            node=node.next;
        }
  node.next=null;
        return  tmp.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }