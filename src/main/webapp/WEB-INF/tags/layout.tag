<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 

<%@ attribute name="css" fragment="true" %>
<%@ attribute name="title" required="true" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>${title}</title>
	<jsp:invoke fragment="css"/>
</head>

<body>
	<div class="header">
	<a href="${contextPath}/cellphone/cellphone-List">手机列表</a>
	<a href="${contextPath}/cellphone/add">添加手机</a>
	</div>
	
	<div class="content">
    <h1>${title}</h1>
    <jsp:doBody />
  	</div>
  	
  	<div class="footer">copyright 2018</div>


</body>
</html>