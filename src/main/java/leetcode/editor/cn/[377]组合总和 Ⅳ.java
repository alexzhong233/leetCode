
package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //记忆化搜索
    Map<Integer,Integer> map =new HashMap<>();


    public int combinationSum4(int[] nums, int target) {
return backtrack(nums, target);
    }

    private int backtrack(int[] nums,int remains){

        if (remains== 0) {
            return 1;
        }

if(map.containsKey(remains)){
    return  map.get(remains);
}

int res =0;

        for (int i = 0; i < nums.length; i++) {
            if (remains>=nums[i]) {
                res+=backtrack(nums, remains-nums[i]);
            }
        }
        map.put(remains,res);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
