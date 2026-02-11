
package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.cn.utils.TreeNode;
import leetcode.editor.cn.utils.ListNode;


public class SubdomainVisitCount {
    public static void main(String[] args) {
        Solution solution = new SubdomainVisitCount().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> times = new HashMap<>();
            for (String cpdomain : cpdomains) {
                String[] split = cpdomain.split(" ");
                int t = Integer.parseInt(split[0]);
                String[] url = split[1].split("\\.");
                for (int i = 0; i < url.length; i++) {
                    StringBuilder sb = new StringBuilder().append(url[i]);
                    for (int i1 = i+1; i1 < url.length; i1++) {
                        sb.append(".");
                        sb.append(url[i1]);
                    }
                    String domain = sb.toString();
                    times.put(domain, times.getOrDefault(domain,0)+t);
                }
            }
            List<String> ls = new ArrayList<>();
            times.forEach((k,v)->{
                String tmp = v+" "+k;
                ls.add(tmp);
                    }

            );
            return ls;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}