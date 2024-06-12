
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
//        left=-1防止0-任何数最大
        int left = -1, right = 0;
        int size = 0;
        while (right < length) {
        if (nums[right]==1){
            size=Math.max(size,right-left);
        }else{
            left=right;
        }
        right++;
        }
        return size;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
