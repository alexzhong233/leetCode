import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int length;
    boolean[] checked;

//    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        length = rooms.size();
//      checked = new boolean[length];
//        dfs(0,rooms);
//        for (boolean b : checked) {
//            if (!b){
//                return false;
//            }
//        }
//        return true;
//    }

    private void dfs(int i, List<List<Integer>> rooms) {

        checked[i] = true;
        for (Integer integer : rooms.get(i)) {
            if (!checked[integer]){
                dfs(integer,rooms);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        length = rooms.size();
        checked = new boolean[length];
        LinkedList<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()){
            Integer poll = q.poll();
            checked[poll]=true;
            for (Integer i : rooms.get(poll)) {
                if (!checked[i]){
                q.add(i);}
            }
        }
        for (boolean b : checked) {
            if (!b){
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
