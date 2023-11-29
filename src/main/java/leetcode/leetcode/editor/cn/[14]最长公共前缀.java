//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字典树 字符串 👍 3007 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String str = strs[0];
        String s = findMinLen(strs);
        for (String string : strs) {
            while (!string.startsWith(s)) {
                if (s.length() == 0) return "";
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;

    }
    public String findMinLen(String[] strs) {
        String minStr = strs[0];
        for (String string : strs) {
            if (string.length() < minStr.length()) {
                minStr = string;
            }
        }
        return minStr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
