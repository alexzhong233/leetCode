import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int lengthg = g.length;
        int lengths = s.length;
       int sp = 0,gp =0;
       while (sp<lengths&&gp<lengthg){
           if (s[sp]>=g[gp]){
               res++;
               gp++;
           }
               sp++;
       }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
