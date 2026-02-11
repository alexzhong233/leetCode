
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class SlidingWindowMedian {
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMedian().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double[] medianSlidingWindow(int[] nums, int k) {
            boolean needPlus = false;
            if (k % 2 == 0) {
                needPlus = true;
            }
//init first
            ArrayList<Double> doubles = new ArrayList<>();
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                integers.add(nums[i]);
            }
            ArrayList<Integer> integers1 = new ArrayList<>(integers);
            Collections.sort(integers1);
            System.out.println();
            if (needPlus) {
                long i1 = integers1.get(k / 2) ;
                long i2 = integers1.get(k / 2-1) ;
                long i3= i1+i2;
                System.out.println(i1+i2);
                doubles.add(i3 / 2.0);
            } else {
                doubles.add(Double.valueOf(integers1.get(k / 2)));
            }
            for (int i = k; i < nums.length; i++) {
                integers.remove(0);
                integers.add(nums[i]);
                ArrayList<Integer> tmp = new ArrayList<>(integers);
                Collections.sort(tmp);
                if (needPlus) {
                    long i1 = tmp.get(k / 2) ;
                    long i2 = tmp.get(k / 2-1) ;
                    long i3= i1+i2;
                    System.out.println(i1+i2);
                    doubles.add(i3 / 2.0);
                } else {
                    doubles.add(Double.valueOf(tmp.get(k / 2)));
                }
            }
            return doubles.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}