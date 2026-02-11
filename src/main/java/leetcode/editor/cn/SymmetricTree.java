
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class SymmetricTree {
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
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


        public boolean isSymmetric(TreeNode root) {

            return dfs(root.left, root.right);
        }

        boolean dfs(TreeNode left, TreeNode right) {
            if ((left == null && right != null) || (left != null && right == null)) {
                return false;
            }
            if (left == null && right == null) {
                return true;
            }
            return left.val==right.val&&
                dfs(left.left, right.right)&&
                dfs(left.right, right.left);


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}