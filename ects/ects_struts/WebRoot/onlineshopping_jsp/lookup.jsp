<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html >
<head>
<meta http-equiv="Content-Type" content="text/jsp; charset=gbk"  />
<title>个人信息修改</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link rel="stylesheet" type="text/css" href="admin.css" />

</head>
<body>
<div id="main_container">

<div id="header">
	<jsp:include page="head.jsp"></jsp:include>
</div>    

</div>   
    <div id="main_content">
    
    
    <div id="admin_header">
    	<div class="admin_editoffer_title">个人信息</div>
        
        
    
    
    </div>
    <div id="admin_header_border"></div>   
    	
         <div class="add_tab">	
                    <div class="form_contact">
                   
                    <div class="adminform_row_contact"><label class="adminleft">用户名: </label><input type="text"  disabled="disabled" class="form_input_contact" name="name" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">国家:</label><input type="text"  disabled="disabled" class="form_input_contact" name="country" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.country.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">省份:</label><input type="text"  disabled="disabled" class="form_input_contact" name="province" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.province.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">城市: </label><input type="text" disabled="disabled" class="form_input_contact" name="city" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.city }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">街道地址1: </label><input type="text" disabled="disabled" class="form_input_contact" name="street1" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street1}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">街道地址2: </label><input type="text" disabled="disabled" class="form_input_contact" name="street2" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street2}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    
                    <div class="adminform_row_contact"><label class="adminleft">邮编: </label><input type="text" disabled="disabled" class="form_input_contact"  name="zip" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.zip }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
		            <div class="adminform_row_contact"><label class="adminleft">Email: </label><input type="text" disabled="disabled" class="form_input_contact" name="email" value=
		           	<c:if test="${!empty user}" var="hasUser">
						${user.info.email }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div>
					<div class="adminform_row_contact"><label class="adminleft">手机: </label><input type="text" disabled="disabled" class="form_input_contact" name="cellphone" value=
					<c:if test="${!empty user}" var="hasUser">
						${user.info.cellPhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
					></div>
		            <div class="adminform_row_contact"><label class="adminleft">家庭电话: </label><input type="text" disabled="disabled" class="form_input_contact" name="homephone" value=
		            <c:if test="${!empty user}" var="hasUser">
						${user.info.homePhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div> 
		            <div class="adminform_row_contact"><label class="adminleft">办公电话: </label><input type="text" disabled="disabled" class="form_input_contact" name="officephone" value=
		            <c:if test="${!empty user}" var="hasUser">
						${user.info.officePhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div>
                    </div>

                    
         </div>
  
 

	
    <!-- end of main_content -->
    
<div id="footer">
	<jsp:include page="foot.jsp"></jsp:include>
</div>
<!-- end of main_container -->
</div>
</body>
</html>