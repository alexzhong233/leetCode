/**
 * @author alex
 * @date 2023/5/22 10:06
 */
public class Test35 {
    public static void main(String[] args) {

        searchInsert(new int[]{1,3,4,5,10},0);
    }

        public static int searchInsert(int[] nums, int target) {
            int num = nums[nums.length - 1];
            if (num <target) {
                return nums.length ;
            }if (num==target){
                return nums.length-1;
            }
            if (nums[nums.length / 2] > target) {
                for (int i = 0; i <= nums.length / 2; i++) {
                    if (nums[i] < target && nums[i + 1] >= target) {
                        return i + 1;
                    }
                }
            } else {
                for (int i = nums.length / 2; i < nums.length; i++) {
                    if (nums[i] < target && nums[i + 1] >= target) {
                        return i + 1;
                    }
                }

            }
            return 0;
        }


}
