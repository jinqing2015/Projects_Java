<%@page pageEncoding="gbk"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html >

<head>
<title>ע��</title>
<link rel="stylesheet" type="text/css" href="style_register.css" />
<link rel="stylesheet" type="text/css" href="admin.css" />
<script type="text/javascript">
		var XMLHttpReq = false;
	    //����XMLHttpRequest����       
	    function createXMLHttpRequest() {
	  		if(window.XMLHttpRequest) { //Mozilla �����
	   			XMLHttpReq = new XMLHttpRequest();
	  		}
	  		else if (window.ActiveXObject) { // IE�����
	  			 XMLHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	  		} 
		}
		
		//����������
	 	function sendRequest(url) {
	 
			createXMLHttpRequest();
			XMLHttpReq.open("POST", url, true);
		  	XMLHttpReq.onreadystatechange = processResponse;//ָ����Ӧ����
		 
			XMLHttpReq.send(null);  // ��������
	 	}
	 	// ��������Ϣ����
	    function processResponse() {

	     	if(XMLHttpReq.readyState == 4) { // �ж϶���״̬
	        	if (XMLHttpReq.status == 200) { // ��Ϣ�Ѿ��ɹ����أ���ʼ������Ϣ
	            	var res=XMLHttpReq.responseText;
	            	var tip1=document.getElementById("tip1");
	            	tip1.innerHTML=res;            	
	            } 
	            else { //ҳ�治����
	            	window.alert("���������ҳ�����쳣��");
	            }
	        }
	    }
	 	//�����֤����
	    function onTextChange() {

	  		var username = document.getElementById("name").value;
		
	  		if(username==="") {	
	  			
	  			var tip1=document.getElementById("tip1");	
	   			tip1.innerHTML="�û�������Ϊ��";
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
	   		tip2.innerHTML="������������벻һ��";
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
	   		
	   			tip3.innerHTML="���ĺ������Ϊ11λ";			
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
   		<div class="admin_editoffer_title"><span class="title_icon"></span>ע��</div>
        
        <div class="right_buttons">
        
        </div>
   
    </div>
    <div id="admin_header_border"></div>
    

    	<div class="center_content">
         <div class="contact_form">
                <div class="form_subtitle">ע���</div>
                 <form action="${pageContext.request.contextPath}/onlineshopping_jsp/Register.do" name="register" method="post">          
                    <div class="form_row">
                    <label class="contact"><strong>�û���:</strong></label>
                    <input class="contact_input" type="text" id="name" name="name" onchange = "onTextChange()">
                     <label id="tip1" align="center"><strong></strong></label> 
                    </div>  


                    <div class="form_row">
                    <label class="contact"><strong>����:</strong></label>
                    <input class="contact_input" type="password" id="password" name="password">
                    </div> 
                    
                    <div class="form_row">
                    <label class="contact"><strong>ȷ������:</strong></label>
                    <input class="contact_input" type="password" id="newpassword" name="newpassword" onchange = "samePassword()">
                    <label id="tip2" align="center"><strong></strong></label> 
                    </div> 

                    <div class="form_row">
                    <label class="contact"><strong>�ֻ�����:</strong></label>
                    <input class="contact_input" type="text" name="cellphone" id="cellphone" onchange = "Oncellphone()">
                     <label id="tip3" align="center"><strong></strong></label> 
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>��ͥ�绰:</strong></label>
                    <input class="contact_input" type="text" name="homephone">
                    </div>

                    <div class="form_row">
                    <label class="contact"><strong>��˾�绰:</strong></label>
                    <input class="contact_input" type="text" name="officephone">
                    </div>

                    <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input class="contact_input" type="text" name="email">
                    </div>    
                    
                    <div class="form_row">
                    <label class="contact"><strong>����:</strong></label>
                    <select class="form_select" name="country">
                    	<option selected="selected" value=1>�й�</option>
                    </select>
                    </div>      
                    
                    <div class="form_row">
                    <label class="contact"><strong>ʡ��:</strong></label>
                    <select class="form_select" name="province">
                    	<option selected="selected" value="35">����</option>
                    	<option value=1>����</option>
                        <option value=2>����</option>
                        <option value=3>����</option>
                        <option value=4>����</option>
                        <option value=5>�㶫</option>
                        <option value=6>����</option>
                        <option value=7>����</option>
                        <option value=8>����</option>
                        <option value=9>����</option>
                        <option value=10>����</option>
                        <option value=11>�ӱ�</option>
                        <option value=12>����</option>
                        <option value=13>���</option>
                        <option value=14>������</option>
                        <option value=15>����</option>
                        <option value=16>����</option>
                        <option value=17>����</option>
                        <option value=18>����</option>
                        <option value=19>����</option>
                        <option value=20>����</option>
                        <option value=21>���ɹ�</option>
                        <option value=22>����</option>
                        <option value=23>�ຣ</option>
                        <option value=24>�Ĵ�</option>
                        <option value=25>ɽ��</option>
                        <option value=26>�Ϻ�</option>
                        <option value=27>����</option>
                        <option value=28>ɽ��</option>
                        <option value=29>���</option>
                        <option value=30>̨��</option>
                        <option value=31>�½�</option>
                        <option value=32>����</option>
                        <option value=33>����</option>
                        <option value=34>�㽭</option>
                        
                    </select>
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>����:</strong></label>
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
                    <label class="contact"><strong>�ʱ�:</strong></label>
                    <input class="contact_input" type="text" name="zip">
                    </div>
                              

                    <div class="form_row">
                        <div class="terms">
                        <input name="terms" type="checkbox" value=1>��ͬ��ù�˾��ȫЭ��
                        </div>
                    </div> 
                    <div class="form_row">
						<html:errors/>
                    </div>   
                    <div class="form_row">
                    <input type="submit" class="register" value="ע��" >
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