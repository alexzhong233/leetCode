import java.util.HashSet;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxVowels(String s, int k) {
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                count++;
            }
        }
        res = count;
        for (int left = 0, right = k; right < s.length() ; left++, right++) {
            if (set.contains(s.charAt(right))){
                count++;
            }
            if (set.contains(s.charAt(left))){
                count--;
            }
            res = Math.max(count, res);

        }
//        for (int left=0,right=k;right<s.length()+1;left++,right++){
//            String substring = s.substring(left, right);
//            int count =0;
//            for (int i = 0; i < substring.length(); i++) {
//                if (set.contains(substring.charAt(i))){
//                    count++;
//                }
//            }
//            res=Math.max(count,res);
//        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
