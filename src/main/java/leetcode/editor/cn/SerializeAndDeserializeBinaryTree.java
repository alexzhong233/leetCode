
package leetcode.editor.cn;

import java.time.OffsetDateTime;
import java.util.*;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class SerializeAndDeserializeBinaryTree {

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
    public class Codec {
        String sp = ",";
        String no = "*";

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            siz(root, sb);
            return sb.toString();
        }

        void siz(TreeNode root, StringBuilder sb) {
            if (root==null){
                sb.append(no).append(sp);
                return;
            }
            sb.append(root.val).append(sp);
            siz(root.left,sb);
            siz(root.right,sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            LinkedList<String> nodes = new LinkedList<>();
            Collections.addAll(nodes, data.split(sp));
            return dsz(nodes);
        }
        TreeNode dsz( LinkedList<String> nodes ) {
            if (nodes.isEmpty()){
                return null;
            }
            String first = nodes.removeFirst();
            if (no.equals(first)){
                return null;
            }
            TreeNode node = new TreeNode(Integer.parseInt(first));
            node.left=dsz(nodes);
            node.right=dsz(nodes);
            return node;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}