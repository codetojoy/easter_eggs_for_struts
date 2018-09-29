package net.codetojoy.service;

import net.codetojoy.model.Person;

import org.apache.log4j.Logger;

public class EditServiceImpl implements EditService {

    private static final Logger logger = Logger.getLogger(EditServiceImpl.class);
    private static final String LOG_PREFIX = "TRACER EditServiceImpl  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

	private Person person ;
	private String [] carModels = {"Ford","Nissan"};

    public EditServiceImpl() {
        logIt("in ctor");
		person = new Person();
		person.setFirstName("Wolfgang");
		person.setLastName("Mozart");
		person.setSport("billiards");
		person.setGender("male");
		person.setResidency("MO");
		person.setOver21(true);
		person.setCarModels( carModels);
	}

	public Person getPerson() {
		return person;
	}

	public void savePerson(Person personBean) {
        logIt("in savePerson");
		person.setFirstName( personBean.getFirstName() );
		person.setLastName( personBean.getLastName() );
		person.setSport( personBean.getSport() );
		person.setGender( personBean.getGender() );
		person.setResidency( personBean.getResidency() );
		person.setOver21( personBean.isOver21() );
		person.setCarModels( personBean.getCarModels() );
	}
}
