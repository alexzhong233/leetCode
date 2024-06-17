import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxF = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            int f = fruits[i];
            map.put(f, map.getOrDefault(f, 0) + 1);
            while (map.size() == 3) {

                int df = fruits[left];
                map.put(df, map.get(df) - 1);
                if (map.get(df) == 0) {
                    map.remove(df);

                }
                left++;
            }
maxF= Math.max(maxF,i-left+1);
        }
        return maxF;

    }

}
//leetcode submit region end(Prohibit modification and deletion)
