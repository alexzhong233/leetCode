//你有一台电脑，它可以 同时 运行无数个任务。给你一个二维整数数组 tasks ，其中 tasks[i] = [starti, endi,
//durationi] 表示第 i 个任务需要在 闭区间 时间段 [starti, endi] 内运行 durationi 个整数时间点（但不需要连续）。
//
// 当电脑需要运行任务时，你可以打开电脑，如果空闲时，你可以将电脑关闭。
//
// 请你返回完成所有任务的情况下，电脑最少需要运行多少秒。
//
//
//
// 示例 1：
//
// 输入：tasks = [[2,3,1],[4,5,1],[1,5,2]]
//输出：2
//解释：
//- 第一个任务在闭区间 [2, 2] 运行。
//- 第二个任务在闭区间 [5, 5] 运行。
//- 第三个任务在闭区间 [2, 2] 和 [5, 5] 运行。
//电脑总共运行 2 个整数时间点。
//
//
// 示例 2：
//
// 输入：tasks = [[1,3,2],[2,5,3],[5,6,2]]
//输出：4
//解释：
//- 第一个任务在闭区间 [2, 3] 运行
//- 第二个任务在闭区间 [2, 3] 和 [5, 5] 运行。
//- 第三个任务在闭区间 [5, 6] 运行。
//电脑总共运行 4 个整数时间点。
//
//
//
//
// 提示：
//
//
// 1 <= tasks.length <= 2000
// tasks[i].length == 3
// 1 <= starti, endi <= 2000
// 1 <= durationi <= endi - starti + 1
//
//
// Related Topics栈 | 贪心 | 数组 | 二分查找 | 排序
//
// 👍 46, 👎 0
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinimumTime(int[][] tasks) {
//        结果计数
        int res = 0;
//        依据时间节点排序
        Arrays.sort(tasks, (s,t)->s[0]-t[0]);
        int index = 0;
        List<int[]> handlings = new ArrayList<>();
//        最大时间段
        for(int i=1;i<=2000;i++){
//            将每个时间段内添加任务底标
            while(index<tasks.length && tasks[index][0]==i){
                handlings.add(tasks[index++]);
            }
            //此时间点是否不得不运行
            boolean toRun = false;
            for(int[] curr:handlings){
                if(curr[1]-i <= curr[2]-1){
                    //如果有一个任务的剩余时间点小于等于待处理任务个数，则此时间点必须运行一次
                    toRun = true;
                    break;
                }
            }
            if(toRun){
                //此时间点必须运行，总运行时间点加一，并且每个队列中的task的待处理任务个数减一
                res++;
                Iterator<int[]> it = handlings.iterator();
                while(it.hasNext()){
                    int[] curr =it.next();
                    curr[2] = curr[2] - 1;
                    if(curr[2]==0){
                        //如果此task待处理任务个数为0，则处理完毕，将其移出队列
                        it.remove();
                    }
                }
            }

        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

