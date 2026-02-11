//2026-02-12 01:55:42

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = squareSum(n);
        while (slow!=fast){
            slow= squareSum(slow);
            fast=squareSum(squareSum(fast));
        }
        return slow==1;
    }
    public int squareSum(int n ){
        int sum =0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
