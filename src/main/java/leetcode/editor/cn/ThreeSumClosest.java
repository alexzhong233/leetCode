
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class ThreeSumClosest {
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int dist = Integer.MAX_VALUE;
            int ans = 0;
            Arrays.sort(nums);
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = length - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i];
                    if (sum == target) {
                        return sum;
                    }
                    int abs = Math.abs(target - sum);
                    if (dist > abs) {
                        dist = abs;
                        ans = sum;
                    }
                    if (target > sum) {
                        do {
                            left++;
                        } while (right > left && nums[left] == nums[left - 1]);
                    } else {
                        do {
                            right--;
                        } while (right > left && nums[right] == nums[right + 1]);
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}