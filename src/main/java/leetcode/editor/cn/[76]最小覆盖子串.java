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
import java.util.UnknownFormatConversionException;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {

        if (t == null || s == null || t.length() > s.length()) {
            return "";
        }
        // 记录t中每个字符出现的次数
        char[] tc = t.toCharArray();
        // 记录窗口中每个字符出现的次数
        char[] sc = s.toCharArray();
        // 记录t中每个字符出现的次数
        int[] need = new int[128];
        // 记录窗口中每个字符出现的次数
        int[] window = new int[128];
        //t中字符得次数
        for (int i = 0; i < tc.length; i++) {
            need[tc[i]]++;
        }
//        t中不同字符得数量
        int valid = 0;
        for (int i : need) {
            if (i > 0) {
                valid++;
            }
        }
        int left = 0, right = 0,    //滑动区间
                count = 0,          //完全匹配字符计数器增加
                start = 0,          //开始位置
                minLength = Integer.MAX_VALUE;

        while (right < sc.length) {
            char c = sc[right];
//            如果遇到字符c 则更新 滑动窗口中得c值计数器
            if (need[c] > 0) {
                window[c]++;

                if (window[c] == need[c]) {
//               如果字符完全匹配 完全匹配字符计数器增加
                    count++;
                }
            }
            right++;

            //当窗口全部包含后 缩小左边

            while (count == valid) {
                if (right - left < minLength) {
                    start = left;
                    minLength = right - left;
                }
                char d = sc[left];
                if (need[d] > 0) {
//                    如果滑动窗口满足了要求 则让左侧移除一个字符 这样可以让窗口继续右移
                    if (window[d] == need[d]) {
                        count--;
                    }
                    window[d]--;
                }
                left++;
            }

        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);


    }
}
//leetcode submit region end(Prohibit modification and deletion)
