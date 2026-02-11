
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class HouseRobberIii {
    public static void main(String[] args) {
        Solution solution = new HouseRobberIii().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int rob(TreeNode root) {
            int[] res = dfs(root);
            return Math.max(res[0], res[1]);
        }

        private int[] dfs(TreeNode root) {
        if (root==null){
            return new int[]{0,0};
        }
//        0是不偷 1 是偷
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int[] dp = new int[2];
//        如果选择不偷当前节点 则两个子节点都能头 选择最大值
        dp[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
//     偷当前节点 则不能选择偷子节点
        dp[1]=root.val+left[0]+right[0];
        return dp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}