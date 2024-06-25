import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int length;
//    public int findCircleNum(int[][] isConnected) {
//         length = isConnected.length;
//        int ans = 0;
//        boolean[] checked = new boolean[length];
//        for (int i = 0; i < length; i++) {
//            if (!checked[i]) {
//                dfs(isConnected,i,checked);
//            ans++;
//            }
//        }
//        return ans;
//    }

    private void dfs(int[][] isConnected, int i, boolean[] checked) {
        checked[i]=true;
        for (int j = 0; j < length; j++) {
            if (!checked[j]&&isConnected[i][j]==1&&i!=j){
                dfs(isConnected,j,checked);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        length = isConnected.length;
        int ans = 0;
        boolean[] checked = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (!checked[i]) {
                LinkedList<Integer> integers = new LinkedList<>();
                integers.add(i);
                checked[i]=true;
                while (!integers.isEmpty()){
                    Integer poll = integers.poll();
                    for (int y = 0; y < length; y++) {
                        if (poll!=y&&!checked[y]&&isConnected[poll][y]==1){
                            integers.offer(y);
                            checked[y]=true;
                        }
                    }
                }
                ans++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
