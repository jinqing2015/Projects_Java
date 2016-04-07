package cn.com.ambow.ects.web.servlet.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import cn.com.ambow.ects.dao.IUserDao;
import cn.com.ambow.ects.dao.impl.UserDaoImpl;
import cn.com.ambow.ects.entity.ContcatInfo;
import cn.com.ambow.ects.entity.Country;
import cn.com.ambow.ects.entity.Province;
import cn.com.ambow.ects.entity.User;
import cn.com.ambow.ects.web.struts.form.LoginForm;
import cn.com.ambow.ects.web.struts.form.RegisterForm;


public class UserHandler extends MappingDispatchAction{
	
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		ActionForward forward = null;
		try{
			/*String name = req.getParameter("name");
			String password = req.getParameter("password");*/
			LoginForm loginForm = (LoginForm)form;
			String name = loginForm.getName();
			
			String password = loginForm.getPassword();
			IUserDao dao=new UserDaoImpl();
			User user=dao.login(name, password);
			if(user!=null)
			{
				req.getSession().setAttribute("message","");
				req.getSession().setAttribute("user", user);
				forward =  mapping.findForward("success");
	
			}else{
				req.getSession().setAttribute("message","√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î£°");
				forward = mapping.findForward("error");
			}
		}catch(Exception e){
			e.printStackTrace();	
			forward = mapping.findForward("error");
		}
		return forward;
		
	}
	public ActionForward register(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		ActionForward forward = null;
		System.out.println("===========================================");
		try{
				String name = req.getParameter("name");
				String password = req.getParameter("password");
				String newPassword=req.getParameter("newpassword");
				String cellPhone=req.getParameter("cellphone");
				String homePhone=req.getParameter("homephone");
				String officePhone=req.getParameter("officephone");
				String email=req.getParameter("email");
				String country=req.getParameter("country");				
				String province=req.getParameter("province");				
				String city=req.getParameter("city");
				String street1=req.getParameter("street1");
				String street2=req.getParameter("street2");
				String zip=req.getParameter("zip");
			
				/*RegisterForm registerForm=new RegisterForm();
				
				String name = registerForm.getName();
				String password = registerForm.getPassword();
				String newPassword=registerForm.getNewpassword();
				String cellPhone=registerForm.getCellphone();
				String homePhone=registerForm.getHomephone();
				String officePhone=registerForm.getOfficephone();
				String email=registerForm.getEmail();
				String country=registerForm.getCountry();				
				String province=registerForm.getProvince();				
				String city=registerForm.getCity();
				String street1=registerForm.getStreet1();
				String street2=registerForm.getStreet2();
				String zip=registerForm.getZip();
				
				System.out.println(registerForm);*/
				
				Integer countryId=Integer.parseInt(country,10);
				Integer provinceId=Integer.parseInt(province, 10);
				User user=null;
				System.out.println("password="+password);
				if(password.equals(newPassword)&&name!=""&&password!=""&&cellPhone!=""&&zip!="")
				{
						Country c=new Country();
						c.setId(countryId);
						
						Province p=new Province();
						p.setCountry(c);
						p.setId(provinceId);
						
						ContcatInfo info=new ContcatInfo();
						info.setCellPhone(cellPhone);
						info.setCity(city);
						info.setCountry(c);
						info.setProvince(p);
						info.setEmail(email);
						info.setHomePhone(homePhone);
						info.setOfficePhone(officePhone);
						info.setStreet1(street1);
						info.setStreet2(street2);
						info.setZip(zip);
						
						user=new User();
						user.setInfo(info);
						user.setName(name);
						user.setPasswd(password);
						
						info.setUser(user);
						
						IUserDao dao=new UserDaoImpl();
						dao.add(user);
						
						req.getSession().setAttribute("name", name);
						forward =  mapping.findForward("success");
				}else{
					
					forward = mapping.findForward("error");
				}
			}catch(Exception e){
					e.printStackTrace();
					forward = mapping.findForward("error");
			}
		return forward;

		
	}
	public ActionForward modify(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ActionForward forward = null;
		try{
						User user=(User) req.getSession().getAttribute("user");		
		
						String name = req.getParameter("name");
						String password = req.getParameter("password");
						String newPassword=req.getParameter("newpassword");
						String cellPhone=req.getParameter("cellphone");
						String homePhone=req.getParameter("homephone");
						String officePhone=req.getParameter("officephone");
						String email=req.getParameter("email");
						String country=req.getParameter("country");
						Integer countryId=Integer.parseInt(country,10);
						String province=req.getParameter("province");
						Integer provinceId=Integer.parseInt(province, 10);
						String city=req.getParameter("city");
						String street1=req.getParameter("street1");
						String street2=req.getParameter("street2");
						String zip=req.getParameter("zip");
						
						
						if(password.equals(newPassword)&&name!=""&&password!=""&&cellPhone!=""&&zip!="")
						{
								
								ContcatInfo info=user.getInfo();
								info.setCellPhone(cellPhone);
								info.setCity(city);
								info.setEmail(email);
								info.setHomePhone(homePhone);
								info.setOfficePhone(officePhone);
								info.setStreet1(street1);
								info.setStreet2(street2);
								info.setZip(zip);
								
								user.setName(name);
								user.setPasswd(password);
								
								user.getInfo().getCountry().setId(countryId);
								user.getInfo().getProvince().setCountry(user.getInfo().getCountry());
								user.getInfo().getProvince().setId(provinceId);
								IUserDao dao=new UserDaoImpl();
								dao.update(user);
							
								req.getSession().setAttribute("user", user);
								forward =  mapping.findForward("success");
						}else{
							
							forward = mapping.findForward("error");
						}
		}catch(Exception e){
				
			forward = mapping.findForward("error");
		}
		return forward;				
	}
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		ActionForward forward = null;
		
		req.getSession().removeAttribute("user");
		//req.getSession().invalidate();
		forward =  mapping.findForward("success");
		
		return forward;
	}
	
}
