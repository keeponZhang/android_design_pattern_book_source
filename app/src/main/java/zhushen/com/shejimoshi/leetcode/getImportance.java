package zhushen.com.shejimoshi.leetcode;

import java.util.List;

/**
 * Created by Zhushen on 2018/8/23.
 */
public class getImportance {
    public int getImportance(List<Employee> employees, int id) {
        int importance = 0;
        for (Employee employee:employees) {
            if(employee.id == id){
                importance += employee.importance;
                for (int childId:employee.subordinates) {
                    importance += getImportance(employees,childId);
                }
            }
        }


        return importance;
    }

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };
}
