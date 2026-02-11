
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class TeemoAttacking {
    public static void main(String[] args) {
        Solution solution = new TeemoAttacking().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
//            默认duration，相当于最后一次攻击必定中毒duration时间,这里提前加上了
            int total = duration;
            for (int i = 1; i < timeSeries.length; i++) {
                total += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
            }
            return total;
//            List<int[]> ls = new ArrayList<>();
//            ls.add(new int[]{timeSeries[0], timeSeries[0] + duration - 1});
//            for (int i = 1; i < timeSeries.length; i++) {
//                int[] ints = ls.get(ls.size() - 1);
////
//                int timeSery = timeSeries[i];
//                if (ints[1]< timeSery){
//                        ls.add(new int[]{timeSery, timeSery +duration-1});
//                    }else{
//                        ints[1]=Math.max(ints[1], timeSery +duration-1);
//                    }
//            }
//            int ans = 0;
//            for (int[] l : ls) {
//                ans+=l[1]-l[0]+1;
//            }
//            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}