
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class XagZNi {
    public static void main(String[] args) {
        Solution solution = new XagZNi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> st = new Stack<>();
            for (int asteroid : asteroids) {
                boolean needAdd = true;
                while (!st.empty()) {
                    if (st.peek() < 0) {
                        break;
                    }
                    if (st.peek() + asteroid == 0) {
                        needAdd = false;
                        st.pop();
                        break;
                    }
                    if (st.peek() > 0 && asteroid > 0) {
                        break;
                    } else {
                        if (Math.abs(st.peek()) > Math.abs(asteroid)) {
                            needAdd = false;
                            break;
                        } else {
                            st.pop();
                        }
                    }
                }
                if (needAdd) {
                    st.add(asteroid);
                }
            }
            int[] ints = new int[st.size()];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = st.get(i);
            }
            return ints;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}