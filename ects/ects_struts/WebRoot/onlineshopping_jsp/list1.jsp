<%@page pageEncoding="gbk"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html >
<head>
<meta http-equiv="Content-Type" content="text/jsp; charset=gbk" />
<title>BuildUp Real Estate</title>
<link rel="stylesheet" type="text/css" href="style.css" />

</head>
<body>
<div id="main_container">

<div id="header">
	<jsp:include page="head.jsp"></jsp:include>
</div>
    

    
    <div id="main_content"> 
    	<!-- categorybox.jsp -->
    	<jsp:include page="categorybox.jsp"></jsp:include>
    	<!-- end of column one -->
   
   	
		<div class="column4">
        
        <div class="title" style="float:left;">
        	<div style="float:left;">豪华别墅</div>
        	<div style="float:right; font-size:10px;color:#d8325d;padding-top:2px;">display: 
           
            <a href="${pageContext.request.contextPath}/onlineshopping_jsp/ProductList.do?categoryId=1"><img src="images/list_style1.gif" border="0" /></a>
            <a href="${pageContext.request.contextPath}/onlineshopping_jsp/ProductList.do?categoryId=2"><img src="images/list_style2_a.gif" border="0" /></a>
            </div>
        	</div> 
        	 <c:forEach items="${productList}" var="product" varStatus="status">
             <div class="offer_box_wide">
            	<a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${product.id}"><img src="${product.images}" width="130" height="98" class="img_left" alt="" title="" border="0"/></a>
                <div class="offer_info">
                <span>For Sale  ${product.basePrice} $</span>
                <p class="offer">
               		${product.descriptions}          
                </p>
                <div class="more"><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=${product.id}">...more</a></div>
                </div>
            </div>
			</c:forEach>
            <div class="pagination">
            <span class="disabled">pre</span><span class="current">1</span><a href="">2</a><a href="">3</a><a href="">4</a><a href="#?page=3">5</a><a href="#?page=3">6</a><a href="#?page=3">7</a><a href="#">10</a><a href="#?page=200">11</a><a href="#?page=2">next</a>
            </div> 
   
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