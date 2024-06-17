
package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int length = customers.length;
        int[] uns = new int[length];
//        算出第n分钟顾客不满意的值 满意为0
        for (int i = 0; i < length; i++) {
            uns[i] = customers[i] * grumpy[i];
        }
//        初始化窗口内总最大不满意值
        int winSum = 0;
        for (int i = 0; i < minutes; i++) {
            winSum += uns[i];
        }
        int maxWinSum = winSum;
//减掉左窗口不满足的人数 取最大值
        for (int i = minutes; i < length; i++) {
            winSum += uns[i];
            int left = i - minutes;
            winSum -= uns[left];
            maxWinSum = Math.max(maxWinSum, winSum);
        }
//算出总顾客
        int totalCustomers = 0;
        for (int customer : customers) {
            totalCustomers += customer;
        }
//        算出总不满足顾客
        int totalUns = 0;
        for (int un : uns) {
            totalUns += un;
        }
//总顾客-不满足+最大
        return totalCustomers - totalUns + maxWinSum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
