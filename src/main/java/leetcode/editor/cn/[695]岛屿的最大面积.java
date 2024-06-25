import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int x, y;
    private int area;

//    public int maxAreaOfIsland(int[][] grid) {
//        x = grid.length;
//        y = grid[0].length;
//        boolean[][] checked = new boolean[x][y];
//        int ans = 0;
////开始dp 找第一个
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                if (grid[i][j] == 1 && !checked[i][j]) {
//                    area=1;
//                    dfs(grid,i,j,checked);
//                    ans = Math.max(area,ans);
//                }
//            }
//        }
//        return ans;
//    }

    private void dfs(int[][] grid, int i, int j, boolean[][] checked) {
        checked[i][j] = true;
        for (int[] direction : DIRECTIONS) {
            int nx = i + direction[0];
            int ny = j + direction[1];
            if (nx >= 0 && nx < x && ny >= 0 && ny < y && !checked[nx][ny] && grid[nx][ny] == 1) {
                area += 1;
                dfs(grid, nx, ny, checked);
            }
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        x = grid.length;
        y = grid[0].length;
        boolean[][] checked = new boolean[x][y];
        int ans = 0;

//开始dp 找第一个
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 1 && !checked[i][j]) {
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    checked[i][j] = true;
                    area=0;
                    while (!queue.isEmpty()) {
                        int[] point = queue.poll();
                        int cx = point[0];
                        int cy = point[1];
                        area++;
                        for (int[] dir : DIRECTIONS) {
                            int nx = cx + dir[0];
                            int ny = cy + dir[1];
                            if (nx >= 0 && nx < x && ny >= 0 && ny < y && !checked[nx][ny] && grid[nx][ny] == 1) {
                                queue.offer(new int[]{nx, ny});
                                checked[nx][ny] = true;
                            }
                        }
                    }
                    ans = Math.max(ans,area);
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
