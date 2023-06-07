//给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。 
//
// 
//
// 示例 1： 
//
// 
//输入:a = "11", b = "1"
//输出："100" 
//
// 示例 2： 
//
// 
//输入：a = "1010", b = "1011"
//输出："10101" 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a 和 b 仅由字符 '0' 或 '1' 组成 
// 字符串如果不是 "0" ，就不含前导零 
// 
//
// Related Topics 位运算 数学 字符串 模拟 👍 1031 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public String addBinary(String a, String b) {
//return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
//    }
        public String addBinary(String a, String b) {
StringBuffer ans = new StringBuffer();
int n =Math.max(a.length(),b.length());
int carry =0;
            for (int i = 0; i < n; i++) {
                carry+= i<a.length()?(a.charAt(a.length()-1-i)-'0'):0;
                //char -0 是将字符转化为数字
                carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
                ans.append((char) (carry % 2 + '0'));
                carry /= 2;
            }
            if (carry>0){
                ans.append('1');
            }ans.reverse();
            return ans.toString();
       }
}
//leetcode submit region end(Prohibit modification and deletion)
