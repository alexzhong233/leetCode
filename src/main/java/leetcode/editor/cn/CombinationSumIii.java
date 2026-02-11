
package leetcode.editor.cn;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import java.util.ArrayList;
import java.util.List;

public class CombinationSumIii {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIii().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {

            boolean[] used = new boolean[9];
            List<List<Integer>> res = new ArrayList<>();

            bt( used, 0, k, n, res, new ArrayList<Integer>());
            return res;
        }

        void bt( boolean[] used, int start, int remind, int target, List<List<Integer>> res, ArrayList<Integer> sub) {
        if (remind==0&&target==0){
            res.add(new ArrayList<>(sub));
            return;
        }
        if (remind<0||target<0){
            return;
        }
            for (int i = start; i < 9; i++) {
                if (!used[i]){
                    used[i]=true;
                    ArrayList<Integer> integers = new ArrayList<>(sub);
                    integers.add(i+1);
                    bt(used,i+1,remind-1,target-i-1,res,integers);
                    used[i]=false;
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}