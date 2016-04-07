<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html >
<head>
<title>BuildUp Real Estate</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link rel="stylesheet" type="text/css" href="orderdetails.css" />

</head>
<body>
<div id="main_container">

<div id="header">
	<jsp:include page="head.jsp"></jsp:include>
</div>
 
    <div id="main_content">
 
    <div id="admin_header">
    	<div class="admin_index_title">订单信息：</div>
        
        <div class="right_buttons">

        
        </div>  
    </div>   	
<div class="table_grid">
                <table cellpadding="0" cellspacing="0">
                    <tbody><tr>
                   		
                        <th style="width: 150px;">订单名</th>

                        <th style="width: 100px;">总价格</th>
                        <th style="width: 100px;">付款方式</th>
                        <th style="width: 100px;"> 联系人</th>   
                        <th style="width: 100px;">确认收货</th>
						<th style="width: 100px;">&nbsp;</th>
                    </tr>
                    			
                    <tr class="odd">
                    
                        <td>${order.name}</td>
                        <td><strong>${order.cost}$</strong></td> 
                        <td>${order.payWay.payStyle}</td>
                        <td>${userToContact.name}</td>
						<td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/OrderSuccess.do"><input value="确认收货" type="button"></a></td>        
						<td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/OrderMoreDetails.do">>>more</a></td>     
                    </tr>			
                     			
                     
                        
                    <tr></tr>                 
                                                                                                                 
                </tbody></table>
        </div>
    <!-- end of main_content -->
    
<div id="footer">
	<jsp:include page="foot.jsp"></jsp:include>
</div>


</div>
</div>
<!-- end of main_container -->

</body>
</html>