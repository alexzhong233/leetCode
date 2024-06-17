
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int beginState = 0;
        int upState = 1;
        int downState = 2;
        if (nums.length < 2) {
            return nums.length;
        }
int length =1;
        int state = beginState;
        for (int i = 1; i < nums.length; i++) {
//            不符合要求略过即可
            if (state==beginState) {
                if (nums[i]>nums[i-1]){
                    state=upState;
                    length++;
                } else if (nums[i]<nums[i-1]) {
                    state=downState;
                    length++;
                }
            } else if (state==upState) {
//                上升的下一步就是下降
                if (nums[i]<nums[i-1]){
                    state=downState;
                    length++;
                }
            }else if (state==downState){
//                下降的下一步是上升
                if (nums[i]>nums[i-1]){
                    state=upState;
                    length++;
                }
            }
        }
        return length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
