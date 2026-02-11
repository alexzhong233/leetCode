package leetcode.editor.cn;//给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以 字符串形式返回小数 。
//
// 如果小数部分为循环小数，则将循环的部分括在括号内。 
//
// 如果存在多个答案，只需返回 任意一个 。 
//
// 对于所有给定的输入，保证 答案字符串的长度小于 10⁴ 。 
//
// 
//
// 示例 1： 
//
// 
//输入：numerator = 1, denominator = 2
//输出："0.5"
// 
//
// 示例 2： 
//
// 
//输入：numerator = 2, denominator = 1
//输出："2"
// 
//
// 示例 3： 
//
// 
//输入：numerator = 4, denominator = 333
//输出："0.(012)"
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= numerator, denominator <= 2³¹ - 1 
// denominator != 0 
// 
//
// Related Topics 哈希表 数学 字符串 👍 540 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long numeratorLong = (long) numerator;
        long denominatorLong = (long) denominator;
        if (numeratorLong % denominatorLong == 0) {
            return String.valueOf(numeratorLong / denominatorLong);
        }
//        如果没有余数则直接完事、
//       这里的意思是只有一个为负另一个不是才加-号 如果使用|则两个为负也会加-号
        StringBuffer sb = new StringBuffer();

//        整数
        if (numeratorLong < 0 ^ denominatorLong < 0) {
            sb.append('-');
        }
        numeratorLong = Math.abs(numeratorLong);
        denominatorLong = Math.abs(denominatorLong);
        long intpart = numeratorLong / denominatorLong;
        sb.append(intpart);
        sb.append(".");

//        小数
        StringBuffer fractionPart = new StringBuffer();
        Map<Long, Integer> remainderIndexMap = new HashMap<Long, Integer>();
        long remind = numeratorLong % denominatorLong;
        int index = 0;
        while (remind != 0 && !remainderIndexMap.containsKey(remind)) {
            remainderIndexMap.put(remind, index);
            remind *= 10;
            fractionPart.append(remind / denominatorLong);
            remind %= denominatorLong;
            index++;
        }
//        循环
        if (remind != 0) {
            int insertIndex = remainderIndexMap.get(remind);
            fractionPart.insert(insertIndex, '(');
            fractionPart.append(')');
        }
        sb.append(fractionPart);
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
