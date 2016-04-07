<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html >
<head>
<meta http-equiv="Content-Type" content="text/jsp; charset=gbk" />
<title>主页</title>
<link rel="stylesheet" type="text/css" href="style.css" />

</head>
<body>
<div id="main_container">
<div id="header">
	<div>
	<jsp:include page="head.jsp"></jsp:include>
	</div>
</div>
     
    <div id="main_content">
    	<!-- categorybox.jsp -->
    	<jsp:include page="categorybox.jsp"></jsp:include>
    	<!-- end of column one -->
   
   		<div class="column2">
            <div class="small_title">活动专区</div> 

            	<jsp:include page="pictureChange.jsp"></jsp:include>
 
        </div><!-- end of column two -->
   




   		<div class="column3">
        	<div class="small_title">最新别墅</div> 
            
            <c:forEach items="${productListLast}" var="product" varStatus="status">
            
           		<div class="offer_box">
            		<a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${product.id}"><img src="${product.images }" width="130" height="98" class="img_left" alt="" title="" border="0"/></a>
	                <div class="offer_info">
	                <span>For Sale  ${product.basePrice} $</span>
	                <p class="offer">
	                	${product.descriptions}             
	                </p>
	                <div class="more"><a href="/ects/onlineshopping_jsp/Detials.qd?id=${product.id}">...more</a></div>
	                </div>
            	</div>
            </c:forEach>
            
        </div><!-- end of column three -->





		<div class="column4">
        
        <div class="title">特价别墅</div> 
        	<c:forEach items="${productListSale}" var="product" varStatus="status" >
             <div class="offer_box_wide">
              		<a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${product.id}"><img src="${product.images }" width="130" height="98" class="img_left" alt="" title="" border="0"/></a>
	                <div class="offer_info">
	                <span>For Sale  ${product.basePrice} $</span>
	                <p class="offer">
	                	${product.descriptions}             
	                </p>
	                <div class="more"><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${product.id}">...more</a></div>
	                </div>
            </div>
            
            </c:forEach>
               
  
        </div><!-- end of column four -->	


   

	</div>
    <!-- end of main_content -->
    
<div id="footer">

	<jsp:include page="foot.jsp"></jsp:include>

</div>

</div>

<!-- end of main_container -->

</body>
</html>