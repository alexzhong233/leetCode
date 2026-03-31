//2026-02-22 20:50:37


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int binaryGap(int n) {
        int res= 0;
        int i =0;int j=-1;
        while(n!=0){
//            判断第一个1的位置
            if ((n&1)==1){
                if (j!=-1){
                    res= Math.max(res,i-j);
                }
                j=i;
            }
//            位运算
            n>>=1;
            i++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
