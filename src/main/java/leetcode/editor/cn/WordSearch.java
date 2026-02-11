
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class WordSearch {
    public static void main(String[] args) {
        Solution solution = new WordSearch().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        boolean find = false;
        static final int[][] DIRECTIONS = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

        public boolean exist(char[][] board, String word) {
            int m = board.length;

            int n = board[0].length;
            boolean[][] used = new boolean[m][n];
            find = false;
            char target = word.charAt(0);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == target && !used[i][j]) {
                        used[i][j] = true;
                        bt(board, word, used, 1, m, n, i, j);
                        used[i][j] = false;
                    }
                }
            }
            return find;
        }

        void bt(char[][] board, String word, boolean[][] used, int len, int m, int n, int i, int j) {
            if (len == word.length()) {
                find = true;
                return;
            }
            if (len > word.length() || find) {
                return;
            }
            char target = word.charAt(len);

            for (int[] direction : DIRECTIONS) {
                int x = i + direction[0];
                int y = j + direction[1];
                if (x >= 0 && y >= 0 && x < m && y < n && !used[x][y] && board[x][y] == target) {
                    used[x][y] = true;
                    bt(board, word, used, len + 1, m, n, x, y);
                    used[x][y] = false;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}