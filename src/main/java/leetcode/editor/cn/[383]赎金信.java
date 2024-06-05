//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。 
//
// 如果可以，返回 true ；否则返回 false 。 
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：ransomNote = "a", magazine = "b"
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote 和 magazine 由小写英文字母组成 
// 
//
// Related Topics哈希表 | 字符串 | 计数 
//
// 👍 884, 👎 0 
//
//
//
//


package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] charArray = magazine.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : charArray) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] charArray1 = ransomNote.toCharArray();
        for (char c : charArray1) {
            if (map.containsKey(c)&&map.get(c)!=0){
                map.put(c,map.get(c)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

