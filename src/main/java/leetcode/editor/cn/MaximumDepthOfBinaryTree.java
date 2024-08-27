
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
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
        public int maxDepth(TreeNode root) {
            ArrayList<TreeNode> treeNodes = new ArrayList<>();
            if (root != null) {
                treeNodes.add(root);
            }
            int deep = 0;
            while (!treeNodes.isEmpty()) {
                deep++;
                int size = treeNodes.size();
                for (int i = 0; i < size; i++) {

                    TreeNode remove = treeNodes.remove(0);

                    if (remove.left != null) {
                        treeNodes.add(remove.left);
                    }
                    if (remove.right != null) {
                        treeNodes.add(remove.right);
                    }
                }
            }
            return deep;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}