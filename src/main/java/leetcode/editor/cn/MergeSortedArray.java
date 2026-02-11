
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class MergeSortedArray {
    public static void main(String[] args) {
        Solution solution = new MergeSortedArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int left = m -1;
            int right = n-1;
            int cur = m+n-1;
            while (right>=0) {
               if (left>=0&&nums1[left]>nums2[right]){
                   nums1[cur]=nums1[left];
                   left--;
               }else{
                   nums1[cur]=nums2[right];
                   right--;
               }
                cur--;
           }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}