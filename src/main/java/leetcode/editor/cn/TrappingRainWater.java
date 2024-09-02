
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new TrappingRainWater().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] height) {
            int ans =0;
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty()&&height[st.peek()]<height[i]){
                int bottom = height[st.pop()];
                if (!st.isEmpty()){
                    int h = Math.min(height[i],height[st.peek()])-bottom;
                    ans+=h*(i-st.peek()-1);
                }
            }
                st.add(i);
            }
            return  ans ;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}