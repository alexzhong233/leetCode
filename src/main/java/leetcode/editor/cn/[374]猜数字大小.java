
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 * 1 if num is lower than the picked number
 * otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n ;
        while (left < right) {
            long tmp = (long)left + right >>1;
            int mid = (int) tmp;
            int i = guess(mid);
            if (i == 1) {
                left = mid + 1;
            } else if (i==-1){
                right = mid;
            }else{
                return mid;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
