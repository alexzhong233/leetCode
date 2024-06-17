import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0, sum = 0;
        int large =0;
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

                while (integerIntegerHashMap.containsKey(num)){
                    integerIntegerHashMap.remove(nums[left]);
                    sum-=nums[left];
                    left++;
                }

            sum += num;
            integerIntegerHashMap.put(num,1);
            large=Math.max(large,sum);
        }
        return large;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
