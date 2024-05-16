//请根据每日 气温 列表 temperatures ，重新生成一个列表，要求其对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不
//会升高，请在该位置用 0 来代替。 
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
// 
//
// 
// 注意：本题与主站 739 题相同： https://leetcode-cn.com/problems/daily-temperatures/ 
//
// Related Topics栈 | 数组 | 单调栈 
//
// 👍 103, 👎 0 
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
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
//             倒序放的原因是最后一位肯定没有比他更大的，前面的可以从栈中找最大的
            while (!stack.isEmpty()&& temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            res[i]=stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

