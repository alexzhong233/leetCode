
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new MergeIntervals().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] merge(int[][] intervals) {

            Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
            ArrayList<int[]> ls = new ArrayList<>();
            ls.add(intervals[0]);
            for (int i = 1; i < intervals.length; i++) {
                int[] tmp = intervals[i];
                int[] so = ls.get(ls.size() - 1);
                if (so[1] >= tmp[0]) {
                    so[1] = Math.max(tmp[1], so[1]);
                } else {
                    ls.add(tmp);
                }
            }
            int[][] res = new int[ls.size()][2];
            for (int i = 0; i < ls.size(); i++) {
                res[i] = ls.get(i);
            }
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}