package leetcode.editor.cn;//给你一个由 正整数 组成的数组 nums 。
//
// 返回数组 nums 中所有具有 最大 频率的元素的 总频率 。
//
// 元素的 频率 是指该元素在数组中出现的次数。
//
//
//
// 示例 1：
//
//
//输入：nums = [1,2,2,3,1,4]
//输出：4
//解释：元素 1 和 2 的频率为 2 ，是数组中的最大频率。
//因此具有最大频率的元素在数组中的数量是 4 。
//
//
// 示例 2：
//
//
//输入：nums = [1,2,3,4,5]
//输出：5
//解释：数组中的所有元素的频率都为 1 ，是最大频率。
//因此具有最大频率的元素在数组中的数量是 5 。
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100
//
//
// Related Topics 数组 哈希表 计数 👍 14 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>(); // 更快的写法见【Java 数组】
         int maxCnt = 0;
        int ans = 0;
        for (int num : nums) {
            int c =  cnt.merge(num, 1,Integer::sum);
            if (c > maxCnt) {ans =maxCnt=c;}else if(c==maxCnt){ans+=c;}
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
