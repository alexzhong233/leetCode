
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        int res = 0;
        int point = 0;
        while (point < nums.length - 1) {
            int next = point + nums[point];
            if (next >= nums.length - 1) {
//                又跳了一部 就不用计算更大部署了
                return res + 1;
            }
            int nextPos = point;
            int nextRight = next;
            for (int i = point + 1; i <= next; i++) {
                if (i + nums[i] > nextRight) {
                    nextRight = i + nums[i];
                    nextPos = i;
                }
            }
            point = nextPos;
            res++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
