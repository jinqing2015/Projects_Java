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
    	<div class="admin_editoffer_title">������Ϣ�༭</div>
        
        
    
    
    </div>
    <div id="admin_header_border"></div>   
    	
         <div class="add_tab">	
                    <div class="form_contact">
                    <form action="${pageContext.request.contextPath}/onlineshopping_jsp/Modify.do" method="post">
                    <div class="adminform_row_contact"><label class="adminleft">�û���: </label><input type="text" class="form_input_contact" name="name" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">����: </label><input type="password" class="form_input_contact" name="password" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.passwd }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
					<div class="adminform_row_contact"><label class="adminleft">ȷ������: </label><input type="password" class="form_input_contact" name="newpassword" /></div>
					<div class="adminform_row_contact"><label class="adminleft">����: </label>
					<select class="form_select" name="country" value=
					 <c:if test="${!empty user}" var="hasUser">
						${user.info.country.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
					>
                    	<option value=1>�й�</option>
					 </select>
					</div>
		            <div class="adminform_row_contact"><label class="adminleft">ʡ��: </label>
					<select class="form_select" name="province">
						<c:if test="${!empty user}" var="hasUser">
							<option value=${user.info.province.id}>${user.info.province.name}</option>
						</c:if>
						<c:if test="${!hasUser}">
						</c:if>
                    	<option value=1>����</option>
                        <option value=2>����</option>
                        <option value=3>����</option>
                        <option value=4>����</option>
                        <option value=5>�㶫</option>
                        <option value=6>����</option>
                        <option value=7>����</option>
                        <option value=8>����</option>
                        <option value=9>����</option>
                        <option value=10>����</option>
                        <option value=11>�ӱ�</option>
                        <option value=12>����</option>
                        <option value=13>���</option>
                        <option value=14>������</option>
                        <option value=15>����</option>
                        <option value=16>����</option>
                        <option value=17>����</option>
                        <option value=18>����</option>
                        <option value=19>����</option>
                        <option value=20>����</option>
                        <option value=21>���ɹ�</option>
                        <option value=22>����</option>
                        <option value=23>�ຣ</option>
                        <option value=24>�Ĵ�</option>
                        <option value=25>ɽ��</option>
                        <option value=26>�Ϻ�</option>
                        <option value=27>����</option>
                        <option value=28>ɽ��</option>
                        <option value=29>���</option>
                        <option value=30>̨��</option>
                        <option value=31>�½�</option>
                        <option value=32>����</option>
                        <option value=33>����</option>
                        <option value=34>�㽭</option>
						<option value=35>����</option>
						
                    </select>
					</div>
                    <div class="adminform_row_contact"><label class="adminleft">����: </label><input type="text" class="form_input_contact" name="city" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.city }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">�ֵ���ַ1: </label><input type="text" class="form_input_contact" name="street1" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street1}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">�ֵ���ַ2: </label><input type="text" class="form_input_contact" name="street2" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street2}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    
                    <div class="adminform_row_contact"><label class="adminleft">�ʱ�: </label><input type="text" class="form_input_contact"  name="zip" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.zip }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
		            <div class="adminform_row_contact"><label class="adminleft">Email: </label><input type="text" class="form_input_contact" name="email" value=
		           	<c:if test="${!empty user}" var="hasUser">
						${user.info.email }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div>
					<div class="adminform_row_contact"><label class="adminleft">�ֻ�(13λ): </label><input type="text" class="form_input_contact" name="cellphone" value=
					<c:if test="${!empty user}" var="hasUser">
						${user.info.cellPhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
					></div>
		            <div class="adminform_row_contact"><label class="adminleft">��ͥ�绰: </label><input type="text" class="form_input_contact" name="homephone" value=
		            <c:if test="${!empty user}" var="hasUser">
						${user.info.homePhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div> 
		            <div class="adminform_row_contact"><label class="adminleft">�칫�绰: </label><input type="text" class="form_input_contact" name="officephone" value=
		            <c:if test="${!empty user}" var="hasUser">
						${user.info.officePhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div>
		            <div class="adminform_row_contact"><font color="red"><html:errors/></font></div>
                    <div style="float: right; padding: 3px 15px 0pt 0pt;">    
                    <input type="reset"  value="����">
                    <input type="submit"  value="�ύ">
                    </div>    
                    </form>
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