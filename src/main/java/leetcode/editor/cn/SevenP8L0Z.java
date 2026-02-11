
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SevenP8L0Z {
    public static void main(String[] args) {
        Solution solution = new SevenP8L0Z().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            boolean[] used = new boolean[len];
            List<List<Integer>> res = new ArrayList<>();
            bt(nums, used, len, res, 0, new ArrayList<>());
            return res;
        }

        void bt(int[] nums, boolean[] used, int len, List<List<Integer>> res, int nowLen, List<Integer> sub) {
            if (nowLen == len) {
                res.add(sub);
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!used[i]) {
                    if (i>0&&nums[i]==nums[i-1]&&used[i-1]){
                        continue;
                    }
                    used[i] = true;
                    ArrayList<Integer> is = new ArrayList<>(sub);
                    is.add(nums[i]);
                    bt(nums, used, len, res, nowLen + 1, is);
                    used[i] = false;
                }
            }

        }}
//leetcode submit region end(Prohibit modification and deletion)

    }
