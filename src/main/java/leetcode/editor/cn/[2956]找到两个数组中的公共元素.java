//给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，它们分别含有 n 和 m 个元素。请你计算以下两个数值： 
//
// 
// answer1：使得 nums1[i] 在 nums2 中出现的下标 i 的数量。 
// answer2：使得 nums2[i] 在 nums1 中出现的下标 i 的数量。 
// 
//
// 返回 [answer1, answer2]。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums1 = [2,3,2], nums2 = [1,2] 
// 
//
// 输出：[2,1] 
//
// 解释： 
//
// 
//
// 示例 2： 
//
// 
// 输入：nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6] 
// 
//
// 输出：[3,4] 
//
// 解释： 
//
// nums1 中下标在 1，2，3 的元素在 nums2 中也存在。所以 answer1 为 3。 
//
// nums2 中下标在 0，1，3，4 的元素在 nums1 中也存在。所以 answer2 为 4。 
//
// 示例 3： 
//
// 
// 输入：nums1 = [3,4,2,3], nums2 = [1,5] 
// 
//
// 输出：[0,0] 
//
// 解释： 
//
// nums1 和 nums2 中没有相同的数字，所以答案是 [0,0]。 
//
// 
//
// 提示： 
//
// 
// n == nums1.length 
// m == nums2.length 
// 1 <= n, m <= 100 
// 1 <= nums1[i], nums2[i] <= 100 
// 
//
// Related Topics 数组 哈希表 👍 26 👎 0


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int j : nums1) {
            map1.put(j, map1.getOrDefault(j, 0) + 1);
        }
        for (int j : nums2) {
            map2.put(j, map2.getOrDefault(j, 0) + 1);
        }
        int answer1 = 0;
        int answer2 = 0;
        for (Integer i : map1.keySet()) {
            if (map2.containsKey(i)){
                answer1+=map2.get(i);
            }
        }
        for (Integer i : map2.keySet()) {
            if (map1.containsKey(i)){
                answer2+=map1.get(i);
            }
        }
        return new int[]{answer2,answer1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
