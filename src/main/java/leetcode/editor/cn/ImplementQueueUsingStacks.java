
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class ImplementQueueUsingStacks {

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyQueue {
        static Stack<Integer> reverse = new Stack<>();
        static Stack<Integer> head = new Stack<>();

        public MyQueue() {
            reverse = new Stack<>();
            head = new Stack<>();
        }

        public void push(int x) {
            reverse.add(x);

        }

        public int pop() {
            while (!reverse.empty()) {
                head.add(reverse.pop());
            }
            int ret = head.pop();
            while (!head.empty()) {
                reverse.add(head.pop());
            }
            return ret;
        }

        public int peek() {
            while (!reverse.empty()) {
                head.add(reverse.pop());
            }
            int ret = head.peek();
            while (!head.empty()) {
                reverse.add(head.pop());
            }
            return ret;
        }

        public boolean empty() {
return reverse.empty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}