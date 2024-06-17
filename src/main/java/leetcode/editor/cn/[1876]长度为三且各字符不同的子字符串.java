import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length()<3){return 0;}
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (map.size()==3){
            count++;
        }
        for (int left = 0, right = 3; right < s.length(); left++, right++) {
            Character ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            Character ch1 = s.charAt(left);
            map.put(ch1, map.getOrDefault(ch1, 0) - 1);
            if (map.get(ch1)<=0){
                map.remove(ch1);
            }
            if (map.size()==3){
                count++;
            }
        }

        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
