
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count =0;
        for (int left =0,right=k;right<s.length()+1;left++,right++){
            String substring = s.substring(left, right);
            int i = Integer.parseInt(substring);
            if (i!=0&&num%i==0){
                count++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
