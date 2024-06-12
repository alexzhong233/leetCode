//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != 
//k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请 
//
// 你返回所有和为 0 且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [0,0,0]
//输出：[[0,0,0]]
//解释：唯一可能的三元组和为 0 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics数组 | 双指针 | 排序 
//
// 👍 6885, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
//            大于0无法成为数组
            int num = nums[i];

            if (num > 0) {
                break;
            }
//           去重
            if (i > 0 && num == nums[i - 1]) {
                continue;
            }
            int right = len - 1;
            int left = i + 1;
            while (left < right) {
                int i1 = num + nums[left] + nums[right];
                if (i1 == 0) {
                    ans.add(Arrays.asList(num, nums[left], nums[right]));
                    //           去重

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    //           去重
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (i1 > 0) {
                    right--;

                } else {
                    left++;

                }

            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

