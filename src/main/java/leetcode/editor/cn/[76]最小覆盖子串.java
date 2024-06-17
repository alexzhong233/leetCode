//给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。 
//
// 
//
// 注意： 
//
// 
// 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。 
// 如果 s 中存在这样的子串，我们保证它是唯一的答案。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ADOBECODEBANC", t = "ABC"
//输出："BANC"
//解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
// 
//
// 示例 2： 
//
// 
//输入：s = "a", t = "a"
//输出："a"
//解释：整个字符串 s 是最小覆盖子串。
// 
//
// 示例 3: 
//
// 
//输入: s = "a", t = "aa"
//输出: ""
//解释: t 中两个字符 'a' 均应包含在 s 的子串中，
//因此没有符合条件的子字符串，返回空字符串。 
//
// 
//
// 提示： 
//
// 
// m == s.length 
// n == t.length 
// 1 <= m, n <= 10⁵ 
// s 和 t 由英文字母组成 
// 
//
// 
//进阶：你能设计一个在 
//o(m+n) 时间内解决此问题的算法吗？
//
// Related Topics哈希表 | 字符串 | 滑动窗口 
//
// 👍 2894, 👎 0 
//
//
//
//

package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.io.FileFilter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UnknownFormatConversionException;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        int left = 0;
        String res = "";
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            tmap.put(key, tmap.getOrDefault(key, 0) + 1);
        }
        boolean is = true;
        for (int i = 0; i < s.length(); i++) {
            is = true;
            char key = s.charAt(i);
            smap.put(key, smap.getOrDefault(key, 0) + 1);
//            便利是否达到要求
            for (Character c : tmap.keySet()) {
                if (smap.get(c) == null || smap.get(c) < tmap.get(c)) {
                    is = false;
//                 变量   continue;
                }
            }
//达到要求
            while (is) {
                int l = i - left + 1;
                length = Math.min(l, length);
                if (length == l) {
                    res = s.substring(left, i + 1);
                }
                char ch = s.charAt(left);
                smap.put(ch, smap.get(ch) - 1);
                left++;
                for (Character c : tmap.keySet()) {
                    if (smap.get(c) == null || smap.get(c) < tmap.get(c)) {
                        is = false;
//                 变量   continue;
                    }
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
