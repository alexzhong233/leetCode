
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
int len = digits.length;
            for (int i = len-1; i >= 0; i--) {
                digits[i]++;
                if (digits[i]!=10){
                return digits;}else {
                    digits[i]=0;
                }
            }
            digits=new int[len+1];
            digits[0]=1;
            return digits;
            }
    }

//leetcode submit region end(Prohibit modification and deletion)

  }