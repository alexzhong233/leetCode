
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
//本来想用不定滑窗，结果发现一个指针遍历一次就秒了
        int length = temperatureA.length;
        int  right = 1, sum = 0, ans = 0;
        while (right < length) {
//            a数组今天与上一天的差值
            int ad = temperatureA[right] - temperatureA[right - 1];
//            b数组今天与上一天的差值
            int bd = temperatureB[right] - temperatureB[right - 1];
//          比较差值 看趋势是否相同  （是否同为正数 复数 0）
            if ((ad < 0 && bd < 0) || (ad == 0 && bd == 0) || (ad > 0 && bd > 0)) {
//                是的话直接+1 计算sum 计算ans
                sum++;
                ans = Math.max(ans, sum);
            }else{
//                重置指针位置的sum值 重新开始计算天数
                sum=0;
            }
            right++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
