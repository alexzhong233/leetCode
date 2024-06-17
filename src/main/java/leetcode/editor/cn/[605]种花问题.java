
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int index = 0;
        int count = 0;
        if (flowerbed.length == 1) {
            count = flowerbed[index] == 1 ? 0 : 1;
        } else {
            while (index < flowerbed.length) {
//    不是最后一位和第一位的情况下
                if (index != flowerbed.length - 1 && index != 0) {
                    if (flowerbed[index - 1] == 0 && flowerbed[index] == 0 && flowerbed[index + 1] == 0) {
                        flowerbed[index] = 1;
                        count++;
                    }
                } else if (index == 0) {
                    if (flowerbed[index] == 0 && flowerbed[index + 1] == 0) {
                        flowerbed[index] = 1;
                        count++;
                    }
                } else if (index == flowerbed.length - 1) {
                    if (flowerbed[index] == 0 && flowerbed[index - 1] == 0) {
                        flowerbed[index] = 1;
                        count++;
                    }
                }

                index++;
            }
        }
        return count >= n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
