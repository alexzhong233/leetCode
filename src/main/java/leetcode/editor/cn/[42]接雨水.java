//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
//输出：6
//解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 
// 
//
// 示例 2： 
//
// 
//输入：height = [4,2,0,3,2,5]
//输出：9
// 
//
// 
//
// 提示： 
//
// 
// n == height.length 
// 1 <= n <= 2 * 10⁴ 
// 0 <= height[i] <= 10⁵ 
// 
//
// Related Topics栈 | 数组 | 双指针 | 动态规划 | 单调栈 
//
// 👍 5180, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {

            if (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                //由于栈中有可能存在多个元素，移除栈顶元素之后，剩下的元素和此时的元素也有可能形成凹
                // 因此，我们需要不断的比较此时的元素和栈顶元素
                // 此时的元素依旧大于栈顶元素时，我们去计算此时的凹槽面积
                // 借助 whiLe 循环来实现这个操作
                while (!stack.empty()&&height[i]>height[stack.peek()]){
                    int bottom =stack.pop();
                    //2、如果栈不为空，即栈中有元素，即凹槽的左侧存在
                    if (!stack.isEmpty()){
                        // 凹槽左侧的高度 height[stack.peek(）和 凹槽右侧的高度 height[]
                        // 这两者的最小值减去凹槽底部的高度就是凹槽的高度
                        int h  = Math.min(height[stack.peek()],height[i])-height[bottom];
//                        凹槽长度 
                        int w = i - stack.peek() - 1;
                        System.out.println("凹槽右侧-->" + i);
                        System.out.println("凹槽左侧-->" + stack.peek());
                        System.out.println("凹槽高度--> "+ h);
                        System.out.println("凹槽宽度-->" + w);
                        System.out.println("-----------------");
                        sum+=h*w;
                    }

                }

            }
            stack.add(i);
        }
//        Stack<ArrayList<Integer>> arrayLists = new Stack<>();
//        for (int i = 0; i < height.length; i++) {
//            int iheight = height[i];
//            if (!arrayLists.empty()){
//                ArrayList<Integer> peek = arrayLists.peek();
//                Integer index = peek.get(0);
//                Integer sheight = peek.get(1);
//                if (iheight>sheight){
//                    sum+=(i-index-1)*(iheight-sheight);
//                    arrayLists.pop();
//                }
//            }
//
//            ArrayList<Integer> integers = new ArrayList<>();
//            integers.add(i);
//            integers.add(iheight);
//            arrayLists.add(integers);
//        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

