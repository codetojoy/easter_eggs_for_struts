package net.codetojoy.model;

public class State {
	private final String stateAbbr;
	private final String stateName;

	public State (String stateAbbr, String stateName) {
		this.stateAbbr = stateAbbr;
		this.stateName = stateName;
	}

	public String getStateAbbr() { return stateAbbr; }
	public String getStateName() { return stateName; }

	public String toString() { return getStateAbbr() ; }
}
