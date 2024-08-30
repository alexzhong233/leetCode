
  package leetcode.editor.cn;
  import java.util.*;

  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class WordBreak{
      public static void main(String[] args) {
           Solution solution = new WordBreak().new Solution();
          System.out.println(  solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                   Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"))
           );

      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          boolean can =false;
          public boolean wordBreak(String s, List<String> wordDict) {
              wordDict.sort((a, b) -> b.length() - a.length());
              bt(s,wordDict,0);
              return can;

          }
          void bt(String s ,List<String> dic,int start){
              if("".equals(s)){
                  can=true;
              }
              if(can) {
                  return;
              }
              for(String word:dic){
                  if(s.startsWith(word)){
                      bt(s.substring(word.length()),dic,start);
                  }
              }
          }
      }
//leetcode submit region end(Prohibit modification and deletion)

  }