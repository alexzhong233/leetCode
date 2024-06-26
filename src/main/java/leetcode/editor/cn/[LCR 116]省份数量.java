
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int length = isConnected.length;
        int ans = 0;
        boolean[] checked = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (!checked[i]){
                dfs(checked,isConnected,i);
                ans++;
            }
        }
        return ans;
    }

    private void dfs(boolean[] checked, int[][] isConnected, int i) {
        checked[i]=true;
        for (int i1 = 0; i1 < checked.length; i1++) {
            if (!checked[i1]&&isConnected[i][i1]==1&&i!=i1){
                dfs(checked,isConnected,i1);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
