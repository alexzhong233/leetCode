
package leetcode.editor.cn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ress = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
//        要去冲 先排序
        Arrays.sort(nums);
//        全排列 定义布尔
        boolean[] used = new boolean[nums.length];
//        backtrace
        backtrace(nums, used, ress, subset);
        return ress;
    }

    private void backtrace(int[] nums, boolean[] used, List<List<Integer>> ress, List<Integer> subset) {
//在等于长度时 加进去 然后返回
        if (subset.size() == nums.length) {
            ress.add(new ArrayList<>(subset));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
//                如果值相同并且 前一个用过 重复了

                if (i > 0 && nums[i] == nums[i - 1] && used[i - 1]) {
                    continue;
                }

                subset.add(nums[i]);
                used[i] = true;
                backtrace(nums, used, ress, subset);
                used[i] = false;
                subset.remove(subset.size() - 1);
            }
        }
    }

}

//leetcode submit region end(Prohibit modification and deletion)
