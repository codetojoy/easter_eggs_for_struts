package net.codetojoy.action;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.log4j.Logger;

public class SimpleAction extends ActionSupport {

    private static final Logger logger = Logger.getLogger(SimpleAction.class);
    private static final String LOG_PREFIX = "TRACER SimpleAction  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

	private static final long serialVersionUID = 1L;

    private String age;
    private String name;
    private String pathogen;
    private String message;

    private static int instanceCounter = 0;

    public SimpleAction() {
        logIt("instance counter: " + instanceCounter);
        instanceCounter++;
    }

    @Override
	public String execute() {
        String result = SUCCESS;
        logIt("execute begin");
        logState();

        if ("bogus".equalsIgnoreCase(pathogen)) {
            message = "this app can't handle bogus data";
            result = ERROR;
        }

		return result;
	}

    @Override
	public void validate() {
        logIt("validate begin");
        logState();

        if ("illegal".equalsIgnoreCase(pathogen)) {
            addFieldError("pathogen", "illegal value detected");
        }
	}

    private void logState() {
        logIt("age: " + age + " name: " + name + " pathogen: " + pathogen);
    }

    // getters, setters

	public String getAge() { return age; }
	public void setAge(String age) { this.age = age; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getPathogen() { return pathogen; }
	public void setPathogen(String pathogen) { this.pathogen = pathogen; }
}
