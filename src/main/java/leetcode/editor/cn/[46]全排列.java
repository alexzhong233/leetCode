
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public List<List<Integer>> permute(int[] nums) {
//        初始化结果
        List<List<Integer>> res = new ArrayList<>();
//        初始化路径（子集）
        List<Integer> path = new ArrayList<>();
//        used该元素是否用过了
        boolean[] used = new boolean[nums.length];
//        Arrays.fill(used, false);
        backtrace(nums, used, res, path);
        return res;
    }

    private void backtrace(int[] nums, boolean[] used, List<List<Integer>> track, List<Integer> path) {
//结束条件 应为是排列 所以是子集=nums大小
        if (path.size() == nums.length) {
//            加入后返回 进行下一次排列
            track.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
//            把没用过的元素加入子集中
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
//                判断是否储存过 这个不用 剪纸操作
//                下层搜索递归
                backtrace(nums,used,track,path);
//                返回上一层 取消用过标记
//                会空循环一次 然后直接到达上面判断 一个长度n的n+1次
                used[i] = false;
                path.remove(path.size()-1);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
