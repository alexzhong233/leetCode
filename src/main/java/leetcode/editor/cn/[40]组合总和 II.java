import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, target, 0, path, res);
        return res;

    }

    private void backTrack(int[] candidates, int target, int i, List<Integer> path, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j - 1] == candidates[j]) {
//               运算过了
                continue;
            }
            path.add(candidates[j]);
//            只能使用一次 所以要加1 可以重复的不用加

            backTrack(candidates, target - candidates[j], j+1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
