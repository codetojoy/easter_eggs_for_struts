package net.codetojoy.service;

import java.util.*;

import net.codetojoy.model.State;

import org.apache.log4j.Logger;

public class GeoServiceImpl implements GeoService {

    private static final Logger logger = Logger.getLogger(GeoServiceImpl.class);
    private static final String LOG_PREFIX = "TRACER GeoServiceImpl  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

    public GeoServiceImpl() {
        logIt("in ctor");
	}

    public List<State> getStates() {
        List<State> states = new ArrayList<>();

		states.add( new State("AZ", "Arizona") );
		states.add( new State("CA", "California") );
		states.add( new State("FL", "Florida") );
		states.add( new State("MO", "Missouri") );
		states.add( new State("NY", "New York") );

        return states;
    }
}
