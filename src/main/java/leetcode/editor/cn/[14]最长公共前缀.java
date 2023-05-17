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
// Related Topics 字典树 字符串 👍 2781 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (int i = strs[0].length(); i > 0; i--) {
            String substring = strs[0].substring(0, i);
            boolean bo = false;
            for (int i1 = 0; i1 < strs.length; i1++) {
                if (strs[i1].startsWith(substring)) {
                    bo = true;
                } else {
                    bo = false;
                    break;
                }
            }
            if (bo) {
                return substring;
            }
        }
        return "";
    }
}
//leetcode submit region end(Prohibit modification and deletion)
