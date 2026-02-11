
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class DesignCircularDeque {

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyCircularDeque {
        ArrayList<Integer> ls;
        int borad;
        int count = 0;

        public MyCircularDeque(int k) {
            ls = new ArrayList<>();
            borad = k;
            count = 0;

        }

        public boolean insertFront(int value) {
            if (count < borad) {
                ls.add(0, value);
                count++;
                return true;
            }
            return false;
        }

        public boolean insertLast(int value) {
            if (count < borad) {
                ls.add(value);
                count++;
                return true;
            }
            return false;
        }

        public boolean deleteFront() {
            if (!ls.isEmpty()) {
                ls.remove(0);
                count--;
                return true;
            }
            return false;
        }

        public boolean deleteLast() {
            if (!ls.isEmpty()) {
                ls.remove(ls.size() - 1);
                count--;
                return true;
            }
            return false;
        }

        public int getFront() {
            if (!ls.isEmpty()) {
                return ls.get(0);
            }
            return -1;
        }

        public int getRear() {
            if (!ls.isEmpty()) {
                return ls.get(ls.size()-1);
            }
            return -1;
        }

        public boolean isEmpty() {
return ls.isEmpty();
        }

        public boolean isFull() {
return count==borad;
        }
    }

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
//leetcode submit region end(Prohibit modification and deletion)

}