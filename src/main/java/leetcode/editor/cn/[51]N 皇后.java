
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<String>> res = new LinkedList<>();
    List<String> broad = new ArrayList<>();


    public List<List<String>> solveNQueens(int n) {
        String[][] broadLine = new String[n][n];
        List<String> broad = new ArrayList<>();
        dfs(broadLine, 0);
        return res;
    }

    void dfs(String[][] broadLine, int row) {
        int n = broadLine[row].length;
        if (n == broad.size()) {
            res.add(new LinkedList<>(broad));
            broad = new ArrayList<>();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(broadLine, row, col)) {
                broadLine[row][col] = "Q";
                dfs(broadLine, row + 1);
                broadLine[row][col] = ".";
                if (broadLine[row][n] != null) {
                    String str = "";
                    for (String s : broadLine[row]) {
                        str += s;
                    }
                }
            }
        }
    }

    boolean isValid(String[][] broadLine, int row, int col) {
        int n = broadLine[row].length;
//        正上方
        for (int i = 0; i <= n; i++) {
            if (broadLine[i][col] == "Q") {
                return false;
            }
        }
//        右上
        for (int i = row - 1, j = col + 1; i >= 0 && j <n; i--, j--) {
            if (broadLine[i][j] == "Q") {
                return false;
            }
        }
//        左上
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (broadLine[i][j] == "Q") {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
