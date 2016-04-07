<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html >
<head>
<meta http-equiv="Content-Type" content="text/jsp; charset=gbk"  />
<title>������Ϣ�޸�</title>
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
    	<div class="admin_editoffer_title">������Ϣ</div>
        
        
    
    
    </div>
    <div id="admin_header_border"></div>   
    	
         <div class="add_tab">	
                    <div class="form_contact">
                   
                    <div class="adminform_row_contact"><label class="adminleft">�û���: </label><input type="text"  disabled="disabled" class="form_input_contact" name="name" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">����:</label><input type="text"  disabled="disabled" class="form_input_contact" name="country" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.country.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">ʡ��:</label><input type="text"  disabled="disabled" class="form_input_contact" name="province" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.province.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">����: </label><input type="text" disabled="disabled" class="form_input_contact" name="city" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.city }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">�ֵ���ַ1: </label><input type="text" disabled="disabled" class="form_input_contact" name="street1" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street1}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">�ֵ���ַ2: </label><input type="text" disabled="disabled" class="form_input_contact" name="street2" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street2}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    
                    <div class="adminform_row_contact"><label class="adminleft">�ʱ�: </label><input type="text" disabled="disabled" class="form_input_contact"  name="zip" value=
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
					<div class="adminform_row_contact"><label class="adminleft">�ֻ�: </label><input type="text" disabled="disabled" class="form_input_contact" name="cellphone" value=
					<c:if test="${!empty user}" var="hasUser">
						${user.info.cellPhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
					></div>
		            <div class="adminform_row_contact"><label class="adminleft">��ͥ�绰: </label><input type="text" disabled="disabled" class="form_input_contact" name="homephone" value=
		            <c:if test="${!empty user}" var="hasUser">
						${user.info.homePhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div> 
		            <div class="adminform_row_contact"><label class="adminleft">�칫�绰: </label><input type="text" disabled="disabled" class="form_input_contact" name="officephone" value=
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