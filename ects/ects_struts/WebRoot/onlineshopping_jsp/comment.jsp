<%@page pageEncoding="gbk"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html >
<head>
<title>BuildUp Real Estate</title>
<link rel="stylesheet" type="text/css" href="style_details.css" />

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
        <div class="title">${product.name} </div> 
        	
     
        </div><!-- end of column four -->       
        
   
   		<div class="column2" style="background-color:#f3f5f6; margin-left:5px;">
        
        	<div class="big_pic"><img src="${product.images}" width="282" height="212" alt="" title="" class="img_big_pic" /></div>
            
            </div>
             	
            
        <!-- end of column two -->
   

   		<div class="column3">
        
            <div class="main_text_box">
            <h1>描述</h1>
            <p>
           		${product.descriptions} 
			<br /><br />          
            </p>        
        	</div>
           </div> 
           
          <!-- end of column three -->


		
    
    	<div class="column5" style="background-color:#f3f5f6; margin-left:5px;">
    
    		  <div class="title2"><a href="${pageContext.request.contextPath}/onlineshopping_jsp/details.jsp" style="text-decoration: none">商品描述   </a>               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a  href="${pageContext.request.contextPath}/onlineshopping_jsp/FindAllComment.do?productId=${product.id}" style="text-decoration: none">   商品评价 </a>  </div> 
         <table > 
         	<tr>
         		<td>用户名</td>
         		<td width = 400>评论</td>
         	</tr>
         <c:forEach items="${commentList}" var="comment" varStatus="status">
          	
          	<tr>
          		<td> ${comment.userName}:</td>
          		<td width = 400> ${comment.comment}</td>
          		
          		
          	</tr>
          
         </c:forEach>
         </table>   
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