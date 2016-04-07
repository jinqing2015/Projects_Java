package cn.com.ambow.ects.web.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {

	private String name;
	
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{

		ActionErrors errors = new ActionErrors();
		if(name.trim().length()<0 || "".equals(name)){
			ActionMessage message = new ActionMessage("error.name");
			errors.add("name", message);
		}
		if(password.trim().length()<0 || "".equals(password)){
			ActionMessage message1 = new ActionMessage("error.password");
			errors.add("password", message1);
		}
		return errors;
	}
	
	
}
