
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class RemovingStarsFromAString {
    public static void main(String[] args) {
        Solution solution = new RemovingStarsFromAString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeStars(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '*' && !st.isEmpty()) {
                    st.pop();
                } else {
                    st.add(s.charAt(i));
                }
            }
            StringBuilder stringBuilder = new StringBuilder();

            for (Character character : st) {
                stringBuilder.append(character);
            }
            return stringBuilder.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}