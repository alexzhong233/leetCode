
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new SpiralMatrix().new Solution();
        List<Integer> integers = solution.spiralOrder(new int[][]{{3}, {2}});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> integers = new ArrayList<>();

            int l = 0;
            int m = matrix.length;
            int n = matrix[0].length;
            int count =0;
            int target = m*n;
            do {
                for (int i = l; i < n - l; i++) {
                    if (target == count) {
                        break;
                    }
                    count++;
                    integers.add(matrix[l][i]);
                }
                for (int i = l + 1; i < m - l; i++) {
                    if (target == count) {
                        break;
                    }
                    count++;
                    integers.add(matrix[i][n - l - 1]);
                }
                for (int i = n - l - 2; i >= l; i--) {
                    if (target == count) {
                        break;
                    }
                    count++;
                    integers.add(matrix[m - l - 1][i]);
                }
                for (int i = m - l - 2; i >= l + 1; i--) {
                    if (target == count) {
                        break;
                    }
                    count++;
                    integers.add(matrix[i][l]);
                }
                l++;
            } while (target != count);
         return integers;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}