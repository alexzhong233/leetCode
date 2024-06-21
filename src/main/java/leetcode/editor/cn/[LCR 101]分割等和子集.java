import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int right = nums.length - 1;
        int left = 0;
        int leftsum = nums[left];
        int rightsum = nums[right];
        while (left < right) {
//            System.out.println(left+","+right+","+leftsum+","+rightsum);
            if (rightsum == leftsum&&left+1==right) {
                return true;
            }else if (rightsum>leftsum){
                left++;
                leftsum += nums[left];
            }else{
                right--;
                rightsum += nums[right];
            }



        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
