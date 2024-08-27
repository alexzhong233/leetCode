
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;


public class NumbersWithSameConsecutiveDifferences {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] numsSameConsecDiff(int n, int k) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 1; i <= 9; i++) {
                bt(n,k,new StringBuilder().append(i),res);
            }

            return res.stream().mapToInt(Integer::valueOf).toArray();}

    void bt(int n,int k,StringBuilder sb,  ArrayList<Integer> res){
        if (sb.length()==n){
            res.add(Integer.parseInt(sb.toString()));
            return;
        }
        int i1 = sb.charAt(sb.length() - 1) - '0';
        for (int i = 0; i <= 9; i++) {
          if (Math.abs(i1-i)==k){
            bt(n,k,new StringBuilder(sb).append(i),res);
          }
        }

    }}
//leetcode submit region end(Prohibit modification and deletion)

}