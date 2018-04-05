package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by devpriyadave on 4/4/18.
 */
public class EmployeeImportance {
    /**
     * Idea is to create hasmap with ids as employee id
     * and then have an array list just like we traverse graph
     */
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

        for(Employee emp : employees) {
            employeeMap.put(new Integer(emp.id), emp);
        }

        List<Integer> tracker = new ArrayList<Integer>();
        tracker.add(new Integer(id));
        int sum = 0;
        while(tracker.size()!=0) {
            int nextId = tracker.get(0);
            sum = sum + employeeMap.get(nextId).importance;
            tracker.addAll(employeeMap.get(nextId).subordinates);
            tracker.remove(0);
        }

        return sum;
    }
}
