
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        Solution solution = new LowestCommonAncestorOfABinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         看当前值是不是p或者q 是得话直接返回root 是父节点
            if (root == null || root.val == p.val || root.val == q.val) {
                return root;
            }
//            左边放进去
            TreeNode left = lowestCommonAncestor(root.left, p, q);
//     右边放进去
            TreeNode right = lowestCommonAncestor(root.right, p, q);
//          左边null就是右边
            if (left == null) {
                return right;
            }
//            右边nll就是左边
            if (right == null) {
                return left;
            }
//          都不是null 那就是本身
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}