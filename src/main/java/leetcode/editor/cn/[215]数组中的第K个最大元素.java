//给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。 
//
// 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。 
//
// 
//
// 示例 1: 
//
// 
//输入: [3,2,1,5,6,4], k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 
//输入: [3,2,3,1,2,4,5,5,6], k = 4
//输出: 4 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 2523 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] res = quickSort(nums, 0, nums.length - 1, k - 1);
        return res[k - 1];
    }

    private int[] quickSort(int[] nums, int left, int right, int index) {
        int mid = partition(nums, left, right);
        if (mid == index) {
            return Arrays.copyOf(nums, mid + 1);
        } else if (mid > index) {
            return quickSort(nums, left, mid - 1, index);
        } else {
            return quickSort(nums, mid + 1, right, index);
        }


    }

    private int partition(int[] nums, int left, int right) {
//        获取左边的数字
        int p = nums[left];
        while (left < right) {
            while (left < right && nums[right] <= p) {
//               当右边小于左边的数字 右边往前
                right--;
            }
//            把最后一个小于左边数字的右边数字调整到左边数字的位置
            nums[left] = nums[right];
            while (left < right && nums[left] >= p) {
//                当左边的数字大于了p 往右走
                left++;
            }
//            把最右边数字射程最后一个最大的数字
            nums[right] = nums[left];
//            左边射程p
            nums[left] = p;

        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
