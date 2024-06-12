import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
//       Arrays.sort(nums);
        int length = nums.length;
        int left = 0, right = length-1;
        int index =0;
        while (index <=right) {
            int cur = nums[index];
            //            左边管0
            if (cur==0){
                swap(left,index,nums);
                index++;
                left++;
            }else if (cur==1){
                index++;
            }else if (cur==2){
                swap(index,right,nums);
//                index不能动 无法确定right下一位是什么
                right--;
            }

        }
    }
    private void swap(int left,int right, int[] nums){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
