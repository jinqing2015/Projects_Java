<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*"  %>
<html >
<head>
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
                	<div class="box_title"><span>${user.name} ����/Ůʿ</span> </div>
					<div class="box_title"><span> ���Ķ������׳ɹ���</span> </div>
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