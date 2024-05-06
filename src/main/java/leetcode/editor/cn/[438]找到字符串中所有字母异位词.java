//给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。 
//
// 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "cbaebabacd", p = "abc"
//输出: [0,6]
//解释:
//起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
//起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
// 
//
// 示例 2: 
//
// 
//输入: s = "abab", p = "ab"
//输出: [0,1,2]
//解释:
//起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
//起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
//起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, p.length <= 3 * 10⁴ 
// s 和 p 仅包含小写字母 
// 
//
// Related Topics哈希表 | 字符串 | 滑动窗口 
//
// 👍 1437, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> start = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return start;
        }
        char[] full = s.toCharArray();
        char[] sub = p.toCharArray();

        int left = 0, right = 0;

        int[] window = new int[128];
        int[] need = new int[128];


        for (int i = 0; i < sub.length; i++) {
            need[sub[i]]++;
        }

        int vaild = 0;

        for (int i : need) {
            if (i > 0) {
                vaild++;
            }
        }
        int count = 0;

        while (right < full.length) {
            char c = full[right];
            if (need[c]>0){
                window[c]++;
                if (need[c]==window[c]){
                    count++;
                }
            }
            right++;
            while (count==vaild){
                char l =full[left];
                if (need[l]>0){
                    if (right-left==sub.length){
                        start.add(left);
                    }
                        if (need[l]==window[l]){
                            count--;
                        }
                        window[l]--;

                }
                left++;
            }
        }
        return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

