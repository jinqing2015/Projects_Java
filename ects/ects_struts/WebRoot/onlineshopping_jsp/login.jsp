<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/jsp; charset=gbk" />
<title>BuildUp Real Estate</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link rel="stylesheet" type="text/css" href="admin.css" />

</head>
<body>
<div id="main_container">

<div id="header">
	<jsp:include page="head.jsp"></jsp:include>
</div>

    
    <div id="main_content"> 
    	
        <div class="admin_login">
        
         	<div class="left_box">
            	<div class="top_left_box">
                </div>
                <div class="center_left_box">
                	<div class="box_title"><span>用户登录</span> </div>
                    
                    
                    <div class="form">
                    <form action="${pageContext.request.contextPath}/onlineshopping_jsp/Login.do" method="post">
                    <div class="form_row"><label class="left">用户名： </label><input type="text" class="form_input" name="name" value="${name}"/></div> 
                    <div class="form_row"><label class="left">密码： </label><input type="password" class="form_input" name="password"/></div>
                    <div class="form_row"><label class="left"></label><font color="red"><html:errors/>${message}</font>
                    </div>                    
                    <div style="float:right; padding:10px 25px 0 0;">
                    <input type="submit" value="登录"/>
                    </div>
                    </form>
                    </div>
                
                
                </div>
                <div class="bottom_left_box">
                </div>
            </div> 
            
        </div>       
        
        
        
        
	</div>
    <!-- end of main_content -->
    
<div id="footer">
	<jsp:include page="foot.jsp"></jsp:include>
</div>

</div>
<!-- end of main_container -->

</body>
</html>