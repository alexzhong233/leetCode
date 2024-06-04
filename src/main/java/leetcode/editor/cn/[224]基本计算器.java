package leetcode.editor.cn;

import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        char[] charArray = s.toCharArray();
        int res = 0;
        int sign = 1;
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (Character.isDigit(c)) {
                int num = c - '0';
//                统计出当前的数字
                while (i + 1 < length && Character.isDigit(charArray[i + 1])) {
                    i++;
                    num = num * 10 + charArray[i] - '0';
                }
                res += sign * num;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.add(res);
                res = 0;
                stack.add(sign);
                sign = 1;
            } else if (c == ')') {
                int form = stack.pop();
                Integer value = stack.pop();
//                现在算的result是括号内的内容
                res = form * res+value;
            }
        }
        return res;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
