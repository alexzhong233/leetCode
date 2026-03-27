2026-03-13 10:23:02	

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private static final double EPS = 1e-7;
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int maxWorkTimes =0 ;
        //        判断最墨迹的工人 作为二分的最大数
        for (int t : workerTimes){
            maxWorkTimes = Math.max(maxWorkTimes,t);
        }

        long l = 1;
        long r = (long)maxWorkTimes * mountainHeight * (mountainHeight+1)/2;
        long ans  = 0;

        while (l<=r){
        long mid =(1+r)>>1;
        long cnt = 0;
        for (int t :workerTimes){
            long work = mid/t;
            long k = (long)((-1.0+Math.sqrt(1+work*8))/2+EPS);
            cnt+=k;
        }
        if (cnt>=mountainHeight){
            ans= mid;
            r=mid-1;
        }else{
            l=mid+1;
        }
        }
return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
