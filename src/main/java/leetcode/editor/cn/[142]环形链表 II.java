
package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
            if (slow == fast){
        break;
            }

        }
if(fast==null||fast.next==null)
        return null;


//刚好多了一圈
slow =head;
while (slow!=fast){
    fast=fast.next;
    slow=slow.next;
}
return slow;
    }
    }

//leetcode submit region end(Prohibit modification and deletion)
