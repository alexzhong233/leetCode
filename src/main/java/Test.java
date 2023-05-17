public class Test {
    public static void main(String[] args) {
        int[] ints = new int[1];
        ints[0]=9;
        plusOne(ints );
        }
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        if (digits[length-1]==9){
            digits[length - 1]=0;
            for (int i =length-2 ; i <length&&i>-1; i--) {
                if (digits[i]==9){
                    digits[i] =0;
                }else{
                    digits[i] = digits[i]+1;
                    return digits;
                }
                if (digits[0]==9){
                    int[] ints = new int[length+1];
                    ints[0]=1;
                    return ints;

                }
            }
        }
        digits[length-1]=digits[length - 1]+1;
        return digits;
    }
}
