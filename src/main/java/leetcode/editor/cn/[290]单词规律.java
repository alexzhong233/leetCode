//给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。 
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。 
//
// 
//
// 示例1: 
//
// 
//输入: pattern = "abba", s = "dog cat cat dog"
//输出: true 
//
// 示例 2: 
//
// 
//输入:pattern = "abba", s = "dog cat cat fish"
//输出: false 
//
// 示例 3: 
//
// 
//输入: pattern = "aaaa", s = "dog cat cat dog"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= pattern.length <= 300 
// pattern 只包含小写英文字母 
// 1 <= s.length <= 3000 
// s 只包含小写英文字母和 ' ' 
// s 不包含 任何前导或尾随对空格 
// s 中每个单词都被 单个空格 分隔 
// 
//
// Related Topics哈希表 | 字符串 
//
// 👍 651, 👎 0 
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
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> p2s = new HashMap<>();
        Map<String,Character> s2p = new HashMap<>();
        String[] split = s.split(" ");
        char[] charArray = pattern.toCharArray();
        if (split.length!=charArray.length) return false;

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            String s1 = split[i];
            if (p2s.containsKey(c)&& !Objects.equals(p2s.get(c), s1)){
                return false;
            }
            if (s2p.containsKey(s1)&&s2p.get(s1)!=c){
                return false;
            }
            p2s.put(c,s1);
            s2p.put(s1,c);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

