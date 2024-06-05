//给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。 
//
// 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。 
//
// 
//
// 示例 1: 
//
// 
//输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出: [["bat"],["nat","tan"],["ate","eat","tea"]] 
//
// 示例 2: 
//
// 
//输入: strs = [""]
//输出: [[""]]
// 
//
// 示例 3: 
//
// 
//输入: strs = ["a"]
//输出: [["a"]] 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 10⁴ 
// 0 <= strs[i].length <= 100 
// strs[i] 仅包含小写字母 
// 
//
// Related Topics数组 | 哈希表 | 字符串 | 排序 
//
// 👍 1909, 👎 0 
//
//
//
//


package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            int[] lowers = new int[26];
            for (char c : charArray) {
                lowers[c-'a']++;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < lowers.length; i++) {
                int lower = lowers[i];
                if (lower != 0) {
//                    这里要分清是哪个字母 这个加要的是排序
                    sb.append(i + 'a');
//                    这里是次数
                    sb.append(lower);

                }
            }
            String string = sb.toString();

            if (hashMap.containsKey(string)){
                hashMap.get(string).add(str);
            }else{
                List<String> strings = new ArrayList<>();
                strings.add(str);
                hashMap.put(string,strings);
            }
        }
       return hashMap.values().stream().toList();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

