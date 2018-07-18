<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<t:layout title="手机列表">

	<ul>
		<c:forEach items="${cellphones}" var="cellphone">
			<li>#${cellphone.id} </li>
			<li><a href="${contextPath}/cellphone/cellphone-details/${cellphone.id}">${cellphone.brand}</a></li>
		</c:forEach>
	</ul>
	<button type="submit"><a href="${contextPath}/cellphone/add">添加</a></button>
</t:layout>