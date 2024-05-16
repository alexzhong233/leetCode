//给定一个整数 n 和一个 无重复 黑名单整数数组 blacklist 。设计一种算法，从 [0, n - 1] 范围内的任意整数中选取一个 未加入 黑名单 
//blacklist 的整数。任何在上述范围内且不在黑名单 blacklist 中的整数都应该有 同等的可能性 被返回。 
//
// 优化你的算法，使它最小化调用语言 内置 随机函数的次数。 
//
// 实现 Solution 类: 
//
// 
// Solution(int n, int[] blacklist) 初始化整数 n 和被加入黑名单 blacklist 的整数 
// int pick() 返回一个范围为 [0, n - 1] 且不在黑名单 blacklist 中的随机整数 
// 
//
// 
//
// 示例 1： 
//
// 
//输入
//["Solution", "pick", "pick", "pick", "pick", "pick", "pick", "pick"]
//[[7, [2, 3, 5]], [], [], [], [], [], [], []]
//输出
//[null, 0, 4, 1, 6, 1, 0, 4]
//
//解释
//Solution solution = new Solution(7, [2, 3, 5]);
//solution.pick(); // 返回0，任何[0,1,4,6]的整数都可以。注意，对于每一个pick的调用，
//                 // 0、1、4和6的返回概率必须相等(即概率为1/4)。
//solution.pick(); // 返回 4
//solution.pick(); // 返回 1
//solution.pick(); // 返回 6
//solution.pick(); // 返回 1
//solution.pick(); // 返回 0
//solution.pick(); // 返回 4
// 
//
// 
//
// 提示: 
//
// 
// 1 <= n <= 10⁹ 
// 0 <= blacklist.length <= min(10⁵, n - 1) 
// 0 <= blacklist[i] < n 
// blacklist 中所有值都 不同 
// pick 最多被调用 2 * 10⁴ 次 
// 
//
// Related Topics数组 | 哈希表 | 数学 | 二分查找 | 排序 | 随机化 
//
// 👍 239, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int size;
    Map<Integer, Integer> map;
    public Solution(int n, int[] blacklist) {
        size = n - blacklist.length;//将数组划分为两部分，前size个为白名单，后面的为黑名单
        map = new HashMap<>();
        for(int b : blacklist) {//映射值的时候把前半部分的b与后半部分的正常值做映射。先把b加入map的目的是后面做映射的时候不会把前半部分的b与后半部分的b交换，导致出错。这样后半部分的b会直接跳过
            map.put(b, -1);
        }
        int last = n - 1;
        for(int b : blacklist) {
            if(b >= size) {//跳过b在后半段的情况
                continue;
            }
            while(map.containsKey(last)) {//找到正常值的位置，可以映射
                last--;
            }
            map.put(b, last);//做映射
            last--;
        }
    }

    public int pick() {
        int idx = (int)(Math.random() * size);
        if(map.containsKey(idx)) {//命中黑名单的值，返回对应的映射
            return map.get(idx);
        }
        return idx;
    }
}


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */
//leetcode submit region end(Prohibit modification and deletion)

