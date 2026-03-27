2026-03-27 10:55:39	

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat[0].length;
        for (int[] row : mat) {
            for (int i = 0; i < n; i++) {
                if (row[i]!=row[(i+k)%n]){
                    return  false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
