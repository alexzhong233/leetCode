
package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        st.add(val);
        if (min.empty() || min.peek() >= val) {
            min.add(val);
        }
    }

    public void pop() {
        if (!st.empty()) {
            Integer pop = st.pop();
            if (!min.empty() && Objects.equals(min.peek(), pop)) {
                min.pop();
            }
        }
    }

    public int top() {
if (!st.empty()){
    return st.peek();
}
return 0;
    }

    public int getMin() {
if (!min.empty()){
    return min.peek();
}
return 0;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

