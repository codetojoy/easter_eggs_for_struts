package net.codetojoy.action;

import com.opensymphony.xwork2.ActionSupport;

import net.codetojoy.model.*;
import net.codetojoy.service.*;

import org.apache.log4j.Logger;

public class EditScenarioAction extends ActionSupport {

    private static final Logger logger = Logger.getLogger(EditScenarioAction.class);
    private static final String LOG_PREFIX = "TRACER EditScenarioAction  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

	private static final long serialVersionUID = 1L;

	private ScenarioService scenarioService = new ScenarioServiceImpl();
	private Scenario scenarioBean;

    private static int instanceCounter = 0;

    public EditScenarioAction() {
        logIt("instance counter: " + instanceCounter);
        instanceCounter++;
    }

	public String execute() throws Exception {
        logIt("execute begin");
	    scenarioService.saveScenario( getScenarioBean() );
		return SUCCESS;
	}

	public String input() throws Exception {
        logIt("input begin");
		setScenarioBean( scenarioService.getScenario() );
		return INPUT;
	}

	public Scenario getScenarioBean() { return scenarioBean; }
	public void setScenarioBean(Scenario scenario) { scenarioBean = scenario; }

	public ScenarioService getScenarioService() { return scenarioService; }
	public void setScenarioService(ScenarioService scenarioService) {
        logIt("setting scenario service");
        this.scenarioService = scenarioService;
    }
}
