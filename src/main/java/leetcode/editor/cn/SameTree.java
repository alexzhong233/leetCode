
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class SameTree {
    public static void main(String[] args) {
        Solution solution = new SameTree().new Solution();
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
        static boolean is = true;

        public boolean isSameTree(TreeNode p, TreeNode q) {
            is = true;
            dfs(p, q);
            return is;
        }

        void dfs(TreeNode p, TreeNode q) {
            if (p == null && q != null) {
                is = false;
            }
            if (p != null && q == null) {
                is = false;
            }
            if (p != null && q != null) {
                if (p.val != q.val) {
                    is = false;
                }
                if (!is){
                    return;
                }
                dfs(p.left,q.left);
                dfs(p.right,q.right);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}