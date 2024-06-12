
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
int left =0,right= height.length-1;
int sum =0;
//收缩时机？
        while (left<right){
            int l = height[left];
            int r = height[right];
            int length = right-left;
            int high = Math.min(l,r);
            sum=Math.max(length*high,sum);
//           短板找高板
            if (high==l){
                left++;
            }else {
                right--;
            }
        }
return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
