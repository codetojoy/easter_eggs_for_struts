package net.codetojoy.service;

import java.util.*;

import net.codetojoy.pojo.Employee;

public class EmployeeRepository {
    private Map<String,Employee> map = new HashMap<>();

    public EmployeeRepository() {
        map.put("111", new Employee(111, "Beethoven", "Acme"));
        map.put("222", new Employee(222, "Chopin", "FooBar"));
        map.put("333", new Employee(333, "Mozart", "Snafoo"));
    }

    public  Employee getEmployeeById(String id) {
        return map.get(id);
    }

    public Map<String,Employee> findAllEmployees() {
        return map;
    }
}
