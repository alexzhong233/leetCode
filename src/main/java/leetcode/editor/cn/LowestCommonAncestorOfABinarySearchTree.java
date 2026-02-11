
  package leetcode.editor.cn;
  import java.awt.image.renderable.RenderableImage;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class LowestCommonAncestorOfABinarySearchTree{
      public static void main(String[] args) {
           Solution solution = new LowestCommonAncestorOfABinarySearchTree().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root.val==p.val||root.val==q.val){
            return root;
        }
//        如果root比两个节点都小 去拿root得右节点比较
        if (root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        //        如果root比两个节点都大 去拿root得左节点比较
        if (root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }