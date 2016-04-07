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
            <h1>����</h1>
            <p>
           		${product.descriptions} 
			<br /><br />          
            </p>        
        	</div>
            
          <!-- end of column three -->


		</div>
    
    	<div class="column5" style="background-color:#f3f5f6; margin-left:5px;">
    
    		  <div class="title2">��Ʒ����                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a  href="${pageContext.request.contextPath}/onlineshopping_jsp/FindAllComment.do?productId=${product.id}" style="text-decoration: none"> ��Ʒ���� </a>  </div> 
             <div class="title2"></div> 
            <div class="details_list">
            <ul>
            	<li><span>�۸�</span>  ${product.basePrice} $ </li>
                <li><span>���У�</span>  Duis  </li>
                <li><span>������</span>  ${product.pages} </li>
                <li><span>��̨��</span>  ${product.publish} </li>
                <li><span>����ʱ��</span>${product.author}</li>
                <li><span>����ϸ��</span>  ��԰, ˮ�� ,��԰..</li>
            
            </ul>
            </div>
            
            <div style="float:left;">
            <div style="float:left;">
            <div class="button"><a href="${pageContext.request.contextPath}/onlineshopping_jsp/AddToCart.do?id=${product.id}">���빺�ﳵ</a></div>
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