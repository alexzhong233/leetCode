import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
//        拿到0-k的插值
        int ans = nums[k-1]-nums[0];
        for (int right=k,left=1;right<nums.length;right++,left++){
//            往右固定滑动
            ans=Math.min(ans,nums[right]-nums[left]);
        }
        return ans;
//        return nums[nums.length-1]-nums[nums.length-k];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
