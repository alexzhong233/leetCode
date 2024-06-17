

package leetcode.editor.cn;
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
//        Map<Character, Integer> s1map = new HashMap<>();
//        Map<Character, Integer> s2map = new HashMap<>();
//        for (int i = 0; i < s1.length(); i++) {
//            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
//            char c = s2.charAt(i);
//            s2map.put(c, s2map.getOrDefault(c, 0) + 1);
//        }
//        boolean is = true;
//        for (int left = 1, right = 1 + s1.length(); right < s2.length(); right++, left++) {
//            is = true;
////            计算上次是否能包含
//            for (Character c : s1map.keySet()) {
//                if (s2map.get(c) == null || !Objects.equals(s2map.get(c), s1map.get(c))) {
//                    is = false;
//                    break;
//                }
//            }
//            if (is) {
//                return true;
//            }
//            s2map.put(s2.charAt(left - 1), s2map.getOrDefault(s2.charAt(left - 1),0) - 1);
//            s2map.put(s2.charAt(right), s2map.getOrDefault(s2.charAt(right), 0) + 1);
//        }
//        return false;
//    }}
        int[] need = new int[26];
        for (char c : s1.toCharArray()) {
            need[c-'a']++;
        }
        int[] window = new int[26];
        int start =0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            window[c-'a']++;
            if (isSame(window,need)){
                return true;
            }
            if (i>=s1.length()-1){
                char c1 = s2.charAt(start);
                window[c1-'a']--;
                start++;
            }
        }
        return false;
    }
    boolean isSame (int[] a, int [] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

