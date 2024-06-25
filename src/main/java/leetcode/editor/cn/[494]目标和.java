
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (((target + sum) % 2 == 1)||Math.abs(sum)<Math.abs(target)) return 0;
        int bagSize = target + sum >> 1;
         bagSize = bagSize>0?bagSize:-bagSize;

//        int[][] dp = new int[nums.length + 1][bagSize + 1];
//
//        // 初始化
//        for (int i = 0; i <= nums.length; i++) {
//            // 在前 i 个数字中，凑出和为 0 的组合有多少种方法
//            // 答案是 1 种方法
//            // 即每次不选择第 i 个元素就行
//            dp[i][0] = 1;
//            // System.out.print(dp[i][0] + " ");
//        }
//        // System.out.println("");
//
//        // 01 背包问题开始填充二维数组
//        for (int i = 1; i <= nums.length; i++) {
//            for (int j = 0; j <= bagSize; j++) {
//                // 注意到 i 是从下标 1 开始访问的
//                // 1、背包容量小于当前元素
//                // 背包无法放入 nums[i - 1]
//                if( j < nums[i - 1]){
//
//                    dp[i][j] = dp[i - 1][j];
//
//                    // 2、背包容量大于等于当前元素
//                    // 背包可以放入 nums[i - 1]
//                }else{
//
//                    // 不选：方案数为 dp[i - 1][j]
//                    // 选：方案数为 dp[i - 1][j - nums[i - 1]]
//                    // 两者之和
//                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
//                }
//            }
//        }
//
//        // 返回结果
//        return dp[nums.length][bagSize];
//滚动数组
        int[] dp = new int[bagSize + 1];
        dp[0]=1;

        for (int i = 1; i <= nums.length; i++) {
            for (int j = bagSize; j >=0; j--) {
                if (j < nums[i - 1]) {

                }else{
                    dp[j] =dp[j]+dp[j-nums[i-1]];
                }
            }
        }
        return dp[bagSize];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
