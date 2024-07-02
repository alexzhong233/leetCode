
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String smallestString(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]!='a'){
                while (i<charArray.length&&charArray[i]!='a'){
                    charArray[i]--;
                    i++;
                }
                return new String(charArray);
            }
        }
        charArray[charArray.length-1]='z';
        return new String(charArray);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
