package cn.com.ambow.ects.web.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RegisterForm extends ActionForm{

	private String name;	
	private String password;	
	private String newpassword;	
	private String cellphone;
	private String homephone;
	private String officephone;
	private String email;	
	private String country;
	private String province;
	private String city;
	private String street1;
	private String street2;	
	private String zip;
	private String terms;
	
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
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	public String getOfficephone() {
		return officephone;
	}
	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
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
		if(!password.trim().equals(newpassword.trim())){
			ActionMessage message2 = new ActionMessage("error.register.newpassword");
			errors.add("newpassword", message2);
		}
		if(cellphone.trim().length()!=11){
			ActionMessage message3 = new ActionMessage("error.register.cellphone");
			errors.add("cellphone", message3);
		}
		if(!("1".equals(terms)))
		{
			ActionMessage message4 = new ActionMessage("error.register.terms");
			errors.add("terms", message4);
		}
		if(street1.trim().length()<0||"".equals(street1))
		{
			ActionMessage message5 = new ActionMessage("error.register.street");
			errors.add("street1", message5);
		}
		if(street2.trim().length()<0||"".equals(street1))
		{
			ActionMessage message5 = new ActionMessage("error.register.street");
			errors.add("street2", message5);
		}
		if(zip.trim().length()<0||"".equals(zip))
		{
			ActionMessage message6 = new ActionMessage("error.register.zip");
			errors.add("zip", message6);
		}	
		return errors;
	}
	@Override
	public String toString() {
		return "RegisterForm [cellphone=" + cellphone + ", city=" + city
				+ ", country=" + country + ", email=" + email + ", homephone="
				+ homephone + ", name=" + name + ", newpassword=" + newpassword
				+ ", officephone=" + officephone + ", password=" + password
				+ ", province=" + province + ", street1=" + street1
				+ ", street2=" + street2 + ", terms=" + terms + ", zip=" + zip
				+ "]";
	}
	
	
	
	

	
}
