//给你一个整数数组 matches 其中 matches[i] = [winneri, loseri] 表示在一场比赛中 winneri 击败了 
//loseri 。 
//
// 返回一个长度为 2 的列表 answer ： 
//
// 
// answer[0] 是所有 没有 输掉任何比赛的玩家列表。 
// answer[1] 是所有恰好输掉 一场 比赛的玩家列表。 
// 
//
// 两个列表中的值都应该按 递增 顺序返回。 
//
// 注意： 
//
// 
// 只考虑那些参与 至少一场 比赛的玩家。 
// 生成的测试用例保证 不存在 两场比赛结果 相同 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
//输出：[[1,2,10],[4,5,7,8]]
//解释：
//玩家 1、2 和 10 都没有输掉任何比赛。
//玩家 4、5、7 和 8 每个都输掉一场比赛。
//玩家 3、6 和 9 每个都输掉两场比赛。
//因此，answer[0] = [1,2,10] 和 answer[1] = [4,5,7,8] 。
// 
//
// 示例 2： 
//
// 
//输入：matches = [[2,3],[1,3],[5,4],[6,4]]
//输出：[[1,2,5,6],[]]
//解释：
//玩家 1、2、5 和 6 都没有输掉任何比赛。
//玩家 3 和 4 每个都输掉两场比赛。
//因此，answer[0] = [1,2,5,6] 和 answer[1] = [] 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= matches.length <= 10⁵ 
// matches[i].length == 2 
// 1 <= winneri, loseri <= 10⁵ 
// winneri != loseri 
// 所有 matches[i] 互不相同 
// 
//
// Related Topics数组 | 哈希表 | 计数 | 排序 
//
// 👍 31, 👎 0 
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
    public List<List<Integer>> findWinners(int[][] matches) {
//        List<List<Integer>> l=new ArrayList<>();
//        HashMap<Integer,Integer> hm=new HashMap<>();
//        for (int i=0;i< matches.length;i++){
//            hm.put(matches[i][0],hm.getOrDefault(matches[i][0],0));
//            hm.put(matches[i][1],hm.getOrDefault(matches[i][1],0)-1);
//        }
//        List <Integer>l1=new ArrayList<>();
//        List <Integer>l2=new ArrayList<>();
//        for (int i:hm.keySet()){
//            if(hm.get(i)==0){
//                l1.add(i);
//            }else if (hm.get(i)==-1){
//                l2.add(i);
//            }
//        }
//        Collections.sort(l1);
//        Collections.sort(l2);
//        l.add(l1);
//        l.add(l2);
//        return l;
        HashSet<Integer> winner = new HashSet<>();
        HashSet<Integer> loser = new HashSet<>();
        HashSet<Integer> l1 = new HashSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            winner.add(matches[i][0]);
            loser.add(matches[i][1]);
            if (hashMap.get(matches[i][1])==null) {
                hashMap.put(matches[i][1],1);
                l1.add(matches[i][1]);
            }else{
                   l1.remove(matches[i][1]);
            }
        }
        loser.forEach(winner::remove);
        List<Integer> list = new ArrayList<>(winner.stream().toList());
        List<Integer> list1 = new ArrayList<>(l1.stream().toList());
        Collections.sort(list);
        Collections.sort(list1);
        ArrayList<List<Integer>> lists = new ArrayList<>();

        lists.add(list);
        lists.add(list1);
        return lists;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

