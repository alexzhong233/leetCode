import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
//        int ans =0;
        int left = 1, right = piles[piles.length - 1] + 1;
        while (left<right) {
            int mid = left + right >>1;
            int hour = sumhour(piles, mid);
//            System.out.println("speed"+mid);
//            System.out.println("hour"+hour);
            if (hour <= h) {
//                往左边动
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    private int sumhour(int[] piles, int speed) {
        int sum =0;
        for (int i = 0; i < piles.length; i++) {
            if (speed>piles[i]){
                sum+=1;
            } else if (piles[i]%speed!=0) {
                sum=sum+1+piles[i]/speed;
            }else{
                sum+=piles[i]/speed;
            }
        }
        return  sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
