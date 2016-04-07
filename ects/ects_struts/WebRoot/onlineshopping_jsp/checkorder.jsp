<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
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
    

    
    <div id="main_content">
    
    
    <div id="admin_header">
    	<div class="admin_editoffer_title">订单信息填写</div>
        
        
    
    
    </div>
    <div id="admin_header_border"></div>   
    	
         <div class="add_tab">
         		<c:forEach items="${shopCart}" var="order" varStatus="status">
				<div class="offer_box_wide">
            	<a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${order.value.product.id}"><img src="${order.value.product.images}" width="130" height="98" class="img_left" alt="" title="" border="0"/></a>
                <div class="offer_info">
                <span>名称：${order.value.product.name}</span>
                <span>单价：${order.value.product.basePrice}</span>
                <span>数量：${order.value.amount}</span>
                <p class="offer">
                	描述：${order.value.product.descriptions}            
                </p>
                
                </div>
            	</div> 
            	</c:forEach>          
                   
                <div class="form_contact">
                    <form action="${pageContext.request.contextPath}/onlineshopping_jsp/CreateOrder.do" method="post">
                    <div class="adminform_row_contact"><label class="adminleft">联系人:</label><input value="${user.name}" class="form_input_contact"  name="name"/></div>
					<div class="adminform_row_contact"><label class="adminleft">手机:</label><input value="${user.info.cellPhone}" class="form_input_contact" name="cellphone"/></div>
					<div class="adminform_row_contact"><label class="adminleft">地址:</label><input value="${user.info.street1}" class="form_input_contact"/ name="street1"></div>
					<div class="adminform_row_contact"><label class="adminleft">付款方式: </label>
					<select class="form_select" name="payWay">
                    	<option value=1 >现金付款</option>
						<option value=2>网上付款</option>
						<option value=3>电汇付款</option>
					 </select>
					</div>
					<div class="adminform_row_contact"><label class="adminleft">您需支付:</label><input value="${totalPrice}" class="form_input_contact" disabled="disabled"/></div>
                    <div>    
                    <input value="提交" type="submit" style="width:140px; height:30px">
                    </div>
                    </form>
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