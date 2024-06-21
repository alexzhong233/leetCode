import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(0, nums, subset, set);
        return set;

    }

    //    1 递归时数组的下标
//    nums 集合
//    subset 子集
//    set 总集
    private void backtrack(int i, int[] nums, List<Integer> subset, List<List<Integer>> set) {
//       确定好一个子集 把他放入结果集合
        set.add(new ArrayList<>(subset));
//        结束递归的条件
        if (i >= nums.length) {
            return;
        }
        for (int j = i; j < nums.length; j++) {
//            加入subset
            subset.add(nums[j]);
//            剪纸
//            递归调用
            backtrack(j+1,nums,subset,set);
//            回到上一步状态 撤销选择
        subset.remove(subset.size()-1);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
