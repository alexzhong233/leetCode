//给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。 
//
// 换句话说，s1 的排列之一是 s2 的 子串 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s1 = "ab" s2 = "eidbaooo"
//输出：true
//解释：s2 包含 s1 的排列之一 ("ba").
// 
//
// 示例 2： 
//
// 
//输入：s1= "ab" s2 = "eidboaoo"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s1.length, s2.length <= 10⁴ 
// s1 和 s2 仅包含小写字母 
// 
//
// Related Topics哈希表 | 双指针 | 字符串 | 滑动窗口 
//
// 👍 1004, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }
//        滑动窗口开始
        char[] sub = s1.toCharArray();
        char[] full = s2.toCharArray();

        int left = 0, right = 0;
        // 记录t中每个字符出现的次数
        int[] need = new int[128];
        // 记录窗口中每个字符出现的次数
        int[] window = new int[128];
//        统计字符次数
        for (int i = 0; i < sub.length; i++) {
            need[sub[i]]++;
        }
//        统计有几个字符
        int vaild = 0;

        for (int i : need) {
            if (i > 0) {
                vaild++;
            }
        }
        int count = 0;
        while (right < full.length) {
            char i = full[right];
            if (need[i] > 0) {
                window[i]++;
                if (window[i] == need[i]) {
                    count++;
                }
            }
            right++;
            while (count == vaild) {
                char l = full[left];
                if (need[l] > 0) {
                    if (right - left == s1.length()) {
                        return true;
                    } else {
                        if (window[l] == need[l]) {
                            count--;
                        }
                        window[l]--;
                    }
                }
                left++;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

