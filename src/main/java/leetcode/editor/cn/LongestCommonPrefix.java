
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs, Comparator.comparingInt(String::length));
            for (int i = strs[0].length(); i > 0; i--) {
                String substring = strs[0].substring(0, i);
                boolean bo = false;
                for (String str : strs) {
                    if (str.startsWith(substring)) {
                        bo = true;
                    } else {
                        bo = false;
                        break;
                    }
                }
                if (bo) {
                    return substring;
                }
            }
            return "";
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}