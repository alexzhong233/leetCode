
package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {List<List<Integer>> res =new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {

      List<Integer> track =new LinkedList<>();
        boolean[] use = new boolean[nums.length];
        backtrace(nums,use,track);
        return res;

    }

    private void backtrace(int[] nums,boolean[] use,List track){
        if(track.size()==nums.length){
            res.add(new LinkedList(track));
        }
        for (int i = 0; i < nums.length; i++) {
            if (use[i]){
                continue;
            }
            track.add(nums[i]);
            use[i] = true;
            backtrace(nums,use,track);
        track.removeLast();
        use[i]=false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
