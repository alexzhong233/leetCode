
package leetcode.editor.cn;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Solution solution = new Subsets().new Solution();
        solution.subsets(new int[]{1, 2, 3});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        static List<List<Integer>> res;

        public List<List<Integer>> subsets(int[] nums) {
            int len = nums.length;
            boolean[] used = new boolean[len];
            res = new ArrayList<>();
            bt(0,used, nums, len, new ArrayList<>());
            return res;
        }

        void bt(int t ,boolean[] used, int[] nums, int len, ArrayList<Integer> integers) {
            res.add(integers);
            for (int i =t; i <len; i++) {
                if (!used[i]){
                    used[i]=true;
                    ArrayList<Integer> i1 = new ArrayList<>(integers);
                    i1.add(nums[i]);
                    bt(i+1,used,nums,len,i1);
                    used[i]=false;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}