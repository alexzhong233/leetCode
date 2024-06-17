
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
int left =0,sum=0;
int numt= 0,numf=0;
        char[] charArray = answerKey.toCharArray();

        for (int i = 0; i <charArray.length; i++) {
            char c = charArray[i];
            if (c=='T'){
                numt++;
            }else{
                numf++;
            }

            while (Math.min(numf,numt)>k){
                if (charArray[left]=='T'){
                    numt--;
                }else{
                    numf--;
                }
                left++;
            }
            sum=Math.max(sum,i-left+1);
        }

        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
