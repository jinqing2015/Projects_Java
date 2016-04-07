<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
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
    	<div class="admin_index_title">������Ʒ��Ϣ��</div>
        
        <div class="right_buttons">

        
        </div>
    
    
    </div>

    
    
    	
<div class="table_grid">
                <table cellspacing="0" cellpadding="0">
                    <tr>
                   		<th style="width: 60px;">ѡ���</th>
                        <th style="width: 60px;">��ʶ��</th>
                        <th style="width:50px;">ͼƬ</th>
                        <th style="width:50px;">����</th>
                        <th style="width:100px;">����</th>
                        <th style="width:60px;">����</th>
                        <th style="width:60px;">����</th>
                        <th style="width:60px;"></th>                 
                    </tr>
                    <c:forEach items="${orderLines}" var="orderLine" varStatus="status">
                    <tr class="even">
                    	<td><input type="checkbox" name="checkbox" /></td>
                    	
                        <td>${orderLine.product.id}</td>
                        <td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${orderLine.product.id}"><img src="${orderLine.product.images }" width="53" height="39" border="0" /></a></td>
                        <td>${orderLine.product.name }</td>
                        <td>${orderLine.product.descriptions }</td>
                        <td><strong>${orderLine.product.basePrice }$;</strong></td>
                        <td>${orderLine.amount }</td>
                        <td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/TurnToComment.do?productId=${orderLine.product.id}" style="text-decoration: none">�������</a></td>
                    </tr>  
                    </c:forEach>
                   		                                                                                          
                </table>
          <div class="admin_index_title">������Ϣ��</div>        
                <table cellpadding="0" cellspacing="0">
                    <tbody><tr>
                   		
                        <th style="width: 50px;">������</th>
                        <th style="width: 50px;">�ܼ۸�</th>
                        <th style="width: 50px;">�û�</th>
                        <th style="width: 50px;">�û��绰</th>
                        <th style="width: 50px;">���ʽ</th>
                        <th style="width: 50px;">����״̬</th>    
                        <th style="width: 50px;">ȷ���ջ�</th>
 
                    </tr>
                    			
                    <tr class="odd">
                    
                        <td>${order.name}</td>
                        <td>${order.cost }</td>
                        <td>${order.user.name}</td>
                        <td>${order.user.info.cellPhone}</td>
						<td>${order.payWay.payStyle}</td>
						<td>${order.status.name}</td>
						<c:if test="${order.status.id==2}" var="ordersuccess">
							<td>���׳ɹ�</td>  
						</c:if>
						<c:if test="${!ordersuccess}">
							<td><a href="${pageContext.request.contextPath}/onlineshopping_jsp/OrderSuccess.do?orderId=${order.id}"><input value="ȷ���ջ�" type="button"></a></td>
						</c:if>           
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