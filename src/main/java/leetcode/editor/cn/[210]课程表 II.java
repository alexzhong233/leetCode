import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        HashMap<Integer, List<Integer>> relMap = new HashMap<>();
        int[] deepCur = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int cur = prerequisites[i][0];
            int needcur = prerequisites[i][1];
            relMap.computeIfAbsent(needcur, k -> new ArrayList<>()).add(cur);
            deepCur[cur]++;
        }
        LinkedList<Integer> q = new LinkedList<>();


        for (int i = 0; i < deepCur.length; i++) {
            if (deepCur[i]==0){
                q.offer(i);
            }
        }

        ArrayList<Integer> ress = new ArrayList<>();
        while (!q.isEmpty()) {
                Integer poll = q.poll();
                ress.add(poll);
                if (relMap.get(poll)!=null){
                    for (Integer integer : relMap.get(poll)) {
                        deepCur[integer]--;
                        if (deepCur[integer]==0){
                            q.offer(integer);
                        }
                    }
            }
        }
        if (ress.size()!=numCourses){
            return new int[0];
        }
        int[] ints = new int[numCourses];
        for (int i = 0; i < ress.size(); i++) {
            ints[i]=ress.get(i);
        }
        return ints;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
