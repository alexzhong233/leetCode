
package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int fast =0,slow=0,n=nums.length;
        while (fast<n){
            if (nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i = slow; i < n; i++) {
            nums[i]=0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
