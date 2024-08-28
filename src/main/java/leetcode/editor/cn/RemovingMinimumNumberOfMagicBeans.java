
  package leetcode.editor.cn;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class RemovingMinimumNumberOfMagicBeans{
      public static void main(String[] args) {
           Solution solution = new RemovingMinimumNumberOfMagicBeans().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public long minimumRemoval(int[] beans) {
              long min = Long.MAX_VALUE;
              long n =beans.length;
              long sum= 0;
              for(int i:beans){
                  sum+=i;
              }
              Arrays.sort(beans);
              for(int i=0;i<n;i++){
                  min= Math.min(min,sum-(n-i)*beans[i]);
              }
              return min;
          }
      }
//leetcode submit region end(Prohibit modification and deletion)

  }