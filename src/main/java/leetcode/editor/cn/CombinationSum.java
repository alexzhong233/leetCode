
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();

            List<Integer> subset = new ArrayList<>();
            backTrack(candidates,target,0,res,subset);
            return res;
        }
        private void backTrack(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> subset) {
            if (target<0){return;}
            if (target==0){
                res.add(new ArrayList<>(subset));
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                subset.add(candidates[i]);

                backTrack(candidates,target-candidates[i],i,res,subset);

                subset.remove(subset.size()-1);
            }
    }}
//leetcode submit region end(Prohibit modification and deletion)

}