
  package leetcode.editor.cn;
  import java.awt.image.AreaAveragingScaleFilter;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import leetcode.editor.cn.utils.TreeNode;
  import leetcode.editor.cn.utils.ListNode;
  
  
  public class SquaresOfASortedArray{
      public static void main(String[] args) {
           Solution solution = new SquaresOfASortedArray().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[i]=nums[i]*nums[i];
        }
        Arrays.sort(ints);
        return ints;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }