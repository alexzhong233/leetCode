//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
//查询是否能够承担全程
        int countgas = 0;
        int countcost = 0;
        for (int i : gas) {
            countgas += i;
        }
        for (int i : cost) {
            countcost += i;
        }
        if (countcost > countgas) {
            return -1;
        }

//        开始计算
        int res = 0;
//        这里是0号的
        int i = res;

        int remind = 0;

        while (i < gas.length) {
            remind += gas[i] - cost[i];
            if (remind >= 0) {
//                可以去下个站点
                i++;
            } else {
                i++;
                res = i;
                remind = 0;
            }
        }
        return res;
    }
}

//runtime:2 ms
//memory:56.2 MB


//leetcode submit region end(Prohibit modification and deletion)