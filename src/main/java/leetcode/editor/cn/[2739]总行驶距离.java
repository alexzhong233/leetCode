
package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if (mainTank < 5) {
            return mainTank * 10;
        }
        int road = 0;
        while (mainTank > 4 && additionalTank > 0) {
            mainTank -= 5;
            mainTank += 1;
            additionalTank -= 1;
            road += 50;
        }
        return road + mainTank * 10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
