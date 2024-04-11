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
    public ListNode partition(ListNode head, int x) {
ListNode temp = new ListNode( -1);
ListNode work = temp;
ListNode tmp = new ListNode (-1);
ListNode  work2 =tmp;
while(head!=null){
    if (head.val<x){
        work.next = head;
    work = work.next;
    }else{
        work2.next =head;
        work2 = work2.next;
    }
    ListNode headTmp = head.next;  //给新值赋地址
    head.next = null;           //断掉上一个值的地址
    head = headTmp;            //
}
        work.next = tmp.next;
return  temp.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
