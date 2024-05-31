//给你一个下标从 0 开始的二维整数矩阵 grid，大小为 n * n ，其中的值在 [1, n²] 范围内。除了 a 出现 两次，b 缺失 之外，每个整数都
// 恰好出现一次 。 
//
// 任务是找出重复的数字a 和缺失的数字 b 。 
//
// 返回一个下标从 0 开始、长度为 2 的整数数组 ans ，其中 ans[0] 等于 a ，ans[1] 等于 b 。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [[1,3],[2,2]]
//输出：[2,4]
//解释：数字 2 重复，数字 4 缺失，所以答案是 [2,4] 。
// 
//
// 示例 2： 
//
// 
//输入：grid = [[9,1,7],[8,9,2],[3,4,6]]
//输出：[9,5]
//解释：数字 9 重复，数字 5 缺失，所以答案是 [9,5] 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= n == grid.length == grid[i].length <= 50 
// 1 <= grid[i][j] <= n * n 
// 对于所有满足1 <= x <= n * n 的 x ，恰好存在一个 x 与矩阵中的任何成员都不相等。 
// 对于所有满足1 <= x <= n * n 的 x ，恰好存在一个 x 与矩阵中的两个成员相等。 
// 除上述的两个之外，对于所有满足1 <= x <= n * n 的 x ，都恰好存在一对 i, j 满足 0 <= i, j <= n - 1 且 
//grid[i][j] == x 。 
// 
//
// Related Topics数组 | 哈希表 | 数学 | 矩阵 
//
// 👍 13, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int length = grid.length;
        int length1 = grid[0].length;

        HashMap<Integer, HashSet> integerIntegerHashMap = new HashMap<>();
        HashSet<Integer> objects = new HashSet<>();
        HashSet<Integer> objects1 = new HashSet<>();
        for (int i = 1; i <= length1 * length; i++) {
            objects.add(i);
        }
        integerIntegerHashMap.put(0, objects);
        integerIntegerHashMap.put(1, new HashSet<>());
        integerIntegerHashMap.put(2, objects1);
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                HashSet arrayList = integerIntegerHashMap.get(0);
                HashSet arrayList1 = integerIntegerHashMap.get(1);
                HashSet arrayList2 = integerIntegerHashMap.get(2);
                if (arrayList.contains(grid[i][i1])) {
                    arrayList.remove(grid[i][i1]);
                    arrayList1.add(grid[i][i1]);
                } else if (arrayList1.contains(grid[i][i1])) {
                    arrayList1.remove(grid[i][i1]);
                    arrayList2.add(grid[i][i1]);
                }
            }
        }
        return new int[]{objects1.iterator().next(), objects.iterator().next()};
    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int length = grid.length;
        int length1 = grid[0].length;
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 1; i <= length1 * length; i++) {
            integerIntegerHashMap.put(i, 0);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                integerIntegerHashMap.put(grid[i][i1], integerIntegerHashMap.getOrDefault(grid[i][i1], 0) + 1);
            }
        }
        int[] ints = new int[2];
        integerIntegerHashMap.forEach((k, v) -> {
            if (v == 2) {
                ints[0] = k;
            }
            if (v == 0) {
                ints[1] = k;
            }
        });
        return ints;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

