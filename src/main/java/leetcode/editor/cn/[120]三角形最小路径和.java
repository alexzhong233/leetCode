import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int[] ints = new int[triangle.size()];
//        for (int i = triangle.size() - 1; i >= 0; i--) {
////            从下网上获取行数
//            List<Integer> integers = triangle.get(i);
//            for (int j = 0; j < integers.size(); j++) {
////               如果是最后一行
//                if (i == triangle.size() - 1) {
////                    路径起点
//                    ints[j] = integers.get(j);
//                } else {
////                    他和他邻位最小的加上下面最小的
//                    ints[j] = Math.min(ints[j], ints[j + 1]) + integers.get(j);
//                }
//            }
//        }
//        return ints[0];
//    }

    public int minimumTotal(List<List<Integer>> triangle) {
//        取出大小 构建dp
        int size = triangle.size();

        int[] dp = new int[size + 1];
//        倒着计算最短路径
        for (int i = size-1; i >= 0; i--) {
//
            for (int j = 0; j <= i; j++) {
//                dp【j】是最小路径和
//                System.out.println(i+","+j+","+dp[j]+","+dp[j+1]);

                dp[j]=triangle.get(i).get(j)+Math.min(dp[j],dp[j+1]);
//                System.out.println(Arrays.toString(dp));
            }
        }
        return dp[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
