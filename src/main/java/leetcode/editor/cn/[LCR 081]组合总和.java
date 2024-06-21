import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        bt(candidates,target,0,path,res);
        return res;
    }

    private void bt(int[] nums, int target, int start, List<Integer> path, List<List<Integer>> res) {

        if (target<0){
//            没有
            return;
        }
        if (target==0){
//            正好符合
            res.add(new ArrayList<>(path));
            return;
        }

//        还没到临界值
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            bt(nums,target-nums[i],i,path,res);
            path.remove(path.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
