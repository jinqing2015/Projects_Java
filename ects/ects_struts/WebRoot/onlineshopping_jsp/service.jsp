<%@ page contentType="text/html;charset=UTF-8"%>

<%@page import="cn.com.ambow.ects.entity.TestUser"%>
<%
	
    String username=request.getParameter("username");
    username=new String((username.getBytes("ISO-8859-1")),"utf-8");
    int i =TestUser.test(username);
    if(i==0)
   		out.print("您想注册的用户名已存在");
   	else
   		out.print("您的用户名可以使用");
%>