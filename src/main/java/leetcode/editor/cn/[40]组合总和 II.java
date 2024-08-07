import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];
        for (int i = 0; i < candidates.length; i++) {
            used[i] = true;
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(i);
            int sum = candidates[i];
            bt(used, target, lists, sum, integers,candidates);
        }

        return lists;
    }

    private void bt(boolean[] used, int target, ArrayList<List<Integer>> lists, int sum, ArrayList<Integer> integers,int[] candidates) {
        if (sum == target) {
            lists.add(new ArrayList<>(integers));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            if (!used[i]){
                used[i]=true;
                ArrayList<Integer> a1 = new ArrayList<>(integers);
                a1.add(candidates[i]);
                bt(used,target,lists,sum+candidates[i],a1,candidates);
                used[i]=false;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
