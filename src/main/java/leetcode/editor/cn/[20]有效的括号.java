//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 每个右括号都有一个对应的相同类型的左括号。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
//
// Related Topics 栈 字符串 👍 3926 👎 0


import java.util.HashMap;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //    HashMap<Character, Character> hashMap = new HashMap(){{
// put(')','(');
//     put('}','{');
//    put(']','[');
//    }};
//    public boolean isValid(String s) {
//if (s.length()%2==1){
//    return false;
//}
//        LinkedList<Character> stack = new LinkedList<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            char c= s.charAt(i);
//            if (hashMap.containsKey(c)){
//                if (stack.isEmpty()|| !stack.peek().equals(hashMap.get(c))){
//                    return false;
//                }
//                stack.pop();
//            }else{stack.push(c);}
//        }
//    return stack.isEmpty();}
//}
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;//栈顶指针
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[++top] = ')';
            } else if (c == '[') {
                stack[++top] = ']';
            } else if (c == '{') {
                stack[++top] = '}';
            } else if (top == -1 || stack[top--] != c) {//之前没有对应的左括号或者左右括号不匹配
                return false;
            }
        }
        return top == -1;//判断是否有剩余的左括号没有被匹配
         }}
//leetcode submit region end(Prohibit modification and deletion)
