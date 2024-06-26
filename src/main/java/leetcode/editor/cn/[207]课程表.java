import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        构建接邻表 当两数接邻时 存入该表 意思是学value必须先把key学了
        Map<Integer, List<Integer>> adjList = new HashMap<>();
//        课程的学习次数长度数组 总长度为课程数
        int[] indgree = new int[numCourses];
//        接邻表构建
        for (int[] prerequisite : prerequisites) {
            int a = prerequisite[0];
            int b = prerequisite[1];
//把对应的课程放进去 先学的
            adjList.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
//           a要求的门数
            indgree[a]++;
        }
        LinkedList<Integer> q = new LinkedList<>();
//        学习次数为0 说明他们不是任何一个的限制条件
        for (int i = 0; i < numCourses; i++) {
            if (indgree[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
//            看他的可学课程
            if (adjList.containsKey(cur)) {
                for (Integer i : adjList.get(cur)) {
//a的学习门数--
                    indgree[i]--;
//                    a没有限制条件了 a可以学 可以遍历他了
                    if (indgree[i] == 0) {
                        q.offer(i);
                    }
                }
            }
        }
//当所有的都能满足 就是完成学习
        for (int i : indgree) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
