//给定一个经过编码的字符串，返回它解码后的字符串。 
//
// 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。 
//
// 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。 
//
// 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "3[a]2[bc]"
//输出："aaabcbc"
// 
//
// 示例 2： 
//
// 
//输入：s = "3[a2[c]]"
//输出："accaccacc"
// 
//
// 示例 3： 
//
// 
//输入：s = "2[abc]3[cd]ef"
//输出："abcabccdcdcdef"
// 
//
// 示例 4： 
//
// 
//输入：s = "abc3[cd]xyz"
//输出："abccdcdcdxyz"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 30 
// 
// s 由小写英文字母、数字和方括号
// '[]' 组成 
// s 保证是一个 有效 的输入。 
// s 中所有整数的取值范围为
// [1, 300] 
// 
//
// Related Topics栈 | 递归 | 字符串 
//
// 👍 1764, 👎 0 
//
//
//
//


package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String decodeString(String s) {
        char[] charArray = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        Stack<String> cs = new Stack<>();
        StringBuilder str= new StringBuilder();
        int ints =0;
        for (char c : charArray) {
            if (c>='a'&&c<='z'){
                str.append(c);
            } else if (Character.isDigit(c)) {
                int num = c - '0';
                if (ints==0){
                    ints+=num;
                }else {
                    ints=10*ints+num;
                }

            }else if (c=='['){
                cs.add(str.toString());
                stack.add(ints);
                str=new StringBuilder();
                ints=0;
            }else if (c == ']') {
                int count = stack.pop();
//                cs.pop是上段字符，str.repeat重复本段字符多少次  格式是  cs.pop "" stack.pop 3 str a
                str = new StringBuilder(cs.pop() + str.toString().repeat(Math.max(0, count))
                );
            }
        }
        return str.toString();
    }
    }

//leetcode submit region end(Prohibit modification and deletion)

