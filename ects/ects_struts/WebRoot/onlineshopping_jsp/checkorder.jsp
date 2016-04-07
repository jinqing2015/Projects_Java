<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
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
    

    
    <div id="main_content">
    
    
    <div id="admin_header">
    	<div class="admin_editoffer_title">������Ϣ��д</div>
        
        
    
    
    </div>
    <div id="admin_header_border"></div>   
    	
         <div class="add_tab">
         		<c:forEach items="${shopCart}" var="order" varStatus="status">
				<div class="offer_box_wide">
            	<a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${order.value.product.id}"><img src="${order.value.product.images}" width="130" height="98" class="img_left" alt="" title="" border="0"/></a>
                <div class="offer_info">
                <span>���ƣ�${order.value.product.name}</span>
                <span>���ۣ�${order.value.product.basePrice}</span>
                <span>������${order.value.amount}</span>
                <p class="offer">
                	������${order.value.product.descriptions}            
                </p>
                
                </div>
            	</div> 
            	</c:forEach>          
                   
                <div class="form_contact">
                    <form action="${pageContext.request.contextPath}/onlineshopping_jsp/CreateOrder.do" method="post">
                    <div class="adminform_row_contact"><label class="adminleft">��ϵ��:</label><input value="${user.name}" class="form_input_contact"  name="name"/></div>
					<div class="adminform_row_contact"><label class="adminleft">�ֻ�:</label><input value="${user.info.cellPhone}" class="form_input_contact" name="cellphone"/></div>
					<div class="adminform_row_contact"><label class="adminleft">��ַ:</label><input value="${user.info.street1}" class="form_input_contact"/ name="street1"></div>
					<div class="adminform_row_contact"><label class="adminleft">���ʽ: </label>
					<select class="form_select" name="payWay">
                    	<option value=1 >�ֽ𸶿�</option>
						<option value=2>���ϸ���</option>
						<option value=3>��㸶��</option>
					 </select>
					</div>
					<div class="adminform_row_contact"><label class="adminleft">����֧��:</label><input value="${totalPrice}" class="form_input_contact" disabled="disabled"/></div>
                    <div>    
                    <input value="�ύ" type="submit" style="width:140px; height:30px">
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