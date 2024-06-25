import javax.management.MXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int bestSeqAtIndex(int[] height, int[] weight) {
//        int hlength = height.length;
//        int[][] lst = new int[hlength][2];
//        for (int i = 0; i < hlength; i++) {
//            lst[i][0]= height[i];
//            lst[i][1]=weight[i];
//        }
//        Arrays.sort(lst,(a,b)->{
//            if (a[0]==b[0]){
////                按体重排 轻的前
//                return b[1]-a[1];
//            }
////            身高 搞得在后
//            return a[0]-b[0];
//        });
////      System.out.println(Arrays.deepToString(lst));
////        int[] wLst = new int[hlength];
////        for (int i = 0; i < hlength; i++) {
////            wLst[i]=lst[i][1];
////        }
//        int[] dp = new int[hlength];
//        Arrays.fill(dp,1);
//        int maxlen = 1;
//        for (int i = 1; i < hlength; i++) {
//            for (int j = 0; j < i; j++) {
////                if (wLst[i]>wLst[j]){
//                if (lst[i][1]>lst[j][1]){
//                    dp[i]=Math.max(dp[i],dp[j]+1);
////                    System.out.println(dp[i]);
//                }
//            }
////            System.out.println(dp[i]);
//            maxlen=Math.max(maxlen,dp[i]);
//        }
//
//      return maxlen;
//    }

    public int bestSeqAtIndex(int[] height, int[] weight) {
        ArrayList<int[]> lst = new ArrayList<>();
        for (int i = 0; i < height.length; i++) {
            lst.add(new int[]{height[i],weight[i]});
        }
        lst.sort((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(lst.get(0)[1]);
        for (int i = 1; i < lst.size(); i++) {
            int h =lst.get(i)[0],w=lst.get(i)[1];
            if (w>ans.get(ans.size()-1)){
                ans.add(w);
            }else{
               int left=0,right=ans.size();
               while (left<right){
                   int mid = left+right>>1;
                   if (ans.get(mid)>=w){
                       right =mid;
                   }else{
                       left=mid+1;
                   }
               }
               ans.set(left,w);
            }
        }
        return ans.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
