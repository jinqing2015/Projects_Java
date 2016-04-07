<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    
    
    <div id="admin_header">
        

    
    
    </div>
    <div id="admin_header_border"></div>
    
    <div id="admin_search_tab">
        <label class="search" style="padding-top:3px;">查找订单: </label>
        <label class="search"><input type="text" name="search" class="search_input" /> </label>
        <label class="search"><a href=""><img src="images/adminicons/search.png" border="0" /></a>	 </label>
    
    </div>
    
    
    	
 <div class="table_grid">
                <table cellspacing="0" cellpadding="0" width="1604" height="225">
                    <tr>          
                        <th style="width:30px;">标识号</th>
                        <th style="width:50px;">图片</th>
                        <th style="width:60px;">标题</th>
                        <th style="width:auto;">描述</th>
                        <th style="width:60px;">单价</th>
                        <th style="width:60px;">数量</th>                   
                        <th style="width:50px;">删除</th>                
                    </tr>
                    <c:forEach items="${shopCart}" var="order" varStatus="status">
                    <tr class="even">
                    	             	
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${order.value.product.id}</td>
                        <td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${order.value.product.id}"><img src="${order.value.product.images }" width="53" height="39" border="0" /></a></td>
                        <td>${order.value.product.name }</td>
                        <td>${order.value.product.descriptions }</td>
                        <td><strong>${order.value.product.basePrice }$</strong></td>                      
                        <td>
                        	<form action="${pageContext.request.contextPath}/onlineshopping_jsp/AddAmount.do?id=${order.value.product.id}" method="post">
                        	<input size="2" name="amount" type="text" value="${order.value.amount }"  />
                        	<input value="+" type="submit">
                        	</form>
                        </td>
                        
           				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/onlineshopping_jsp/DeleteFromCart.do?id=${order.value.product.id}"><img src="images/adminicons/delete.png" width="24" height="24" border="0" /></a></td>              
                    </tr>  
                    </c:forEach>
                    <tr>
                          <td><div class="button"><a href="${pageContext.request.contextPath}/onlineshopping_jsp/ClearShopCart.do"><strong>清空购物车</strong></a></div></td>
                          <td></td>
                          <td></td>
                          <td><div class="button"><strong>总价：${totalPrice}</strong></div></td>
                          <td></td>
                          <td></td>  
                          <td><div class="button"><a href="${pageContext.request.contextPath}/onlineshopping_jsp/CheckOrder.do"><font size="3.5em">确  认</font></a></div></td>
                    </tr>			                                                                                          
                </table>
        </div>      
        
        
         <div class="pagination">
            <span class="disabled">prev</span>
            <span class="current">1</span>
            <a href="">2</a>
            <a href="">3</a>
            <a href="">4</a>
            <a href="">5</a>
            <a href="">6</a>
            <a href="">7</a>...<a href="">199</a>
            <a href="">200</a>
            <a href="">next</a>        
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