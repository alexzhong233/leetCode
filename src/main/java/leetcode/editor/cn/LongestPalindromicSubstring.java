
  package leetcode.editor.cn;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class LongestPalindromicSubstring{
      public static void main(String[] args) {
           Solution solution = new LongestPalindromicSubstring().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = getReturn(s,i,i);
            String s2 = getReturn(s,i,i+1);
            res =res.length()>s1.length()?res:s1;
            res =res.length()>s2.length()?res:s2;
        }
        return res;
    }
       String    getReturn(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
       }
}
//leetcode submit region end(Prohibit modification and deletion)

  }