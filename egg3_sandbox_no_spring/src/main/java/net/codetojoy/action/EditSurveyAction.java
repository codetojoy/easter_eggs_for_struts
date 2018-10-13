package net.codetojoy.action;

import com.opensymphony.xwork2.ActionSupport;

import net.codetojoy.model.*;
import net.codetojoy.service.*;

import org.apache.log4j.Logger;

public class EditSurveyAction extends ActionSupport {

    private static final Logger logger = Logger.getLogger(EditSurveyAction.class);
    private static final String LOG_PREFIX = "TRACER EditSurveyAction  ";

    private void logIt(String msg) {
        logger.error(LOG_PREFIX + " " + msg);
    }

	private static final long serialVersionUID = 1L;

	private Survey surveyBean;
    private Integer age;
    private Boolean fieldP;
    private Boolean fieldT;

	public String execute() throws Exception {
        logIt("execute begin");
		return SUCCESS;
	}

	public String input() throws Exception {
        logIt("input begin");
        // request parameters
        logIt("input age: " + age + " fieldP: " + fieldP + " fieldT: " + fieldT);

		Survey survey =  new Survey();

        survey.setAge(age);
        survey.setFieldP(fieldP);
        survey.setFieldT(fieldT);

		setSurveyBean(survey);
		return INPUT;
	}

    // getters, setters

	public Integer getAge() { return age; }
	public void setAge(Integer age) { this.age = age; }

	public Boolean isFieldP() { return fieldP; }
	public void setFieldP(Boolean fieldP) { this.fieldP = fieldP; }

	public Boolean isFieldT() { return fieldT; }
	public void setFieldT(Boolean fieldT) { this.fieldT = fieldT; }

	public Survey getSurveyBean() { return surveyBean; }
	public void setSurveyBean(Survey survey) { surveyBean = survey; }
}
