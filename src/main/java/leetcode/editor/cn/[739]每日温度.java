//给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现
//在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。 
//
// 
//
// 示例 1: 
//
// 
//输入: temperatures = [73,74,75,71,69,72,76,73]
//输出: [1,1,4,2,1,1,0,0]
// 
//
// 示例 2: 
//
// 
//输入: temperatures = [30,40,50,60]
//输出: [1,1,1,0]
// 
//
// 示例 3: 
//
// 
//输入: temperatures = [30,60,90]
//输出: [1,1,0] 
//
// 
//
// 提示： 
//
// 
// 1 <= temperatures.length <= 10⁵ 
// 30 <= temperatures[i] <= 100 
// 
//
// Related Topics栈 | 数组 | 单调栈 
//
// 👍 1757, 👎 0 
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
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> integers = new Stack<Integer>();
        for (int i = n - 1; i >= 0; i--) {
//            把放元素改成了放索引 push nums i->push i   get i->get stack
           while(!integers.isEmpty() && temperatures[integers.peek()] <= temperatures[i]) {
                integers.pop();
            }
            res[i]=integers.isEmpty()?0:integers.peek()-i;
            integers.push(i);

        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

