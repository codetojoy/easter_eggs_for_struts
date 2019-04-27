package net.codetojoy.service;

import java.util.*;
import java.util.stream.*;

import org.apache.log4j.Logger;

import net.codetojoy.pojo.Employee;

public class EmployeeRepository {
    // ------- logger
    private static final Logger logger = Logger.getLogger(EmployeeRepository.class);
    private static final String VERSION = "v4";
    private static int instanceCount = 0;

    private void logIt(String msg) {
        String prefix = "TRACER [EmpRepo "
                                        + VERSION + "(" + instanceCount + ")"
                                        + "] ";
        logger.info(prefix + msg);
    }
    //

    // static map as an ultra-simple, toy "repo"
    private static Map<Integer,Employee> map = new HashMap<>();

    static {
        map.put(111, new Employee(111, "Beethoven", "Classical-Romantic Partners"));
        map.put(222, new Employee(222, "Chopin", "Romantic LLC"));
        map.put(333, new Employee(333, "Mozart", "Classical Inc"));
    }

    public EmployeeRepository() {
        instanceCount++;
    }

    public Collection<Employee> getAll() {
        Collection<Employee> results = new ArrayList<>();

        for (Integer key : map.keySet()) {
            Employee employee = map.get(key);
            results.add(employee);
        }

        return results;
    }

    protected int getNextId() {
        int maxId = map.keySet().stream().max(Comparator.naturalOrder()).get();
        int result = maxId + 1;
        return result;
    }

    public void addEmployee(Object model) {
        int newId = getNextId();
        Employee employee = (Employee) model;
        employee.setId(newId);
        map.put(newId, employee);
    }

    public void saveEmployee(Object model) {
        String whoAmI = "saveEmployee";

        Employee employee = (Employee) model;
        int id = employee.getId();
        logIt(whoAmI + " id: " + id);
        map.remove(id);
        map.put(id, employee);
    }

    public Employee getEmployeeById(String id) {
        String whoAmI = "getEmployeeById";

        int idInt = Integer.parseInt(id);
        logIt(whoAmI + " id: " + id);

        return map.get(idInt);
    }

    public void deleteEmployee(Object model) {
        String whoAmI = "deleteEmployee";

        Employee employee = (Employee) model;
        int id = employee.getId();
        logIt(whoAmI + " id: " + id);
        map.remove(id);
    }
}
