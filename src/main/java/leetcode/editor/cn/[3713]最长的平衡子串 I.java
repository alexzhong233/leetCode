//2026-02-12 00:42:33

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int res = 0;
        int[] cnt = new int[26];

        for (int i = 0; i < n; i++) {
            Arrays.fill(cnt, 0);
            for (int j = i; j < n; j++) {
                boolean flag = true;
                int c = s.charAt(j) - 'a';
                cnt[c]++;

                for (int x : cnt) {
                    if (x > 0 && x != cnt[c]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
