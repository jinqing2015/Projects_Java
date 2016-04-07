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
    	<div class="admin_editoffer_title">个人信息编辑</div>
        
        
    
    
    </div>
    <div id="admin_header_border"></div>   
    	
         <div class="add_tab">	
                    <div class="form_contact">
                    <form action="${pageContext.request.contextPath}/onlineshopping_jsp/Modify.do" method="post">
                    <div class="adminform_row_contact"><label class="adminleft">用户名: </label><input type="text" class="form_input_contact" name="name" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">密码: </label><input type="password" class="form_input_contact" name="password" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.passwd }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
					<div class="adminform_row_contact"><label class="adminleft">确认密码: </label><input type="password" class="form_input_contact" name="newpassword" /></div>
					<div class="adminform_row_contact"><label class="adminleft">国家: </label>
					<select class="form_select" name="country" value=
					 <c:if test="${!empty user}" var="hasUser">
						${user.info.country.name }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
					>
                    	<option value=1>中国</option>
					 </select>
					</div>
		            <div class="adminform_row_contact"><label class="adminleft">省份: </label>
					<select class="form_select" name="province">
						<c:if test="${!empty user}" var="hasUser">
							<option value=${user.info.province.id}>${user.info.province.name}</option>
						</c:if>
						<c:if test="${!hasUser}">
						</c:if>
                    	<option value=1>安徽</option>
                        <option value=2>北京</option>
                        <option value=3>重庆</option>
                        <option value=4>福建</option>
                        <option value=5>广东</option>
                        <option value=6>甘肃</option>
                        <option value=7>广西</option>
                        <option value=8>贵州</option>
                        <option value=9>河南</option>
                        <option value=10>湖北</option>
                        <option value=11>河北</option>
                        <option value=12>海南</option>
                        <option value=13>香港</option>
                        <option value=14>黑龙江</option>
                        <option value=15>湖南</option>
                        <option value=16>吉林</option>
                        <option value=17>江苏</option>
                        <option value=18>江西</option>
                        <option value=19>辽宁</option>
                        <option value=20>澳门</option>
                        <option value=21>内蒙古</option>
                        <option value=22>宁夏</option>
                        <option value=23>青海</option>
                        <option value=24>四川</option>
                        <option value=25>山东</option>
                        <option value=26>上海</option>
                        <option value=27>陕西</option>
                        <option value=28>山西</option>
                        <option value=29>天津</option>
                        <option value=30>台湾</option>
                        <option value=31>新疆</option>
                        <option value=32>西藏</option>
                        <option value=33>云南</option>
                        <option value=34>浙江</option>
						<option value=35>其他</option>
						
                    </select>
					</div>
                    <div class="adminform_row_contact"><label class="adminleft">城市: </label><input type="text" class="form_input_contact" name="city" value=
                     <c:if test="${!empty user}" var="hasUser">
						${user.info.city }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">街道地址1: </label><input type="text" class="form_input_contact" name="street1" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street1}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    <div class="adminform_row_contact"><label class="adminleft">街道地址2: </label><input type="text" class="form_input_contact" name="street2" value=
                    <c:if test="${!empty user}" var="hasUser">
						${user.info.street2}
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
                    ></div>
                    
                    <div class="adminform_row_contact"><label class="adminleft">邮编: </label><input type="text" class="form_input_contact"  name="zip" value=
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
					<div class="adminform_row_contact"><label class="adminleft">手机(13位): </label><input type="text" class="form_input_contact" name="cellphone" value=
					<c:if test="${!empty user}" var="hasUser">
						${user.info.cellPhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
					></div>
		            <div class="adminform_row_contact"><label class="adminleft">家庭电话: </label><input type="text" class="form_input_contact" name="homephone" value=
		            <c:if test="${!empty user}" var="hasUser">
						${user.info.homePhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div> 
		            <div class="adminform_row_contact"><label class="adminleft">办公电话: </label><input type="text" class="form_input_contact" name="officephone" value=
		            <c:if test="${!empty user}" var="hasUser">
						${user.info.officePhone }
					</c:if>
					<c:if test="${!hasUser}">
					</c:if>
		            ></div>
		            <div class="adminform_row_contact"><font color="red"><html:errors/></font></div>
                    <div style="float: right; padding: 3px 15px 0pt 0pt;">    
                    <input type="reset"  value="重置">
                    <input type="submit"  value="提交">
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