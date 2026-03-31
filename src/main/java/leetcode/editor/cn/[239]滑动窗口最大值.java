import java.util.ArrayList;
import java.util.LinkedList;2026-03-27 11:16:11

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        MonotonicQueue window = new MonotonicQueue();
        for (int i = 0; i < nums.length; i++) {
//            窗口没有达到长度的情况下
            if (i<k-1){
                window.push(nums[i]);
            }else{
//                窗口已经达到长度 存入值，

                window.push(nums[i]);
                res.add(window.max());
                window.pop(nums[i-k+1]);

            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i]=res.get(i);
        }
        return arr;

    }

}

class MonotonicQueue {
    LinkedList<Integer> q  = new LinkedList<Integer>();

    public void push(int n ){

//        当q最先进入的比n小 把最先的去掉（在有数据的情况下一直是最先组最小的）
        while(!q.isEmpty()&&q.getLast()<n){
            q.pollLast();
        }
        q.addLast(n);

    }

    public int max(){
//        最大的
//        System.out.println(q.getFirst());
        return q.getFirst();
    }

    public void pop(int n){

        if (n==q.getFirst()){
            q.pollFirst();
        }

    }
//    public void log(){
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < q.size(); i++) {
//           sb.append(q.get(i)+" ");
//        }
//        System.out.println(sb.toString());
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
