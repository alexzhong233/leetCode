
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head ==null){
            return head;
        }
        ListNode tmp =head;
       while(tmp!=null&&tmp.next!=null){
       if(tmp.val==tmp.next.val){
           tmp.next=tmp.next.next;
       }else{tmp=tmp.next;}
       }
        return head;
    }
//        ListNode dummy = new ListNode();
//        ListNode res= dummy;
//        ListNode tmp = head ;
//        while(tmp!=null){
//            if (res.val!=tmp.val){
//                res.next = tmp;
//                res=res.next;
//                ListNode a = tmp.next;
//                tmp.next =null;
//                tmp=a ;
//            }else{
//                tmp=tmp.next;
//            }
//        }
//        return dummy.next;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
