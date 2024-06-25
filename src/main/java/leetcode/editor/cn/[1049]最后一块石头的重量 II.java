import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int lastStoneWeightII(int[] stones) {
//        int sum = Arrays.stream(stones).sum();
//        int target = sum / 2;
//        int length = stones.length;
//        int[][] dp   = new int[length+1][target+1];
//        for (int i = 1; i <= length; i++) {
//            for (int j = 0; j <= target; j++) {
//                if (j<stones[i-1]){
//                    dp[i][j]=dp[i-1][j];
//                }else{
//                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-stones[i-1]]+stones[i-1]);
//                }
//            }
//        }
////        减掉2次 是因为要留下最小部分
//        return Math.abs(sum-dp[length][target]-dp[length][target]);
//    }

    public int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        int target = sum / 2;
        int length = stones.length;
        int[] dp   = new int[target+1];
        for (int i = 1; i <= length; i++) {
            for (int j = target; j >= 0; j--) {
                if (j<stones[i-1]){
                }else{
                    dp[j]=Math.max(dp[j],dp[j-stones[i-1]]+stones[i-1]);
                }
            }
        }
//        减掉2次 是因为要留下最小部分
        return Math.abs(sum-dp[target]-dp[target]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
