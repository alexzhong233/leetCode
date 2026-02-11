
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class QJnOS7 {
    public static void main(String[] args) {
        Solution solution = new QJnOS7().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            int m = text1.length();
            int n = text2.length();
            int[][] dp = new int[m+1][n+1];
//            for (int i = 1; i < m; i++) {
//                dp[i][0]=1;
//            }
//            for (int i = 1; i < n; i++) {
//                dp[0][i]=1;
//            }
            for (int i = 1; i <= m; i++) {
                for (int i1 = 1; i1 <= n; i1++) {
                    if (text1.charAt(i-1)==text2.charAt(i1-1)){
                        dp[i][i1]=dp[i-1][i1-1]+1;
                    }else{
                        dp[i][i1]=Math.max(dp[i-1][i1],dp[i][i1-1]);
                    }
                }
            }

            return dp[m][n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}