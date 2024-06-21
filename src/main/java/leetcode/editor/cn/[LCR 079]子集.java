import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        bt(nums, 0, subset, res);
        return res;
    }

    private void bt(int[] nums, int i, List<Integer> subset, List<List<Integer>> res) {

        res.add(new ArrayList<>(subset));
        for (int j = i; j < nums.length; j++) {
            subset.add(nums[j]);
            bt(nums, j + 1, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
