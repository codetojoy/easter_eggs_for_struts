package net.codetojoy.service;

import net.codetojoy.model.Scenario;

import org.apache.log4j.Logger;

public class ScenarioServiceImpl implements ScenarioService {

    private static final Logger logger = Logger.getLogger(ScenarioServiceImpl.class);
    private static final String LOG_PREFIX = "TRACER ScenarioServiceImpl  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

	private Scenario scenario;

    private static int instanceCounter = 0;

    public ScenarioServiceImpl() {
        logIt("in ctor");
        logIt("instance counter: " + instanceCounter);
		scenario = new Scenario();
        instanceCounter++;
	}

	public Scenario getScenario() {
		return scenario;
	}

	public void saveScenario(Scenario scenarioBean) {
        logIt("in saveScenario");
		scenario.setAge( scenarioBean.getAge() );
		scenario.setFieldP( scenarioBean.isFieldP() );
		scenario.setFieldT( scenarioBean.isFieldT() );
	}
}
