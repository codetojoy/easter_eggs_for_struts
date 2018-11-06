package net.codetojoy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

import net.codetojoy.model.*;
import net.codetojoy.service.*;

import org.apache.log4j.Logger;

public class CreateEmployeeAction extends ActionSupport implements ScopedModelDriven<Employee> {

    private static final Logger logger = Logger.getLogger(CreateEmployeeAction.class);
    private static final String LOG_PREFIX = "TRACER CreateEmployeeAction  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

	private static final long serialVersionUID = 1L;

    private Employee model = new Employee();
    private String scopeKey = "employee";

    @Override
    public Employee getModel() {
        return model;
    }

    @Override
    public void setModel(Employee model) {
        this.model = model;
    }

    @Override
    public void setScopeKey(String scopeKey) {
        this.scopeKey = scopeKey;
    }

    @Override
    public String getScopeKey() {
       return scopeKey;
    }

    public String execute() throws Exception {
        logIt("execute begin");
        model.setName("Van Halen");
        model.setId(5150);
        logIt("model: " + model.toString());
		return SUCCESS;
	}
}
