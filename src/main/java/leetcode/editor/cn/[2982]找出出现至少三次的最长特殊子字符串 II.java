//给你一个仅由小写英文字母组成的字符串 s 。 
//
// 如果一个字符串仅由单一字符组成，那么它被称为 特殊 字符串。例如，字符串 "abc" 不是特殊字符串，而字符串 "ddd"、"zz" 和 "f" 是特殊字
//符串。 
//
// 返回在 s 中出现 至少三次 的 最长特殊子字符串 的长度，如果不存在出现至少三次的特殊子字符串，则返回 -1 。 
//
// 子字符串 是字符串中的一个连续 非空 字符序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "aaaa"
//输出：2
//解释：出现三次的最长特殊子字符串是 "aa" ：子字符串 "aaaa"、"aaaa" 和 "aaaa"。
//可以证明最大长度是 2 。
// 
//
// 示例 2： 
//
// 
//输入：s = "abcdef"
//输出：-1
//解释：不存在出现至少三次的特殊子字符串。因此返回 -1 。
// 
//
// 示例 3： 
//
// 
//输入：s = "abcaba"
//输出：1
//解释：出现三次的最长特殊子字符串是 "a" ：子字符串 "abcaba"、"abcaba" 和 "abcaba"。
//可以证明最大长度是 1 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= s.length <= 5 * 10⁵ 
// s 仅由小写英文字母组成。 
// 
//
// Related Topics哈希表 | 字符串 | 二分查找 | 计数 | 滑动窗口 
//
// 👍 17, 👎 0 
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

        public int maximumLength(String s) {
            Count[] arr = new Count[26]; // 按26个字母维护一个数组
            for (int i = 0; i < 26; i++) {
                arr[i] = new Count();
            }

            int ans = 0, i = 0;
            // 统计每个连续重复字符出现的个数
            while (i < s.length()) {
                int j = i + 1;
                // 双指针计算当前连续长度
                while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                    j++;
                }
                int length = j - i;
                char c = s.charAt(i);
                Count count = arr[c - 'a'];
                Map<Integer, Integer> map = count.map;
                map.put(length, map.getOrDefault(length, 0) + 1); // 更新出现次数
                count.change(length); // 更新最大长度、次大长度
                ans = Math.max(ans, count.getMaxLength()); // 更新结果
                i = j;
            }

            return ans == 0 ? -1 : ans; // 最终答案为0时，赋值为-1
        }

        // 自定义类
        public class Count {
            private Map<Integer, Integer> map; // key:连续长度，value: 出现次数
            private int max = 0, secondMax = 0; // 最大长度、次大长度

            public Count() {
                map = new HashMap<>();
            }

            // 更新最大长度和次大长度
            public void change(int len) {
                if (len > max) {
                    secondMax = max;
                    max = len;
                } else if (len < max && len > secondMax) {
                    secondMax = len;
                }
            }

            // 获得结果
            public int getMaxLength() {
                Integer maxCount = map.getOrDefault(max, 0);
                if (maxCount >= 3) {
                    return max;
                } else if (maxCount > 1) {
                    return max - 1;
                }

                return Math.max(secondMax, max - 2);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

