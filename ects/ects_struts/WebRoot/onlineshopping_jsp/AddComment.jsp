<%@page pageEncoding="gbk"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
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
		<div class="column4">
        <div class="title">评论  </div></div> 
    	<div class="column5" style="background-color:#f3f5f6; ">
    	    

    				<form action="${pageContext.request.contextPath}/onlineshopping_jsp/AddComment.do?id=${product.id}" method="post"> 
    					<table>
    						<tr>
    						
    						</tr>
    						<tr>
    							<textarea rows="100" cols="70"  name="comment"></textarea>
    						</tr>
    						<tr>
    							<input type="submit" value="提交评论" align = "center"/>
    						</tr>
    					</table>
    				</form>
 
    	</div>
    	
    <!-- end of main_content -->
    
<div id="footer">
	<jsp:include page="foot.jsp"></jsp:include>
</div>
</div>
<!-- end of main_container -->

</body>
</html>