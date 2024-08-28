
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
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
//给两个边界值，使左节点不能小于他 右节点不能大于他 当遍历左节点的时候，右节点更新 遍历右节点的时候，左更新

        public boolean isValidBST(TreeNode root) {
            return     dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean dfs(TreeNode root, long left, long right) {
            if (root != null) {
                if (root.val<=left||root.val>=right){
                  return false;
                }
             return  dfs(root.left,left, root.val)&&dfs(root.right, root.val, right);
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}