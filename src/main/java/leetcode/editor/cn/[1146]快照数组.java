
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//leetcode submit region begin(Prohibit modification and deletion)
class SnapshotArray {
    private Map<Integer, TreeMap<Integer,Integer>> map;
 int count ;
    public SnapshotArray(int length) {
map = new HashMap<>(0);
count=0;
        for (int i = 0; i < length; i++) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(0,0);
        map.put(i,treeMap);
        }
    }
    
    public void set(int index, int val) {
        TreeMap<Integer, Integer> tree = map.get(index);
        tree.put(count,val);
    }
    
    public int snap() {
        return count++;
    }
    
    public int get(int index, int snap_id) {
        TreeMap<Integer, Integer> tree = map.get(index);
        return tree.floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
//leetcode submit region end(Prohibit modification and deletion)
