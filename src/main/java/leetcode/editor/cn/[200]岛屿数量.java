import java.util.LinkedList;
import java.util.Queue;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] DERICTIONS = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
//DFS
//    public int numIslands(char[][] grid) {
//        int x = grid.length;
//        int y = grid[0].length;
//        int ans = 0;
//
//        boolean[][] checked = new boolean[x][y];
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                if (grid[i][j] == '1' && !checked[i][j]) {
//                    checked[i][j] = true;
//                    DFS(grid, i, j, checked);
//
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }

    private void DFS(char[][] grid, int i, int j, boolean[][] checked) {
        checked[i][j] = true;
        for (int[] deriction : DERICTIONS) {
            int ni = i + deriction[0];
            int nj = j + deriction[1];
            if (0 <= ni && ni < grid.length && 0 <= nj && nj < grid[0].length && !checked[ni][nj] && grid[ni][nj] == '1') {
                DFS(grid, ni, nj, checked);
            }

        }
    }

    //    bfs
    public int numIslands(char[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int ans = 0;
        int[][] checked = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == '1' && checked[i][j] == 0) {
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    checked[i][j] = 1;

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int cx = current[0];
                        int cy = current[1];

                        for (int[] deriction : DERICTIONS) {
                            int nx = cx + deriction[0];
                            int ny = cy + deriction[1];
                            if (nx >= 0 && nx < x && ny >= 0 && ny < y
                                    && checked[nx][ny] == 0 && grid[nx][ny] == '1') {

                                queue.offer(new int[]{nx,ny});

                                checked[nx][ny]=1;
                            }
                        }
                    }
                    ans++;
                }
            }
        }
        return ans;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
