//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
//
// Related Topics哈希表 | 字符串 | 排序 
//
// 👍 921, 👎 0 
//
//
//
//


package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        for (char c : charArray) {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for (char c : charArray1) {
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            Character k = entry.getKey();
            Integer v = entry.getValue();
            if (!Objects.equals(map2.get(k), v)) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

