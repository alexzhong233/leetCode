
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
int left=0,res=Integer.MAX_VALUE;
int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum>=target){
                res = Math.min(i-left+1,res);
                sum-=nums[left];
                left++;

            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
