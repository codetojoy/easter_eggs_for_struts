package net.codetojoy.service;

import java.util.*;
import java.util.stream.*;

import net.codetojoy.pojo.Employee;

public class EmployeeRepository {
    private static Map<Integer,Employee> map = new HashMap<>();

    public EmployeeRepository() {
        map.put(111, new Employee(111, "Beethoven", "Acme"));
        map.put(222, new Employee(222, "Chopin", "FooBar"));
        map.put(333, new Employee(333, "Mozart", "Snafoo"));
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

    public  Employee getEmployeeById(String id) {
        int idInt = Integer.parseInt(id);
        return map.get(idInt);
    }

    /*
    public Map<Integer,Employee> findAllEmployees() {
        return map;
    }
    */
}
