//给你一个二维 boolean 矩阵 grid 。 
//
// 请你返回使用 grid 中的 3 个元素可以构建的 直角三角形 数目，且满足 3 个元素值 都 为 1 。 
//
// 注意： 
//
// 
// 如果 grid 中 3 个元素满足：一个元素与另一个元素在 同一行，同时与第三个元素在 同一列 ，那么这 3 个元素称为一个 直角三角形 。这 3 个元素
//互相之间不需要相邻。 
// 
//
// 
//
// 示例 1： 
//
// 
// 
// 
// 
// 0 
// 1 
// 0 
// 
// 
// 0 
// 1 
// 1 
// 
// 
// 0 
// 1 
// 0 
// 
// 
// 
// 
//
// 
// 
// 
// 0 
// 1 
// 0 
// 
// 
// 0 
// 1 
// 1 
// 
// 
// 0 
// 1 
// 0 
// 
// 
// 
//
// 
// 输入：grid = [[0,1,0],[0,1,1],[0,1,0]] 
// 
//
// 输出：2 
//
// 解释： 
//
// 有 2 个直角三角形。 
//
// 示例 2： 
//
// 
// 
// 
// 
// 1 
// 0 
// 0 
// 0 
// 
// 
// 0 
// 1 
// 0 
// 1 
// 
// 
// 1 
// 0 
// 0 
// 0 
// 
// 
// 
// 
//
// 
// 输入：grid = [[1,0,0,0],[0,1,0,1],[1,0,0,0]] 
// 
//
// 输出：0 
//
// 解释： 
//
// 没有直角三角形。 
//
// 示例 3： 
//
// 
// 
// 
// 
// 1 
// 0 
// 1 
// 
// 
// 1 
// 0 
// 0 
// 
// 
// 1 
// 0 
// 0 
// 
// 
// 
// 
//
// 
// 
// 
// 1 
// 0 
// 1 
// 
// 
// 1 
// 0 
// 0 
// 
// 
// 1 
// 0 
// 0 
// 
// 
// 
//
// 
// 输入：grid = [[1,0,1],[1,0,0],[1,0,0]] 
// 
//
// 输出：2 
//
// 解释： 
//
// 有两个直角三角形。 
//
// 
//
// 提示： 
//
// 
// 1 <= grid.length <= 1000 
// 1 <= grid[i].length <= 1000 
// 0 <= grid[i][j] <= 1 
// 
//
// Related Topics 数组 哈希表 数学 组合数学 计数 👍 29 👎 0


import java.util.ArrayList;

import java.util.HashMap;


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long numberOfRightTriangles(int[][] grid) {
//        int[][][] dirs = {{{1, 0}, {0, 1}}, {{1, 0}, {0, -1}}, {{-1, 0}, {0, 1}}, {{-1, 0}, {0, -1}}};
        int m = grid.length;
        int n = grid[0].length;
        long ans = 0;
//        同列
        HashMap<Integer, Long> hexMap = new HashMap<>();
//        同行
        HashMap<Integer, Long> lineMap = new HashMap<>();
        ArrayList<int[]> ls = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ls.add(new int[]{i, j});
                    lineMap.put(i, lineMap.getOrDefault(i, 0l) + 1);
                    hexMap.put(j, hexMap.getOrDefault(j, 0l) + 1);
                }
            }
        }

        for (int[] l : ls) {
            long i1 = (lineMap.get(l[0]) - 1) * (hexMap.get(l[1]) - 1);
            ans += i1;
        }

        return ans;
    }
}

//                if (grid[i][j] == 1) {
//                int i1 = grid[i][j];
//                    查看他的其他两个方向是否为1
//                    for (int[][] dir : dirs) {
//                        int x1 = dir[0][0] + i;
//                        int y1 = dir[0][1] + j;
//                        int x2 = dir[1][0] + i;
//                        int y2 = dir[1][1] + j;
////                        if (x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0 && x1 < m && x2 < m && y2 < n && y1 < n && grid[x1][y1] == 1 && grid[x2][y2] == 1) {
//                        if (x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0 && x1 < m && x2 < m && y2 < n && y1 < n && grid[x1][y1] == i1 && grid[x2][y2] == i1) {
//                            System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+i+" "+j);
//                            ans++;
//                        }
////                    }
//                }
//
//    }
//}



