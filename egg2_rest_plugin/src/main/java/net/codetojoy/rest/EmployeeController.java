package net.codetojoy.rest;

import java.util.*;
import org.apache.struts2.rest.*;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.log4j.Logger;

import net.codetojoy.pojo.Employee;
import net.codetojoy.service.EmployeeRepository;

public class EmployeeController implements ModelDriven<Object> {
    private static final long serialVersionUID = 1L;

    private String id;
    private Object model;
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    private Map<String,Employee> map;

    private static final Logger logger = Logger.getLogger(EmployeeController.class);
    private static final String LOG_PREFIX = "TRACER EmployeeController  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

    public EmployeeController() {
        logIt("constructor");
        map = employeeRepository.findAllEmployees();
    }

    public HttpHeaders index() {
        logIt("index");
        model = map;
        return new DefaultHttpHeaders("index").disableCaching();
    }

    public String add() {
        logIt("add");
        Integer empId = Integer.parseInt(id);
        Employee emp = new Employee(empId,"Ramesh", "PQR");
        model = emp;
        return "SUCCESS";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        model = employeeRepository.getEmployeeById(id);
        this.id = id;
    }

    @Override
    public Object getModel() {
        logIt("getModel");
        return model;
    }
}
