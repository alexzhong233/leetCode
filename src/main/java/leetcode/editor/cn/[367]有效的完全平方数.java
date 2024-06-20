
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0, right = num;
        while (left < right) {
            long mid =  (left + right) / 2 ;
//            注意超界
            long i = (long) mid * mid;
            if (i< num) {
                left = mid + 1;
            } else{
                right = mid;
            }
        }

        return left * left == num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
