//public class Test66 {
//    public static void main(String[] args) {
//        int[] ints = {9, 8, 9};
//        for (int i : (plusOne(ints))) {
//            System.out.println(i);
//        }
//        public static int[] plusOne ( int[] digits){
//
//            int length = digits.length;
//
//            if (length == 1 && digits[0] == 9) {
//                return new int[]{1, 0};
//            }
//
//            for (int i = length - 1; i < length && i >= 0; i--) {
//                if (digits[i] >= 9) {
//                    if (i == 0 && digits[i] > 9) {
//                        int[] ints = new int[length + 1];
//                        ints[0] = 1;
//                        ints[1] = digits[0] - 10;
//                        System.arraycopy(digits, 1, ints, 2, digits.length - 1);
//                        return ints;
//                    } else if (i == 0) {
//                        return digits;
//                    } else {
//                        digits[i] = digits[i] - 9;
//                        digits[i - 1] = digits[i - 1] + 1;
//                    }
//                } else {
//                    digits[i] = digits[i] + 1;
//                    return digits;
//                }
//
//            }
//
//        }
//
//    }
//
//
//}
//}
