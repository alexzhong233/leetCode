import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int shipWithinDays(int[] weights, int days) {
//        最低不能超过最轻的
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum()+1;
        while (left < right) {
            int mid = (left + right) >> 1;
            int day = countday(weights, mid);
            if (day <= days) {
//                小于等于 说明运力符合预期 有进一步缩小可能
                right = mid;
            } else {
//                大于 说明当前left不符合预期 左闭右开 所以+1
                left = mid + 1;
            }
        }
        return left;
    }

    private int countday(int[] weights, int load) {
        int sum = 0;
        int i = 0;
        int temp = 0;
        while (i < weights.length) {
            while (temp < load&&i<weights.length) {
                temp += weights[i];
                i++;
            }
            if (temp > load) {
                i--;
            }
            sum += 1;
            temp = 0;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
