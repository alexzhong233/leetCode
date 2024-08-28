
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeZigzagLevelOrderTraversal().new Solution();
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            boolean needRev = false;
            ArrayList<TreeNode> ls = new ArrayList<>();
            ArrayList<List<Integer>> res = new ArrayList<>();
            ls.add(root);
            while (!ls.isEmpty()) {
                int size = ls.size();
                ArrayList<Integer> integers = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    TreeNode node = ls.remove(0);
                    if (node != null) {
                        if (needRev){
                            integers.add(0,node.val);
                        }else{
                        integers.add(node.val);}
                        ls.add(node.left);
                        ls.add(node.right);
                    }
                }
                if (!integers.isEmpty()) {
                    res.add(integers);
                }

                needRev = !needRev;
            }
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}