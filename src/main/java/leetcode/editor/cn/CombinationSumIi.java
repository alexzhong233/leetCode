
package leetcode.editor.cn;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIi {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();

            List<Integer> subset = new ArrayList<>();
            boolean[] used = new boolean[candidates.length];
            Arrays.sort(candidates);
            backTrack(candidates, target, 0, res, subset, used);
            return res;
        }

        private void backTrack(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> subset, boolean[] used) {
            if (target < 0) {
                return;
            }
            if (target == 0) {
                res.add(new ArrayList<>(subset));
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                if(i>start && candidates[i-1] == candidates[i]){//過濾條件（當這次遞迴完會回到上一個遞迴，此時for迴圈的i會++）
                    continue; }
                    subset.add(candidates[i]);

                    backTrack(candidates, target - candidates[i], i+1, res, subset, used);

                    subset.remove(subset.size() - 1);
                }
            }

    }

//leetcode submit region end(Prohibit modification and deletion)

}