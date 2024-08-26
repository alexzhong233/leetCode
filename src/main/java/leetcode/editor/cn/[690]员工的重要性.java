//你有一个保存员工信息的数据结构，它包含了员工唯一的 id ，重要度和直系下属的 id 。 
//
// 给定一个员工数组 employees，其中： 
//
// 
// employees[i].id 是第 i 个员工的 ID。 
// employees[i].importance 是第 i 个员工的重要度。 
// employees[i].subordinates 是第 i 名员工的直接下属的 ID 列表。 
// 
//
// 给定一个整数 id 表示一个员工的 ID，返回这个员工和他所有下属的重要度的 总和。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：employees = [[1,5,[2,3]],[2,3,[]],[3,3,[]]], id = 1
//输出：11
//解释：
//员工 1 自身的重要度是 5 ，他有两个直系下属 2 和 3 ，而且 2 和 3 的重要度均为 3 。因此员工 1 的总重要度是 5 + 3 + 3 = 1
//1 。
// 
//
// 
//
// 示例 2： 
//
// 
//
// 
//输入：employees = [[1,2,[5]],[5,-3,[]]], id = 5
//输出：-3
//解释：员工 5 的重要度为 -3 并且没有直接下属。
//因此，员工 5 的总重要度为 -3。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= employees.length <= 2000 
// 1 <= employees[i].id <= 2000 
// 所有的 employees[i].id 互不相同。 
// -100 <= employees[i].importance <= 100 
// 一名员工最多有一名直接领导，并可能有多名下属。 
// employees[i].subordinates 中的 ID 都有效。 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 数组 哈希表 👍 308 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

//import java.util.List;
//
//class Employee {
//    public int id;
//    public int importance;
//    public List<Integer> subordinates;
//};


import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    static int imp = 0;
static Map<Integer,Integer> map=new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            map.put(employee.id, i);
        }
        Employee ee = employees.get(map.get(id));
//        imp = ee.importance;
        imp=0;
        dfs(ee,employees);
        return imp;
    }

    private void dfs(Employee ee, List<Employee> employees) {
        if (ee != null) {
            imp += ee.importance;
            for (Integer subordinate : ee.subordinates) {
                System.out.println(subordinate);
                if (map.containsKey(subordinate)){
                dfs( employees.get(map.get(subordinate)),employees);}
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
