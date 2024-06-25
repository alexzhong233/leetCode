import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findUnsortedSubarray(int[] nums) {
//        for (int i = nums.length - 1; i > 0; i--) {
//
//            if (nums[i]<nums[i-1]){
////                对i和i-1进行排序
//            }
//        }
        if (nums.length==1){
            return 0;
        }
        int[] arr = nums.clone();

        Arrays.sort(arr);

        int l = 0, r = arr.length - 1;


            while (l <= r&&nums[l]==arr[l]) {
                l++;
            }
        while (l <= r&&nums[r]==arr[r]) {
                r--;
            }



        return r-l+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
