<%@page pageEncoding="gbk"%>
<%@page import="cn.com.ambow.ects.entity.*" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

       <div id="logo">
        <a href="index.jsp"><img src="images/logo.gif" width="147" height="78" alt="" title="" border="0" /></a>
       </div>
           
       <div class="banner_adds"></div>    


<div class="menu">

<ul>
<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/index.jsp"><strong><font size=2.8em> 主 页 </font></strong></a></li>
<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/ShopCart.do"><strong><font size=2.8em> &nbsp;&nbsp;购 物 车  </font></strong></a></li>


<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/aboutus.jsp"><strong> <font size=2.8em>  &nbsp;&nbsp;关 于 我 们</font></strong></a></li>
<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/register.jsp"><strong> <font size=2.8em>  &nbsp;&nbsp;注 册</font></strong></a></li>
<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/FindAll.do"><strong><font size=2.8em> 商 品 别 墅 </font></strong></a>
	<ul>
	<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/ProductList.do?categoryId=1" title=""><strong><font size=2.8em> 豪 华 别 墅 </font></strong></a></li>
	<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/ProductList.do?categoryId=2" title=""><strong><font size=2.8em>休 闲 别 墅 </font></strong></a></li>
	<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/ProductList.do?categoryId=1" title=""><strong><font size=2.8em>普 通 别 墅 </font></strong></a></li>
	<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/ProductListForSale.do" title=""><strong><font size=2.8em>销量排名 </font></strong></a></li>
	</ul>
</li>
<li>
<c:if test="${!empty user}" var="hasUser">
	<strong> <font size=2.8em color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;hello,${user.name}</font></strong>
	<ul>
	<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/UserOrders.do"><strong> <font size=2.8em>我的账户 </font></strong></a></li>
	<li><a href="lookup.jsp"><strong> <font size=2.8em>查 看 个 人 信 息 </font></strong></a></li>
	<li><a href="modify.jsp"><strong> <font size=2.8em>修 改 个 人 信 息 </font></strong></a></li>
	<li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Logout.do">	<strong> <font size=2.8em>退出</font></strong></a></li>
	</ul>
</c:if>
<c:if test="${!hasUser}">
	<a href="${pageContext.request.contextPath}/onlineshopping_jsp/login.jsp"><strong> <font size=2.8em>登 录</font></strong></a>
</c:if>


</li>
</ul>

</div>
