
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
int count =0;
    final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    int m;
    int n;
    public int maxAreaOfIsland(int[][] grid) {
       m  = grid.length;
       n = grid[0].length;

        boolean[][] checked = new boolean[m][n];
        int ans =0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!checked[i][j]&&grid[i][j]==1){
//                    开始计算面积
                    count=0;
                    dfs(checked,grid,i,j);
                    ans=Math.max(ans,count);
                }
            }
        }
        return ans;
    }

    private void dfs(boolean[][] checked, int[][] grid, int x, int y) {
        count++;
        checked[x][y]=true;
        for (int[] direction : DIRECTIONS) {
            int nx = direction[0] + x;
            int ny = direction[1] + y;
            if (0<=nx&&nx<m&&0<=ny&&ny<n&&grid[nx][ny]==1&&!checked[nx][ny]){
                dfs(checked,grid,nx,ny);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
