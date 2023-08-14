//给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。 
//
// 求在该柱状图中，能够勾勒出来的矩形的最大面积。 
//
// 
//
// 示例 1: 
//
// 
//
// 
//输入：heights = [2,1,5,6,2,3]
//输出：10
//解释：最大的矩形为图中红色区域，面积为 10
// 
//
// 示例 2： 
//
// 
//
// 
//输入： heights = [2,4]
//输出： 4 
//
// 
//
// 提示： 
//
// 
// 1 <= heights.length <=10⁵ 
// 0 <= heights[i] <= 10⁴ 
// 
//
// Related Topics 栈 数组 单调栈 👍 2508 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestRectangleArea(int[] heights) {
//柱状图中最大的矩形
        //单调栈
        Stack<Integer> stack = new Stack<>();
        int[] newHeights = new int[heights.length+2];
        System.arraycopy(heights,0,newHeights,1,heights.length);
        int area = 0;
        for(int i=0;i<newHeights.length;i++){
            while (!stack.isEmpty()&&newHeights[stack.peek()]>newHeights[i]){
                int cur = stack.pop();
                int left = stack.peek();
                int right = i;
                area = Math.max(area,(right-left-1)*newHeights[cur]);
            }
            stack.push(i);
        }
        return area;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
