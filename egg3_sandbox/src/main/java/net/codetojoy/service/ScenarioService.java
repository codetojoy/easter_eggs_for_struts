package net.codetojoy.service;

import net.codetojoy.model.Scenario;

public interface ScenarioService {
    Scenario getScenario();
    void saveScenario(Scenario scenarioBean);
}
