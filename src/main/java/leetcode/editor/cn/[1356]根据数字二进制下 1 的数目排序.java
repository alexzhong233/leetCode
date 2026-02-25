//2026-02-25 14:46:50

import java.util.Arrays;
import java.util.ListResourceBundle;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortByBits(int[] arr) {
        int length = arr.length;
        int[] map = new int[length];
        for (int i = 0; i < length; i++) {
            map[i] = Integer.bitCount(arr[i])*10000000+arr[i];
        }
        Arrays.sort(map);
        for (int i = 0; i < length; i++) {
            map[i]=map[i]%10000000;
        }
return map;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
