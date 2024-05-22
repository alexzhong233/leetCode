//给定两个整数数组，preorder 和 postorder ，其中 preorder 是一个具有 无重复 值的二叉树的前序遍历，postorder 是同一棵
//树的后序遍历，重构并返回二叉树。 
//
// 如果存在多个答案，您可以返回其中 任何 一个。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
//输出：[1,2,3,4,5,6,7]
// 
//
// 示例 2: 
//
// 
//输入: preorder = [1], postorder = [1]
//输出: [1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= preorder.length <= 30 
// 1 <= preorder[i] <= preorder.length 
// preorder 中所有值都 不同 
// postorder.length == preorder.length 
// 1 <= postorder[i] <= postorder.length 
// postorder 中所有值都 不同 
// 保证 preorder 和 postorder 是同一棵二叉树的前序遍历和后序遍历 
// 
//
// Related Topics树 | 数组 | 哈希表 | 分治 | 二叉树 
//
// 👍 385, 👎 0 
//
//
//
//


package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.HashMap;

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
    HashMap<Integer,Integer> k2v = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            k2v.put(postorder[i],i);
        }
        return build(preorder,0,preorder.length-1,
                postorder,0,postorder.length-1);
    }
    TreeNode  build(int[] preorder,int prebegin,int preend,
                    int[] postorder,int postbegin,int postend) {
        if (prebegin>preend){
            return null;
        }
        if (prebegin==preend){
            return new TreeNode(preorder[prebegin]);
        }
        int rootVal = preorder[prebegin];
        int leftrootval =preorder[prebegin+1];
        int index = k2v.get(leftrootval);
        TreeNode treeNode = new TreeNode(rootVal);
        int leftsize = index-postbegin+1;
        treeNode.left =build(preorder,prebegin+1 ,prebegin+leftsize ,
                postorder, postbegin, index);
        treeNode.right =build(preorder,prebegin+leftsize+1 ,preend ,
                postorder, index+1, postend-1);
        return treeNode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

