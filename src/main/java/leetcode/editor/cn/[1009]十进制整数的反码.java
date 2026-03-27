2026-03-11 08:31:52	

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int bitwiseComplement(int n) {
        if (n==0) return 1;
        int length = (int)(Math.log(n) / Math.log(2)) + 1;
        return (1 << length) - 1 - n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)