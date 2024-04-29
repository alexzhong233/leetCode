
package leetcode.editor.cn;

import leetcode.editor.cn.template.TreeNode;
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//最长路径
class Solution {
    int max =0;
    public int amountOfTime(TreeNode root, int start) {
dfs(root,start);
return max;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
