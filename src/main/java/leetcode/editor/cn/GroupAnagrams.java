
package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new GroupAnagrams().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] charArray = str.toCharArray();
//                26哥字母
                int[] lower = new int[26];
                for (char c : charArray) {
                    lower[c-'a']++;
                }
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    int low = lower[i];
                    if (low!=0){
                        stringBuilder.append((char)i+'a');
                        stringBuilder.append(low);
                    }
                }
                String string = stringBuilder.toString();
                if (map.containsKey(string)){
                    map.get(string).add(str);
                }else{
                    map.computeIfAbsent(string,k->new ArrayList<>()).add(str);
                }
            }
            return map.values().stream().toList();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}