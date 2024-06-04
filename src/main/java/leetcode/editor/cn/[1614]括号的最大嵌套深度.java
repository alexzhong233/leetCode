//给定 有效括号字符串 s，返回 s 的 嵌套深度。嵌套深度是嵌套括号的 最大 数量。 
//
// 
//
// 示例 1： 
//
// 
// 输入：s = "(1+(2*3)+((8)/4))+1" 
// 
//
// 输出：3 
//
// 解释：数字 8 在嵌套的 3 层括号中。 
//
// 示例 2： 
//
// 
// 输入：s = "(1)+((2))+(((3)))" 
// 
//
// 输出：3 
//
// 解释：数字 3 在嵌套的 3 层括号中。 
//
// 示例 3： 
//
// 
// 输入：s = "()(())((()()))" 
// 
//
// 输出：3 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 由数字 0-9 和字符 '+'、'-'、'*'、'/'、'('、')' 组成 
// 题目数据保证括号字符串 s 是 有效的括号字符串 
// 
//
// Related Topics栈 | 字符串 
//
// 👍 143, 👎 0 
//
//
//
//


package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxDepth(String s) {
        int ans =0;
        int deepth = 0;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c=='('){
                deepth++;
            }else{
                if (c==')'){
                    ans = Math.max(deepth,ans);
                    deepth--;
                }
            }

        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

