
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[] cols = new int[m];
        int res = 0;

        for (int i = 0; i < n; i++) {
            int rows= 0;
            for (int i1 = 0; i1 < m; i1++) {
//                System.out.println(grid[i][i1]);
                cols[i1]+=grid[i][i1];
                rows+= cols[i1];
//                System.out.println(rows);
                if (rows<=k){
                    res++;
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
