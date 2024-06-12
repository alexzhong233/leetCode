
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
//        boolean norem = false;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right) && norem) {
//                return false;
//            } else if (s.charAt(left) != s.charAt(right)) {
//                if (s.charAt(left + 1) == s.charAt(right)||left+1>right) {
//                    left++;
//                    norem = true;
//                } else if (s.charAt(right - 1) == s.charAt(left)||left+1>right) {
//                    right--;
//                    norem = true;
//                } else {
//                    return false;
//                }
//            } else {
//                left++;
//                right--;
//            }
//        }
        while (left < right) {
          if (s.charAt(left) != s.charAt(right) ) {
          return isPalindrome(s,left+1,right)||isPalindrome(s,left,right-1);
          }
          left++;
          right--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
