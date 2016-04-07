<%@page pageEncoding="gbk"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html >

<head>
<title>注册</title>
<link rel="stylesheet" type="text/css" href="style_register.css" />
<link rel="stylesheet" type="text/css" href="admin.css" />
<script type="text/javascript">
		var XMLHttpReq = false;
	    //创建XMLHttpRequest对象       
	    function createXMLHttpRequest() {
	  		if(window.XMLHttpRequest) { //Mozilla 浏览器
	   			XMLHttpReq = new XMLHttpRequest();
	  		}
	  		else if (window.ActiveXObject) { // IE浏览器
	  			 XMLHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	  		} 
		}
		
		//发送请求函数
	 	function sendRequest(url) {
	 
			createXMLHttpRequest();
			XMLHttpReq.open("POST", url, true);
		  	XMLHttpReq.onreadystatechange = processResponse;//指定响应函数
		 
			XMLHttpReq.send(null);  // 发送请求
	 	}
	 	// 处理返回信息函数
	    function processResponse() {

	     	if(XMLHttpReq.readyState == 4) { // 判断对象状态
	        	if (XMLHttpReq.status == 200) { // 信息已经成功返回，开始处理信息
	            	var res=XMLHttpReq.responseText;
	            	var tip1=document.getElementById("tip1");
	            	tip1.innerHTML=res;            	
	            } 
	            else { //页面不正常
	            	window.alert("您所请求的页面有异常。");
	            }
	        }
	    }
	 	//身份验证函数
	    function onTextChange() {

	  		var username = document.getElementById("name").value;
		
	  		if(username==="") {	
	  			
	  			var tip1=document.getElementById("tip1");	
	   			tip1.innerHTML="用户名不能为空";
	   			username.focus();
	  		}
	  		else {
	  	//alert(1);
	   			sendRequest('../onlineshopping_jsp/service.jsp?username='+ encodeURIComponent(username));
	  		}
		}  
		function samePassword(){
	
		var password  = document.getElementById("password").value;
		var password1 = document.getElementById("newpassword").value;
			
		if(password!==password1){
			
			var tip2=document.getElementById("tip2");		
	   		tip2.innerHTML="两次输入的密码不一致";
		}
		else{
		
			var tip2=document.getElementById("tip2");	
	   	
	   		tip2.innerHTML="";
		}
	}	
		function Oncellphone(){
		
			var cellphone  = document.getElementById("cellphone").value;
			
			if(cellphone.length!=11){
		
				var tip3=document.getElementById("tip3");	
	   		
	   			tip3.innerHTML="您的号码必须为11位";			
			}else{
				var tip3=document.getElementById("tip3");	
	   		
	   			tip3.innerHTML="";			
			}
		
		
		}
	
		
</script>

</head>
<body>
<div id="main_container">
<div id="header">
	<jsp:include page="head.jsp"></jsp:include>
</div>
</div>  
    <div id="main_content">
   
    <div id="admin_header">
   		<div class="admin_editoffer_title"><span class="title_icon"></span>注册</div>
        
        <div class="right_buttons">
        
        </div>
   
    </div>
    <div id="admin_header_border"></div>
    

    	<div class="center_content">
         <div class="contact_form">
                <div class="form_subtitle">注册表</div>
                 <form action="${pageContext.request.contextPath}/onlineshopping_jsp/Register.do" name="register" method="post">          
                    <div class="form_row">
                    <label class="contact"><strong>用户名:</strong></label>
                    <input class="contact_input" type="text" id="name" name="name" onchange = "onTextChange()">
                     <label id="tip1" align="center"><strong></strong></label> 
                    </div>  


                    <div class="form_row">
                    <label class="contact"><strong>密码:</strong></label>
                    <input class="contact_input" type="password" id="password" name="password">
                    </div> 
                    
                    <div class="form_row">
                    <label class="contact"><strong>确认密码:</strong></label>
                    <input class="contact_input" type="password" id="newpassword" name="newpassword" onchange = "samePassword()">
                    <label id="tip2" align="center"><strong></strong></label> 
                    </div> 

                    <div class="form_row">
                    <label class="contact"><strong>手机号码:</strong></label>
                    <input class="contact_input" type="text" name="cellphone" id="cellphone" onchange = "Oncellphone()">
                     <label id="tip3" align="center"><strong></strong></label> 
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>家庭电话:</strong></label>
                    <input class="contact_input" type="text" name="homephone">
                    </div>

                    <div class="form_row">
                    <label class="contact"><strong>公司电话:</strong></label>
                    <input class="contact_input" type="text" name="officephone">
                    </div>

                    <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input class="contact_input" type="text" name="email">
                    </div>    
                    
                    <div class="form_row">
                    <label class="contact"><strong>国家:</strong></label>
                    <select class="form_select" name="country">
                    	<option selected="selected" value=1>中国</option>
                    </select>
                    </div>      
                    
                    <div class="form_row">
                    <label class="contact"><strong>省份:</strong></label>
                    <select class="form_select" name="province">
                    	<option selected="selected" value="35">其他</option>
                    	<option value=1>安徽</option>
                        <option value=2>北京</option>
                        <option value=3>重庆</option>
                        <option value=4>福建</option>
                        <option value=5>广东</option>
                        <option value=6>甘肃</option>
                        <option value=7>广西</option>
                        <option value=8>贵州</option>
                        <option value=9>河南</option>
                        <option value=10>湖北</option>
                        <option value=11>河北</option>
                        <option value=12>海南</option>
                        <option value=13>香港</option>
                        <option value=14>黑龙江</option>
                        <option value=15>湖南</option>
                        <option value=16>吉林</option>
                        <option value=17>江苏</option>
                        <option value=18>江西</option>
                        <option value=19>辽宁</option>
                        <option value=20>澳门</option>
                        <option value=21>内蒙古</option>
                        <option value=22>宁夏</option>
                        <option value=23>青海</option>
                        <option value=24>四川</option>
                        <option value=25>山东</option>
                        <option value=26>上海</option>
                        <option value=27>陕西</option>
                        <option value=28>山西</option>
                        <option value=29>天津</option>
                        <option value=30>台湾</option>
                        <option value=31>新疆</option>
                        <option value=32>西藏</option>
                        <option value=33>云南</option>
                        <option value=34>浙江</option>
                        
                    </select>
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>城市:</strong></label>
                    <input class="contact_input" type="text" name="city">
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>street1:</strong></label>
                    <input class="contact_input" type="text" name="street1">
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>street2:</strong></label>
                    <input class="contact_input" type="text" name="street2">
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>邮编:</strong></label>
                    <input class="contact_input" type="text" name="zip">
                    </div>
                              

                    <div class="form_row">
                        <div class="terms">
                        <input name="terms" type="checkbox" value=1>我同意该公司安全协议
                        </div>
                    </div> 
                    <div class="form_row">
						<html:errors/>
                    </div>   
                    <div class="form_row">
                    <input type="submit" class="register" value="注册" >
                    </div>
                      
                  </form>
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