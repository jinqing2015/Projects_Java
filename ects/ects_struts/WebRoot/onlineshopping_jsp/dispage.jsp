<%@page contentType="text/html;charset=GBK"%>
<%@page pageEncoding="GBK"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*" %>



<table width=450 class="fontwhite"  bordercolor="green" align="center">
    <tr>
	<td align="center">
	<div class="pagination" style="font-size: 0.8em">
              ���� <font color=red>${pageController.totalRowsAmount}</font> ����¼
              ���� <font color=red>${pageController.totalPages}</font> ҳ
              ��ǰ�ǵ� <font color=red>${pageController.currentPage}</font> ҳ
            ( ÿҳ��ʾ <font color=red>${pageController.pageSize}</font> ����¼ )    
              &nbsp;&nbsp;&nbsp;&nbsp;
       </div>     
       </td>
    </tr>
    <tr>
    	<td align="center">
    		<div class="pagination">
    	      <c:if test="${pageController.hasNext}">
              	<a href ="${pageContext.request.contextPath}/onlineshopping_jsp/FindAll.do?currentPageNo=${pageController.currentPage}&toPageNo=${pageController.nextPage}"><font class='fontwhite1'>��һҳ</font></a>
              </c:if>

              <c:forEach var="i" begin="1" end="${pageController.totalPages}">
              	<c:if test="${pageController.currentPage==i}" var="NotCurrentPage">
              	<a href ="${pageContext.request.contextPath}/onlineshopping_jsp/FindAll.do?currentPageNo=${pageController.currentPage}&toPageNo=${i}"><span class="current">${i}</span></a>
              	</c:if>
              	<c:if test="${!NotCurrentPage}">
              	<a href ="${pageContext.request.contextPath}/onlineshopping_jsp/FindAll.do?currentPageNo=${pageController.currentPage}&toPageNo=${i}">${i}</a>
              	</c:if>
              </c:forEach>

              <c:if test="${pageController.hasPrevious}">
              	<a href="${pageContext.request.contextPath}/onlineshopping_jsp/FindAll.do?currentPageNo=${pageController.currentPage}&toPageNo=${pageController.previousPage}"><font class='fontwhite1'>��һҳ</font></a>&nbsp;&nbsp;&nbsp;&nbsp;
              </c:if>
              </div>
    	</td>
    </tr>
</table>