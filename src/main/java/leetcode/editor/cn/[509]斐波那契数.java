package leetcode.editor.cn;



//leetcode submit region begin(Prohibit modification and deletion)
//dp table
class Solution {
    public int fib(int n) {
        if (n==0||n==1){
            return n;
        }
//        int[] dp =new int[n+1];
     int dp0 =0 ;
       int dp1 =1;
        for (int i =2 ;i<=n;i++){
            int dp=dp0+dp1;
            dp0=dp1;
            dp1=dp;
        }
        return dp1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
