<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
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
    	<div class="admin_index_title">订单详情信息：</div>
        
        <div class="right_buttons">

        
        </div>
    
    
    </div>

    
    
    	
<div class="table_grid">
                <table cellpadding="0" cellspacing="0">
                    <tbody><tr>
                   		
                        <th style="width: 50px;">订单名</th>
                        <th style="width: 50px;">总价格</th>

                        <th style="width: 50px;">用户名</th>
                        <th style="width: 50px;">付款方式</th>
                        <th style="width: 50px;">订单状态</th>   
                        <th style="width: 50px;"></th>
						<th style="width: 50px;">:</th>  
                    </tr>
                    <c:forEach items="${userOrdersList}" var="order" varStatus="status">			
                    <tr class="odd">
                    
                        <td>${order.name}</td>
                        <td>${order.cost}</td>
                        <td><strong>${order.user.name}</strong></td> 
                        <td>${order.payWay.payStyle}</td>
                        <td>${order.status.name}</td>
                        <c:if test="${order.status.id==2}" var="ordersuccess">
							<td>交易成功</td>  
						</c:if>
						<c:if test="${!ordersuccess}">
							<td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/OrderSuccess.do?orderId=${order.id}" style="text-decoration: none;"><input value="确认收货" type="button"></a></td>
						</c:if>
						
						<td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/OrderMoreDetails.do?orderId=${order.id}" style="text-decoration: none;">>>more</a></td>     
                    	</tr>			
                     </c:forEach>			
                     
                        
                    <tr></tr>                 
                                                                                                                 
                </tbody>
               </table>
</div>
<c:if  test = "${pageController != null }" >
<table width=450 bordercolor="green" align="center">
		    
		    <tr>
		    
			<td align="center">
			<div class="pagination" style="font-size: 0.8em">
		              共有 <font color=red>${pageController.totalRowsAmount}</font> 条记录
		              共有 <font color=red>${pageController.totalPages}</font> 页
		              当前是第 <font color=red>${pageController.currentPage}</font> 页
		            ( 每页显示 <font color=red>${pageController.pageSize}</font> 条记录 )    
		              &nbsp;&nbsp;&nbsp;&nbsp;
		     </div>     
		     </td>
		    </tr>
		    <tr>
		    	<td align="center">
		    		<div class="pagination">
		    	      <c:if test="${pageController.hasNext}">
		              	<a href ="${pageContext.request.contextPath}/onlineshopping_jsp/UserOrders.do?currentPageNo=${pageController.currentPage}&toPageNo=${pageController.nextPage}"><font class='fontwhite1'>下一页</font></a>
		              </c:if>
		
		              <c:forEach var="i" begin="1" end="${pageController.totalPages}">
		              	<c:if test="${pageController.currentPage==i}" var="NotCurrentPage">
		              	<a href ="${pageContext.request.contextPath}/onlineshopping_jsp/UserOrders.do?currentPageNo=${pageController.currentPage}&toPageNo=${i}"><span class="current">${i}</span></a>
		              	</c:if>
		              	<c:if test="${!NotCurrentPage}">
		              	<a href ="${pageContext.request.contextPath}/onlineshopping_jsp/UserOrders.do?currentPageNo=${pageController.currentPage}&toPageNo=${i}">${i}</a>
		              	</c:if>
		              </c:forEach>
		
		              <c:if test="${pageController.hasPrevious}">
		              	<a href="${pageContext.request.contextPath}/onlineshopping_jsp/UserOrders.do?currentPageNo=${pageController.currentPage}&toPageNo=${pageController.previousPage}"><font class='fontwhite1'>上一页</font></a>&nbsp;&nbsp;&nbsp;&nbsp;
		              </c:if>
		              </div>
		    	</td>
		    </tr>
		   
		</table>
</c:if> 
</div>    
    <!-- end of main_content -->

<div id="footer">
	<jsp:include page="foot.jsp"></jsp:include>
</div>
</div>
<!-- end of main_container -->

</body>
</html>