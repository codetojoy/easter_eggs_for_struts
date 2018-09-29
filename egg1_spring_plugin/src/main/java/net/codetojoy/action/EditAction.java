package net.codetojoy.action;

import com.opensymphony.xwork2.ActionSupport;

import net.codetojoy.model.*;
import net.codetojoy.service.*;

import java.util.*;

import org.apache.log4j.Logger;

public class EditAction extends ActionSupport {

    private static final Logger logger = Logger.getLogger(EditAction.class);
    private static final String LOG_PREFIX = "TRACER EditAction  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

	private static final long serialVersionUID = 1L;

	private EditService editService;
	private GeoService geoService;

	private Person personBean;
	private String [] sports = {"baseball", "billiards", "hockey" };
	private String [] genders = {"male", "female", "not sure" };

	private List<State> states ;
	private String [] carModelsAvailable = {"Honda","Mazda"};

	public String execute() throws Exception {
	    editService.savePerson( getPersonBean() );
		return SUCCESS;
	}

	public String input() throws Exception {
		setPersonBean( editService.getPerson() );
		return INPUT;
	}

	public Person getPersonBean() { return personBean; }
	public void setPersonBean(Person person) { personBean = person; }

	public List<String> getSports() { return Arrays.asList(sports); }

	public List<String> getGenders() { return Arrays.asList(genders); }

	public List<State> getStates() {
        return geoService.getStates();
	}

	public String [] getCarModelsAvailable() { return carModelsAvailable; }

	public EditService getEditService() { return editService; }
	public void setEditService(EditService editService) {
        logIt("setting edit service");
        this.editService = editService;
    }

	public GeoService getGeoService() { return geoService; }
	public void setGeoService(GeoService geoService) {
        logIt("setting geo service");
        this.geoService = geoService;
    }
}
