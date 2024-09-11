
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class GrumpyBookstoreOwner {
    public static void main(String[] args) {
        Solution solution = new GrumpyBookstoreOwner().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
            int good = 0;
            int urg = 0;
            for (int i = 0; i < customers.length; i++) {
                if (grumpy[i] == 0) {
                    good += customers[i];
                } else {
                    urg += customers[i];
                }
            }
            int max = 0;
            int res = 0;
            for (int i = 0; i < minutes; i++) {
//            生气的人 时间段内
                res += grumpy[i] * customers[i];
            }
            max = res;
            int right =minutes,left=0;
            while (right<customers.length){
                res+=grumpy[right]*customers[right]-grumpy[left]*customers[left];
                max=Math.max(res,max);
                right++;
                left++;
            }
            return good+max;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}