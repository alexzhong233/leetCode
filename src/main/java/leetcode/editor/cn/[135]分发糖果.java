import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {
int[] candys = new int[ratings.length];
        Arrays.fill(candys,1);
        for (int i =1; i < ratings.length; i++) {
            if (ratings[i]>ratings[i-1]){
                candys[i]=candys[i-1]+1;
            }
        }
    int res = candys[ratings.length-1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i]>ratings[i+1]){
                candys[i]=Math.max(candys[i+1]+1,candys[i]);
            }
            res+=candys[i];
        }
return res;

    }

}
//leetcode submit region end(Prohibit modification and deletion)
