
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if (x==0){return 0;}
        if (x==1){return 1;}
        long left = 0, right = x,ans =-1;
        while (left < right) {
            long mid = (left + right) / 2;
            long l = mid * mid;
            if (l <= x) {
                ans =mid;
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (int) ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
