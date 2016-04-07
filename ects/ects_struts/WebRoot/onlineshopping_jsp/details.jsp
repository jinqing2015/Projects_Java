<%@page pageEncoding="gbk"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="cn.com.ambow.ects.entity.*" %>
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
             	
            
        </div><!-- end of column two -->
   

   		<div class="column3">
        
            <div class="main_text_box">
            <h1>描述</h1>
            <p>
           		${product.descriptions} 
			<br /><br />          
            </p>        
        	</div>
            
          <!-- end of column three -->


		</div>
    
    	<div class="column5" style="background-color:#f3f5f6; margin-left:5px;">
    
    		  <div class="title2">商品描述                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a  href="${pageContext.request.contextPath}/onlineshopping_jsp/FindAllComment.do?productId=${product.id}" style="text-decoration: none"> 商品评价 </a>  </div> 
             <div class="title2"></div> 
            <div class="details_list">
            <ul>
            	<li><span>价格：</span>  ${product.basePrice} $ </li>
                <li><span>城市：</span>  Duis  </li>
                <li><span>销量：</span>  ${product.pages} </li>
                <li><span>阳台：</span>  ${product.publish} </li>
                <li><span>建成时间</span>${product.author}</li>
                <li><span>其他细节</span>  花园, 水池 ,后花园..</li>
            
            </ul>
            </div>
            
            <div style="float:left;">
            <div style="float:left;">
            <div class="button"><a href="${pageContext.request.contextPath}/onlineshopping_jsp/AddToCart.do?id=${product.id}">加入购物车</a></div>
            </div>
            </div>
            
            <div style="float:left; padding-left:150px;"><a href=""><img src="images/print.gif" width="28" height="28" border="0" alt="print this offer" title="print this offer" /></a>   
        	</div>
    		
    	</div>
    	
    <!-- end of main_content -->
    
<div id="footer">
	<jsp:include page="foot.jsp"></jsp:include>
</div>
<!-- end of main_container -->

</body>
</html>