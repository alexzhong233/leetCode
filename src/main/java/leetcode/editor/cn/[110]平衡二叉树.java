//给定一个二叉树，判断它是否是 平衡二叉树 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：root = [1,2,2,3,3,null,null,4,4]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数在范围 [0, 5000] 内 
// -10⁴ <= Node.val <= 10⁴ 
// 
//
// Related Topics树 | 深度优先搜索 | 二叉树 
//
// 👍 1510, 👎 0 
//
//
//
//

package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.time.OffsetDateTime;
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
class Solution {
   boolean balance =true;
    public boolean isBalanced(TreeNode root) {
  postOrd(root);
   return balance;
    }

    private int postOrd(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftHeight = postOrd(root.left);
        int rightHeight =0;
        if (balance){
            rightHeight= postOrd(root.right);
        }
        if (balance&&Math.abs(leftHeight-rightHeight)>1){
            balance=false;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
