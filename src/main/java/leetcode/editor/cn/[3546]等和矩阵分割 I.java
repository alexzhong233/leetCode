2026-03-25 09:52:32	

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
     int m = grid.length;
     int n = grid[0].length;
     long[][] sum = new long[m+1][n+1];
     long total = 0;
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                sum[i+1][i1+1] = sum[i+1][i1]+sum[i][i1+1]-sum[i][i1]+grid[i][i1];
                total+=grid[i][i1];
            }
        }
        for (int i = 0; i < m - 1; i++) {
            if (total==sum[i+1][n]*2) {
                return true;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (total==sum[m][i+1]*2) {
                return true;
            }
        }
        return false;
     }
}
//leetcode submit region end(Prohibit modification and deletion)
