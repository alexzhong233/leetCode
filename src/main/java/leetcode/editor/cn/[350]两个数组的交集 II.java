//给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现
//次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
//
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
//
// Related Topics数组 | 哈希表 | 双指针 | 二分查找 | 排序 
//
// 👍 1040, 👎 0 
//
//
//
//


package leetcode.editor.cn;
import leetcode.editor.cn.template.ListNode;
import leetcode.editor.cn.template.TreeNode;

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> n1 = new HashMap<>();
        Map<Integer,Integer> n2 = new HashMap<>();
        for(int num : nums1){
            n1.put(num,n1.getOrDefault(num,0)+1);
        }

        for(int num : nums2){
            n2.put(num,n2.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> integers = new ArrayList<>();
        n1.forEach((k,v)->{
            int sum = 0;
            if (n2.containsKey(k)){
                sum = Math.min(v,n2.get(k));
            }
            for (int i = 0; i < sum; i++) {
                integers.add(k);
            }
        });
        int[] ints = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            ints[i]=integers.get(i);
        }
        return ints;
    }
    }

//leetcode submit region end(Prohibit modification and deletion)

