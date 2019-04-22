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

    private Object model = new Employee();
    private Collection<Employee> employees;
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    private static final Logger logger = Logger.getLogger(EmployeeController.class);
    private static final String VERSION = "v1";
    private static int instanceCount = 0;

    private void logIt(String msg) {
        String prefix = "TRACER [EmpController "
                                        + VERSION + "(" + instanceCount + ")"
                                        + "] ";
        logger.info(prefix + " " + msg);
    }

    private String safeModelStr() {
        return (model == null) ? "" : model.toString();
    }

    public EmployeeController() {
        logIt("ctor");
        instanceCount++;
    }

     // GET /employee/{id}
     public HttpHeaders show() {
         logIt("show");
         return new DefaultHttpHeaders("show");
     }

    // GET /employee (plurality)
    public HttpHeaders index() {
        logIt("index");
        model = employeeRepository.getAll();
        return new DefaultHttpHeaders("index").disableCaching();
    }

    // POST
    public HttpHeaders create() {
        HttpHeaders result = null;
        String whoAmI = "create";

        try {
            logIt("create cp 0 model: " + model);
            Employee employee = (Employee) model;
            logIt("create cp 1");
            employeeRepository.addEmployee(employee);
            logIt("create cp 2");
            logIt("create OK. new id: " + employee.getId());
            result = new DefaultHttpHeaders("success").setLocationId(employee.getId());
        } catch (Exception ex) {
            logIt(whoAmI + " caught ex: " + ex.getMessage());
        }
        return result;
    }

    public String add() {
        logIt("add");
        Integer empId = Integer.parseInt(id);
        Employee emp = new Employee(empId,"Ramesh", "PQR");
        model = emp;
        return "SUCCESS";
    }

    public String getId() {
        logIt("getId id: " + id);
        return id;
    }

    public void setId(String id) {
        logIt("setId id: " + id);
        if (id != null) {
            model = employeeRepository.getEmployeeById(id);
            logIt("setId found model. model: " + model.toString());
        }
        this.id = id;
    }

    @Override
    public Object getModel() {
        Object result = null;

        if (employees != null) {
            logIt("getModel plurality: # employees: " + employees.size());
            result = employees;
        } else {
            logIt("getModel model: " + model.toString());
            result = model;
        }

        return result;
    }
}
