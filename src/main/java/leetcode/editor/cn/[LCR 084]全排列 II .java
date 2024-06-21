import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        bt(nums, used, res, path);
        return res;
    }

    private void bt(int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> path) {
        if (nums.length==path.size()){
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]){
                if (i>0&&nums[i]==nums[i-1]&&used[i-1]){
                    continue;
                }
                path.add(nums[i]);
                used[i]=true;
                bt(nums, used, res, path);
                used[i]=false;
              path.remove(path.size()-1);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
