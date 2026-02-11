//2026-02-12 01:40:03

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hammingWeight(int n) {
        int res= 0;
        while (n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
