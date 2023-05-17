public class Test {
    public static void main(String[] args) {
        public boolean isPalindrome(int x) {

            char[] chars = String.valueOf(x).toCharArray();

            int length = chars.length;
            int i =0;
            while(i<length/2){
                if (chars[i] != chars[length-i-1]){
                    return false;
                }
                i++;
            }return true;
        };
    }
}
