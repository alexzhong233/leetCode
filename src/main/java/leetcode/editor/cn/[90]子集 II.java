import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
//        有重复的应该先排序 才能剪纸

        List<List<Integer>> res= new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(0,nums,res,subset);
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, List<Integer> subset) {
        res.add(new ArrayList<Integer>(subset));
        if (i>=nums.length){
            return;
        }
        for (int j = i; j < nums.length; j++) {
//            剪纸
            if (j>i&&nums[j]==nums[j-1]) continue;
            subset.add(nums[j]);
            backtrack(j+1,nums,res,subset);
            subset.remove(subset.size()-1);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
